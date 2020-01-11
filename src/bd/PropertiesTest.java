package bd;

import static org.junit.Assert.*;

import org.junit.Test;

import objetos.Usuario;

public class PropertiesTest {
//clase desarrollada para ver que funciona correctamente la clase PROPERTIES

	@Test
	public void EscriturayLectura() {
		Usuario usuario=new Usuario(100, "erik", "1234", "funciona") ;
		Properties.Escritura(usuario);//escribimos el usuario con el que vamos a comprobar
		Properties.Lectura();//leemos y añadimos los datos en los atributos de la clase Properties
		//verificamos que los datos son correctos
		assertEquals("erik", Properties.nombre);
		assertEquals("1234", Properties.contra);
		
		
	}

}
