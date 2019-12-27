package objetos;

import static org.junit.Assert.*;

import org.junit.Test;

import objetos.Pieza.Orientacion;

public class PiezaRTest {

	@Test
	public void test() {
		Boolean resultado=false;
		//original
		Pieza pieza =new PiezaR();
		resultado=(Pieza.getOrientacion()==Orientacion.ORIGINAL)?true:false;
		assertTrue(resultado);
		//giramos y comprobamos que el estado ha cambiado y por lo tanto la orientacion 
		PiezaI.girar();
		//Derecha
		System.out.println(Pieza.getOrientacion());
		resultado=(Pieza.getOrientacion()==Orientacion.DERECHA)?true:false;
		assertTrue(resultado);
		
		PiezaI.girar();
		//Al reves
		System.out.println(Pieza.getOrientacion());
		resultado=(Pieza.getOrientacion()==Orientacion.ALREVES)?true:false;
		assertTrue(resultado);
		
		PiezaI.girar();
		//Izquierda
		System.out.println(Pieza.getOrientacion());
		resultado=(Pieza.getOrientacion()==Orientacion.IZQUIERDA)?true:false;
		assertTrue(resultado);
		
		PiezaI.girar();
		//original
		resultado=(Pieza.getOrientacion()==Orientacion.ORIGINAL)?true:false;
		assertTrue(resultado);
	}

}
