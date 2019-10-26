package main;

import java.util.Scanner;
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
						",'" + secu(u.getNombre())+"',"+ "'"+secu(u.getContra())+"',"+ u.getMaxPuntu()+","+i+")";
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
}
