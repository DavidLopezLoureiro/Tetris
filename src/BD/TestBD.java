package BD;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import objetos.Usuario;

public class TestBD {
	

	@BeforeClass
	public static void initialize() {
		BD.connect();
	}

	@Before
	public void testinitialize() {

	}

	@After
	public void test_destroy() {

	}

	@AfterClass
	public static void destroy() {
		BD.disconnect();

	}

	@Test
	public void testgetAllUsers() {

		List<Usuario> datos = BD.getAllUsers();

		String nombre = datos.get(0).getNombre();
		String email = datos.get(0).getEmail();
		int punt = datos.get(0).getMaxPuntu();
		String cont = datos.get(0).getContra();
		int id = datos.get(0).getId();
		
		assertEquals(nombre, "David");
		assertEquals(cont, "cont");
		assertEquals(email, "david.lopez.loureiro@opendeusto.es");
		assertEquals(punt, 0);
		assertEquals(id, 1);
	}
	
	@Test
	public void testgetUserId() {
	
	}
	
	@Test
	public void testgetUserName() {
	
	}
	@Test
	public void testgetcont() {
	
	}

}
