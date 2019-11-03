package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

import java.util.List;
/*
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
*/
import objetos.Usuario;


public class BD {
	
	private static Connection conn = null; 

	
	
	/**
	 * Crea una conexión con la base de datos.
	 * @throws SQLException Se produce cuando existe un problema con la creación de la conexión a la BD.
	 */
	public static void connect(){
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:Base_de_datos.db");
		} catch (ClassNotFoundException e) {
			System.out.println("NO VA");
		} catch (SQLException e) {
			System.out.println("NO VA");
			
		}
	}
	
	/**
	 * Cierra una conexión con la BD.
	 * @throws SQLException Se produce cuando existe un error a la hora de conectar con la BD.
	 */
	public static void disconnect(){
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("NO VA");
		
		}
	}
	
	/*
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
			System.out.println("NO VA");
			return null;
		}
	}
	
	/**
	 * Obtiene el usuario con el id indicado como parámetro.
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
			System.out.println("NO VA");
			return null;
		}
	}
	
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
			System.out.println("NO VA");
			return new Usuario(0, "", "", 0, "");
		}
	}
	
	public static Usuario getCont(String name){
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
			System.out.println("NO VA");
			return new Usuario(0, "", "", 0, "");
		}
	}

	
	/**
	 * Guarda el usuario por primera vez en la BD generando automáticamente un id.
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
			System.out.println("NO VA");
		}
	}
	
	/**
	 * Actualiza un usuario que ya existe en la base de datos (el id debe existir y no cambia)
	 * @param user Usuario cuyos datos deben ser actualizados en la base de datos
	 * @throws SQLException Si se produce un error durante la actualización de los datos
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
			System.out.println("NO VA");
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
			System.out.println("NO VA");
		}
	}

}



