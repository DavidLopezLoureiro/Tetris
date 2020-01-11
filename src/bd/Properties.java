package bd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;

import objetos.Usuario;

public class Properties {

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
		
		nombre=prop.getProperty("servidor.nombre");
		contra=prop.getProperty("servidor.contra");
		try {
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	/**metodo que se encarga de hacer escritura en  un fichero properties
	 * 
	 * @param usuario que sera el que queremos almacenar en  el fichero
	 */
	public static void Escritura(Usuario usuario) {
		try {
			File archivo =new File("fichero.prop");
			java.util.Properties prop = new java.util.Properties();
			 FileOutputStream st=new FileOutputStream(archivo);
			  prop.setProperty("servidor.id", ""+usuario.getId());
			  prop.setProperty("servidor.nombre", usuario.getNombre());
			  prop.setProperty("servidor.contra", usuario.getContra());
			  prop.store(st, null);
			  st.close();
			} catch(IOException ioe) {
				ioe.printStackTrace();
		}
		
	}
}
