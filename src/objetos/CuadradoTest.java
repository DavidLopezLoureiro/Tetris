package objetos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CuadradoTest {
	Cuadrado cuadrado;
	
	@Before
	public void initialize() {
		cuadrado=new Cuadrado("0", 10, 12, false, false, false);
	}
	//probamos los diferentes metodos de la clase para verificcar que funcionan correctamente
	@Test
	public void FuncionalidadDeLaClase() {
		Boolean tipo;
		//probamos que los getters funcionan corrrectamente
		tipo=(cuadrado.getCod_cuadrado().equals("0"))?true:false;
		assertTrue(tipo);
		tipo=(cuadrado.getx()==10 && cuadrado.gety()==12)?true:false;
		assertTrue(tipo);
		tipo=(cuadrado.getabajo()==false&&cuadrado.getderecha()==false&& cuadrado.getizquierda()==false)?true:false;
		assertTrue(tipo);
		//probamos que los setters funcionan correctamente
		cuadrado.setx(11);
		cuadrado.sety(8);
		tipo=(cuadrado.getx()==11 && cuadrado.gety()==8)?true:false;
		assertTrue(tipo);
		cuadrado.setchoca_derecha(true);
		tipo=(cuadrado.getderecha()==true)?true:false;
		cuadrado.setchoca_izquierda(true);
		tipo=(cuadrado.getizquierda()==true)?true:false;
		cuadrado.setchocha_abajo(true);
		tipo=(cuadrado.getabajo()==true)?true:false;
	}

}
