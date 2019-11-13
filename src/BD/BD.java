package BD;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import objetos.Usuario;
public class BD {
	
	private static Connection conn = null; 
	public static Logger log;
	@SuppressWarnings("unused")
	private static Exception lastError = null;
	
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
	 * Crea una conexi�n con la base de datos.
	 * @throws SQLException Se produce cuando existe un problema con la creaci�n de la conexi�n a la BD.
	 */
	public static void connect(){
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:Base_de_datos.db");
		} catch (ClassNotFoundException e) {
			lastError = e;
			log(Level.SEVERE, "Error en uso de base de datos", e);
		} catch (SQLException e) {
			lastError = e;
			log(Level.SEVERE, "Error en uso de base de datos", e);
		}
	}
	
	/**
	 * Cierra una conexi�n con la BD.
	 * @throws SQLException Se produce cuando existe un error a la hora de conectar con la BD.
	 */
	public static void disconnect(){
		try {
			conn.close();
		} catch (SQLException e) {
			lastError = e;
			log(Level.SEVERE, "Error al desconectar bd", e);
		
		}
	}
	
	/* No ejecutar estas funciones
	 * 
	public static void createUserTable() {
		try (Statement stmt = conn.createStatement()) {
			stmt.executeUpdate("CREATE TABLE IF NOT EXISTS usuarios (id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, cont VARCHAR, maxPuntu INTEGER, email VARCHAR)");
		} catch (SQLException e) {
			
		}
	}
	
	
	public static void dropUserTable() throws SQLException {
		try (Statement stmt = conn.createStatement()) {
			stmt.executeUpdate("DROP TABLE usuarios IF EXISTS");
		} catch (SQLException e) {
			throw new SQLException("Error borrando la tabla 'usuarios' en la BD", e);
		}
	}
	*/
	
	
	/**
	 * Obtiene la lista de todos los usuarios.
	 * @return lista con todos los usuarios
	 * @throws SQLException Se produce si existe un error al obtener la lista de usuarios de la BD.
	 */
	public static List<Usuario> getAllUsers(){
		List<Usuario> usuarios_Lista = new ArrayList<Usuario>();
		try (Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT id, name, cont, maxPuntu, email FROM usuarios");

			while(rs.next()) {
				Usuario user = new Usuario(rs.getInt("id"), rs.getString("name"), rs.getString("cont"), rs.getInt("maxPuntu"), rs.getString("email"));
				usuarios_Lista.add(user);
			}
			
			return usuarios_Lista;
		} catch (SQLException e) {
			lastError = e;
			log(Level.SEVERE, "Error en la extraccion del usuario", e);
			return null;
		}
	}
	
	/**
	 * Obtiene el usuario con el id indicado como par�metro.
	 * @param id ID del usuario a obtener de la BD
	 * @return El usuario cuyo ID se encuentra en la BD. Devuelve un usuario vacio con id -1 si no se ha encontrado el usuario.
	 * @throws SQLException
	 */
	public static Usuario getUserId(int id){
		try (PreparedStatement stmt = conn.prepareStatement("SELECT id, name, cont, maxPuntu, email FROM usuarios WHERE id = ?")) {
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Usuario user = new Usuario(rs.getInt("id"), rs.getString("name"), rs.getString("cont"), rs.getInt("maxPuntu"), rs.getString("email"));
				return user;
			} else {
				return new Usuario(rs.getInt("id"), rs.getString("name"), rs.getString("cont"), rs.getInt("maxPuntu"), rs.getString("email"));
			}
		} catch (SQLException e) {
			lastError = e;
			log(Level.SEVERE, "Usuario no encontrado", e);
			return null;
		}
	}
	
	/**
	 * Devuelve el Usuario del nombre que buscamos.
	 * 
	 * @param name --> nombre del usuario.
	 * 
	 * @return Usuario --> usuario.
	 * 
	 */
	public static Usuario getUserName(String name){
		try (PreparedStatement stmt = conn.prepareStatement("SELECT id, name, cont, maxPuntu, email FROM usuarios WHERE name = ?")) {
			stmt.setString(1, name);
			
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Usuario user = new Usuario(rs.getInt("id"), rs.getString("name"), rs.getString("cont"), rs.getInt("maxPuntu"), rs.getString("email"));
				return user;
			} else {
				return new Usuario(rs.getInt("id"), rs.getString("name"), rs.getString("cont"), rs.getInt("maxPuntu"), rs.getString("email"));
			}
		} catch (SQLException e) {
			lastError = e;
			log(Level.SEVERE, "Error en uso de base de datos", e);
			return new Usuario(0, "", "", 0, "");
		}
	}
	
	/**
	 * Devuelve la contrase�a del nombre que buscamos.
	 * 
	 * @param name --> nombre del usuario.
	 * 
	 * @return cont --> contrase�a del usuario.
	 * 
	 */
	public static String getCont(String name){
		try (PreparedStatement stmt = conn.prepareStatement("SELECT id, name, cont, maxPuntu, email FROM usuarios WHERE name = ?")) {
			stmt.setString(1, name);
			
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				return rs.getString("cont");
			} else {
				return rs.getString("cont");
			}
		} catch (SQLException e) {
			lastError = e;
			log(Level.SEVERE, "Error en uso de base de datos", e);
			return "";
		}
	}
	
	

	
	/**
	 * Guarda el usuario por primera vez en la BD generando autom�ticamente un id.
	 * @param user el objeto que debe ser guardado en la BD (el id es ignorado ya que se genera uno nuevo).
	 * @throws SQLException Si se produce un error al guardar el usuario en la BD.
	 */
	public static void store(Usuario user){
		try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO usuarios (name, cont, maxPuntu, email) VALUES (?, ?, ?, ?)");
			Statement stmtForId = conn.createStatement()) {
			stmt.setString(1, user.getNombre());
			stmt.setString(2, user.getContra());
			stmt.setInt(3, user.getMaxPuntu());
			stmt.setString(4, user.getEmail());
	
			stmt.executeUpdate();
			ResultSet rs = stmtForId.executeQuery("SELECT last_insert_rowid() AS id FROM usuarios");
			if (rs.next()) {
				int newId = rs.getInt("id");
				user.setId(newId);
			} else {
				System.out.println("NO VA EL ID");
			}
		} catch (SQLException e) {
			lastError = e;
			log(Level.SEVERE, "Error en uso de base de datos", e);
		}
	}
	
	/**
	 * Actualiza un usuario que ya existe en la base de datos (el id debe existir y no cambia)
	 * @param user Usuario cuyos datos deben ser actualizados en la base de datos
	 * @throws SQLException Si se produce un error durante la actualizaci�n de los datos
	 */
	public static void update(Usuario user)  {
		try (PreparedStatement stmt = conn.prepareStatement("UPDATE usuarios SET name=?, cont=?, maxPuntu=?, email=? WHERE id=?")) {
			stmt.setString(1, user.getNombre());
			stmt.setString(2, user.getContra());
			stmt.setInt(3, user.getMaxPuntu());
			stmt.setString(4, user.getEmail());
			stmt.setInt(5, user.getId());
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			lastError = e;
			log(Level.SEVERE, "Usuario no actualizado", e);
		}
	}
	
	/**
	 * Elimina un usuario de la base de datos
	 * @param user Usuario que debe ser eliminado de la base de datos
	 * @throws SQLException Si se produce un error al eliminar el usuario de la BD.
	 */
	public static void delete(Usuario user){
		try (PreparedStatement stmt = conn.prepareStatement("DELETE FROM usuarios WHERE id=?")) {
			stmt.setInt(1, user.getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			lastError = e;
			log(Level.SEVERE, "Usuario no borrado", e);
		}
	}

}



