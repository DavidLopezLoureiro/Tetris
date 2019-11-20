package bd;

import static org.junit.Assert.assertEquals;


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

		List<Usuario> all = BD.getAllUsers();

		String nombre = all.get(0).getNombre();
		String email = all.get(0).getEmail();
		int punt = all.get(0).getMaxPuntu();
		String cont = all.get(0).getContra();
		int id = all.get(0).getId();
		
		assertEquals(nombre, "David");
		assertEquals(cont, "cont");
		assertEquals(email, "david.lopez.loureiro@opendeusto.es");
		assertEquals(punt, 0);
		assertEquals(id, 1);
	}
	
	@Test
	public void testgetUserId() {
		
		Usuario id = BD.getUserId(1);
		
		String nombre = id.getNombre();
		String email = id.getEmail();
		int punt = id.getMaxPuntu();
		String cont = id.getContra();
		int iD = id.getId();
		
		assertEquals(nombre, "David");
		assertEquals(cont, "cont");
		assertEquals(email, "david.lopez.loureiro@opendeusto.es");
		assertEquals(punt, 0);
		assertEquals(iD, 1);
	
	}
	
	@Test
	public void testgetUserName() {

		Usuario nombre = BD.getUserName("David");
		
		String nombre1 = nombre.getNombre();
		String email = nombre.getEmail();
		int punt = nombre.getMaxPuntu();
		String cont = nombre.getContra();
		int id1 = nombre.getId();
		
		assertEquals(nombre1, "David");
		assertEquals(cont, "cont");
		assertEquals(email, "david.lopez.loureiro@opendeusto.es");
		assertEquals(punt, 0);
		assertEquals(id1, 1);
	
	}
	@Test
	public void testgetcont() {
		
		String cont = BD.getCont("David");
		
		assertEquals(cont, "cont");
	
	}

}
