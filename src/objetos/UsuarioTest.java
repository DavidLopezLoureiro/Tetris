package objetos;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsuarioTest {
/** Vamos a hacer un test de  la clase Usuario para ver qu eel funcionamiento de la clase es  correcto 
 * y para ello trabajaremos creando un  objeto de tipo  uario y hacremos diferentes operaciones con ella
 * 
 */
	@Test
	public void Funcionamiento() {
		Usuario usuario=new Usuario(25, "erik", "1234", "erikmartirnez@gmail.com");
		assertEquals(usuario.getId(), 25);
		assertEquals("erik", usuario.getNombre());
		assertEquals("1234", usuario.getContra());
		assertEquals("erikmartirnez@gmail.com", usuario.getEmail());
		assertEquals(0,usuario.getMaxPuntu());
		//probamos a hacer cambios a los valores que originalmente teniamos
		usuario.setId(12);
		usuario.setNombre("hola");
		usuario.setContra("123");
		usuario.setEmail("nada");
		usuario.setMaxPuntu(10);
		assertEquals(usuario.getId(), 12);
		assertEquals("hola", usuario.getNombre());
		assertEquals("123", usuario.getContra());
		assertEquals("nada", usuario.getEmail());
		assertEquals(10,usuario.getMaxPuntu());
	}

}
