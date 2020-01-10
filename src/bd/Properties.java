package bd;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import objetos.Usuario;

public class Properties {
	public static int id;
	public static String nombre;
	public static String contra;
	//metodo que se  encarga de hacer lectura de un fichero
	public static void Lectura() {
		java.util.Properties prop = new java.util.Properties();
		InputStream is = null;
		
		try {
			is = new FileInputStream("fichero.prop");
			prop.load(is);
		} catch(IOException e) {
			System.out.println(e.toString());
		}
 
		// Acceder a las propiedades por su nombre
		id=Integer.parseInt(prop.getProperty("servidor.id"));
		nombre=prop.getProperty("servidor.nombre");
		contra=prop.getProperty("servidor.contra");
		
	
		
	}
	/**metodo que se encarga de hacer escritura en  un fichero properties
	 * 
	 * @param usuario que sera el que queremos almacenar en  el fichero
	 */
	public static void Escritura(Usuario usuario) {
		try {
			java.util.Properties prop = new java.util.Properties();
			InputStream is = null;
			  is=new FileInputStream("fichero.prop");
			  prop.load(is);
			  prop.setProperty("servidor.id", ""+usuario.getId());
			  prop.setProperty("servidor.nombre", usuario.getNombre());
			  prop.setProperty("servidor.contra", usuario.getContra());
			} catch(IOException ioe) {
				ioe.printStackTrace();
		}
		
	}
}
