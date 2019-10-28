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

public class BD{
	private static Exception lastError = null; 
	public static Logger log;
	//a�adir situacion reciente de la base de datos
	public static void setLogger( Logger logger ) {
		BD.log = logger;
	}
	
	private static void log( Level level, String msg, Throwable excepcion ) {
		if (log==null) {  // Logger por defecto local:
			log = Logger.getLogger( BD.class.getName() );  // Nombre del logger  de la clase
			log.setLevel( Level.ALL );  // Loguea todos los niveles
			try {
				log.addHandler( new FileHandler( "bd.log.xml", true ) );  // Y saca el log a fichero xml
			} catch (Exception e) {
				log.log( Level.SEVERE, "No se pudo crear fichero de log", e );
			}
		}
		if (excepcion==null)
			log.log( level, msg );
		else
			log.log( level, msg, excepcion );
	}
	
	/**
	 *Inicia la conexion con la BD
	 * 
	 * @return con (conexion con la BD) 
	 */
	public static Connection iniciar() {
		try {
		    Class.forName("org.sqlite.JDBC");
		    Connection conexion = DriverManager.getConnection("jdbc:sqlite:Tetris.db");
		System.out.println("ha entrado");
		    return conexion;
		} catch (ClassNotFoundException | SQLException e) {
			lastError = e;
			log( Level.SEVERE, "Error en uso de base de datos", e );
			e.printStackTrace();
			return null;
		}
	}
	//para ontener la ultima excepion
	public static Exception getLastError() {
		return lastError;
	}
	//los correpsondientes insert
		public static void insertarUsuarios(Statement state,Usuario u,int i) {
			String sentSQL="";
			
			try {
				sentSQL = "insert into Usuario values('" +i+"'"+
						",'" + secu(u.getNombre())+"',"+ "'"+secu(u.getContra())+"',"+ u.getMaxPuntu()+","+i+u.getEmail()+")";
				int val = state.executeUpdate( sentSQL );
				
			} catch (SQLException e) {
				lastError = e;
				log( Level.SEVERE, "Error en al insertar datos en la base de datos", e );
				e.printStackTrace();
			}
			
		}
		//objetivo de este m�todo es concatenar los caracteres que seran premitidos y los que no 
		//se encuentren en los permitidos simplemente no se guaradran en la base de datos 
		private static String secu(String string) {
			StringBuffer ret = new StringBuffer();
			for (char c : string.toCharArray()) {
				if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ��������������.,:;-_(){}[]-+*=<>'\"�?�!&%$@#/\\0123456789".indexOf(c)>=0)
					ret.append(c);//para concatenar la palabras que si queremos que se guarde en la base de datos
			}
			return ret.toString();
		}
		//metodo para obtener todos los usuarios de la base de  datos en formato arraylist
		public static ArrayList<Usuario> cargaUsuario(Connection con ,Statement st){
			String sentSQL="";
			ArrayList< Usuario>devolver=new ArrayList<>();
			try {
				sentSQL = "select * from Usuario";
				ResultSet rs = st.executeQuery( sentSQL );
				while (rs.next()) {
					Usuario usua=new Usuario(rs.getString("nombre"), rs.getString("contra"), rs.getInt("MaxPuntu"),rs.getString("email"));
					devolver.add(usua);
				}
				rs.close();
				return devolver;
			} catch (SQLException e) {
				lastError = e;
				log( Level.SEVERE, "erro en la lectura de la base de datos", e );
				e.printStackTrace();
				return null;
			}
		}
		//metodo para crear tabas con la base de datos que en esta caso se va a emplear para crear la tabla Usuario
		public static Statement crearTabla( Connection con) {
		try {
			Statement statement = con.createStatement();
			statement.setQueryTimeout(30);  // poner timeout 30 msg
			try {
				statement.executeUpdate("create table Usuario " +
						"( id integer not null primary key AUTOINCREMENT ,"//para que no se repita y se incremente 
						+ "nombre text ,"
						+ "contra text ,"
						+ "MaxPuntu numeric ,"
						+ "email text ) "
						);
							} catch (Exception e) {
							// TODO: handle exception
							lastError = e;
								log( Level.SEVERE, "ya ha sido creada la tabla usuario", e );
								}
		} catch (SQLException e) {
			
			if (e.getMessage()=="table Usuario already exists") {
		
				System.out.println("adfasfsd");
				
			}else {
			
			lastError = e;
			log( Level.SEVERE, "error en la creacion de las tablas", e );
			e.printStackTrace();
			return null;
			
			}
		}
		return null;
			
		}
		//para conseguir el  id del usuario
		public static int idUsuario(Connection con ,Statement st,String nombre) {
			String mensaje="select id from Usuario where nombre = '"+ nombre+ "'";
			try {
				ResultSet rs=st.executeQuery(mensaje);
				return rs.getInt("id");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		}
		public static void cerrarBD(Connection con ,Statement st) {
			try {
				if (st!=null) st.close();
				if (con!=null) con.close();
			System.out.println("se ha cerrado la base de datos");
			} catch (SQLException e) {
				lastError = e;
				log( Level.SEVERE, "error al cerrar la base de datos", e );
				e.printStackTrace();
			}
		}
		public static void main(String[] args) {
			//creamos la base de datos
			Connection con=iniciar();
			Statement estado= crearTabla(con);
		}
}
