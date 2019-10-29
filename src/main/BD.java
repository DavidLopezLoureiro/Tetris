package main;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.Usuario;
import main.BD;

public class BD {
	private static Exception lastError = null;
	public static Logger log;

	/**
	 * Añadir situacion reciente de la BD.
	 * 
	 * @param logger --> mensajes de log de la BD.
	 * 
	 */
	public static void setLogger(Logger logger) {
		BD.log = logger;
	}

	/**
	 * Guarda lo que ha ocurrido en la BD en esa sesión en un logger.
	 * 
	 * @param level     --> nivel del log.
	 * 
	 * @param msg       --> mensaje del log.
	 * 
	 * @param excepcion --> excepciones que ocurren.
	 * 
	 * @exception Exception fallo que ocurre al realizar el log.
	 * 
	 */
	private static void log(Level level, String msg, Throwable excepcion) {
		if (log == null) { // Logger por defecto local:
			log = Logger.getLogger(BD.class.getName()); // Nombre del logger de la clase
			log.setLevel(Level.ALL); // Loguea todos los niveles
			try {
				log.addHandler(new FileHandler("bd.log.xml", true)); // Y saca el log a fichero xml
			} catch (Exception e) {
				log.log(Level.SEVERE, "No se pudo crear fichero de log", e);
			}
		}
		if (excepcion == null)
			log.log(level, msg);
		else
			log.log(level, msg, excepcion);
	}

