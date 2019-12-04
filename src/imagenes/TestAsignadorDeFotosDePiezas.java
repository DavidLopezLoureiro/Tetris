package imagenes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bd.BD;

public class TestAsignadorDeFotosDePiezas {
	
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
	public void testponer_foto() {
		
		String resultado = AsignadorDeFotosDePiezas.poner_foto("T");
		
		assertEquals("/imagenes/T.png", resultado);
	}

}