	/**
	 * Inicia la conexion con la BD.
	 * 
	 * @return con --> conexion con la BD.
	 * 
	 * @exception ClassNotFoundException no encuentra la clase.
	 * 
	 * @exception SQLException           fallo relacionado con SQL.
	 * 
	 */
	public static Connection iniciar() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conexion = DriverManager.getConnection("jdbc:sqlite:Tetris.db");
			return conexion;
		} catch (ClassNotFoundException | SQLException e) {
			lastError = e;
			log(Level.SEVERE, "Error en uso de base de datos", e);
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Obtiene la ultima excepcion.
	 * 
	 * @return lastError --> ultimo error ocurrido.
	 * 
	 */
	public static Exception getLastError() {
		return lastError;
	}

	/**
	 * Inserta un usuario a la BD.
	 * 
	 * @param st      --> tabla donde creara el usuario.
	 * 
	 * @param u       --> usuario que introducira en la BD.
	 * 
	 * @param cod_usu --> codigo del usuario que se va a introducir.
	 * 
	 * @exception SQLException fallo relacionado con SQL.
	 * 
	 */
	public static void insertarUsuarios(Statement st, Usuario u, int cod_usu) {
		String sentSQL = "";

		try {
			sentSQL = "insert into Usuario values('" + cod_usu + "'" + ",'" + secu(u.getNombre()) + "'," + "'"
					+ secu(u.getContra()) + "'," + u.getMaxPuntu() + "," + cod_usu + u.getEmail() + ")";
			int val = st.executeUpdate(sentSQL);

		} catch (SQLException e) {
			lastError = e;
			log(Level.SEVERE, "Error en al insertar datos en la base de datos", e);
			e.printStackTrace();
		}

	}

	/**
	 * Concatena los caracteres que seran permitidos y los que no sean permitidos no
	 * los guardara.
	 * 
	 * @param string --> String que queremos evaluar.
	 * 
	 * @return ret.toString() --> String un vez evaluado los caracteres.
	 * 
	 */
	private static String secu(String string) {
		StringBuffer ret = new StringBuffer();
		for (char c : string.toCharArray()) {
			if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½.,:;-_(){}[]-+*=<>'\"ï¿½?ï¿½!&%$@#/\\0123456789"
					.indexOf(c) >= 0)
				ret.append(c);
		}
		return ret.toString();
	}

	/**
	 * Obtiene los usuarios de la BD y los devuelve en un ArrayList.
	 * 
	 * @param con --> conexion con la BD.
	 * 
	 * @param st  --> tabla Usuarios de donde sacara la informacion.
	 * 
	 * @exception SQLException error al intentar sacar el ArrayList de usuarios.
	 * 
	 * @return devolver --> ArrayList de usuarios de la BD.
	 * 
	 */
	public static ArrayList<Usuario> cargaUsuario(Connection con, Statement st) {
		String sentSQL = "";
		ArrayList<Usuario> devolver = new ArrayList<>();
		try {
			sentSQL = "select * from Usuario";
			ResultSet rs = st.executeQuery(sentSQL);
			while (rs.next()) {
				Usuario usua = new Usuario(rs.getString("nombre"), rs.getString("contra"), rs.getInt("MaxPuntu"),
						rs.getString("email"));
				devolver.add(usua);
			}
			rs.close();
			return devolver;
		} catch (SQLException e) {
			lastError = e;
			log(Level.SEVERE, "erro en la lectura de la base de datos", e);
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Metodo para crear tablas. (Esta preparado para que si la tabla a crear ya
	 * existe no de error sino que avise por consola de que la tabla ya existe.)
	 * 
	 * @param con --> conexion con la BD.
	 * 
	 * @exception SQLException fallo relacionado con SQL.
	 * 
	 * @return st --> Statement de la tabla.
	 * 
	 */
	public static Statement crearTabla(Connection con) {

		try {
			Statement statement = con.createStatement();
			statement.setQueryTimeout(30);
			statement.executeUpdate("create table Usuario " + "( id integer not null primary key AUTOINCREMENT ,"
					+ "nombre text ," + "contra text ," + "MaxPuntu numeric ," + "email text ) ");
		} catch (SQLException e) {
			if (!e.getMessage().contains("table Usuario already exists")) {
				lastError = e;
				log(Level.SEVERE, "ya ha sido creada la tabla usuario", e);
			} else {

				//
				//System.out.println("La tabla usuario ya existe.");
				//
			}

		}
		return null;

	}

	/**
	 * Buscar la ID de un usuario.
	 * 
	 * @param con    --> conexion con la BD.
	 * 
	 * @param st     --> tabla Usuarios de donde sacara la informacion.
	 * 
	 * @param nombre --> nombre del usuario que buscamos.
	 * 
	 * @exception SQLException fallo relacionado con SQL. PONERLO PARA QUE DISTINGA
	 *                         ENTRE FALLO GENERAL Y FALLO DE QUE EL USUARIO BUSCADO
	 *                         NO EXISTE.
	 * 
	 * @return ID --> ID del usuario (int). 
	 * 
	 */
	public static int idUsuario(Connection con, Statement st, String nombre) {
		String mensaje = "select id from Usuario where nombre = '" + nombre + "'";
		try {
			
			ResultSet rs = st.executeQuery(mensaje);
			
			return rs.getInt("id");

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return 0;
	}
	
	
	/**
	 * Buscar la contraseña de un usuario.
	 * 
	 * @param con    --> conexion con la BD.
	 * 
	 * @param st     --> tabla Usuarios de donde sacara la informacion.
	 * 
	 * @param nombre --> nombre del usuario que buscamos.
	 * 
	 * @exception SQLException fallo relacionado con SQL. PONERLO PARA QUE DISTINGA
	 *                         ENTRE FALLO GENERAL Y FALLO DE QUE EL USUARIO BUSCADO
	 *                         NO EXISTE.
	 * 
	 * @return ID --> contraseña del usuario (String). 
	 * 
	 */
	public static String contUsuario(Connection con, Statement st, String nombre) {
		String mensaje = "select contra from Usuario where nombre = '" + nombre + "'";
		try {
			
			ResultSet rs = st.executeQuery(mensaje);
			
			return rs.getString("contra");

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return null;
	}

	
	/**
	 * Buscar un usuario.
	 * 
	 * @param con    --> conexion con la BD.
	 * 
	 * @param st     --> tabla Usuarios de donde sacara la informacion.
	 * 
	 * @param nombre --> nombre del usuario que buscamos.
	 * 
	 * @exception SQLException fallo relacionado con SQL. PONERLO PARA QUE DISTINGA
	 *                         ENTRE FALLO GENERAL Y FALLO DE QUE EL USUARIO BUSCADO
	 *                         NO EXISTE.
	 * 
	 * @return ID -->  usuario. 
	 * 
	 */
	public static Usuario getUsuario(Connection con, Statement st, String nombre) {
		String mensaje = "select * from Usuario where nombre = '" + nombre + "'";
		try {
			
			ResultSet rs = st.executeQuery(mensaje);
			
			Usuario usuario = new Usuario(rs.getString("nombre"),rs.getString("contra"),rs.getString("email"));
			
			return usuario;

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return null;
	}
	
	
	/**
	 * Buscar la ID de un usuario.
	 * 
	 * @param con --> conexion con la BD.
	 * 
	 * @param st  --> tabla Usuarios.
	 * 
	 * @exception SQLException fallo relacionado con SQL.
	 * 
	 */
	public static void cerrarBD(Connection con, Statement st) {
		try {
			if (st != null)
				st.close();
			if (con != null)
				con.close();
			System.out.println("se ha cerrado la base de datos");
		} catch (SQLException e) {
			lastError = e;
			log(Level.SEVERE, "error al cerrar la base de datos", e);
			e.printStackTrace();
		}
	}
}
