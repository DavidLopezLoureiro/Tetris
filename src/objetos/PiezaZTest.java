package objetos;

import static org.junit.Assert.*;

import org.junit.Test;

import objetos.Pieza.Orientacion;

public class PiezaZTest {

	@Test
	public void test() {
		Boolean resultado;
				//original
				Pieza pieza =new PiezaZ();
				resultado=(Pieza.getOrientacion()==Orientacion.ORIGINAL)?true:false;
				assertTrue(resultado);
				//giramos y comprobamos que el estado ha cambiado y por lo tanto la orientacion 
				PiezaT.girar();
				//Derecha
				System.out.println(Pieza.getOrientacion());
				resultado=(Pieza.getOrientacion()==Orientacion.DERECHA)?true:false;
				assertTrue(resultado);
				
				PiezaT.girar();
				//Al reves
				System.out.println(Pieza.getOrientacion());
				resultado=(Pieza.getOrientacion()==Orientacion.ALREVES)?true:false;
				assertTrue(resultado);
				
				PiezaT.girar();
				//Izquierda
				System.out.println(Pieza.getOrientacion());
				resultado=(Pieza.getOrientacion()==Orientacion.IZQUIERDA)?true:false;
				assertTrue(resultado);
				
				PiezaT.girar();
				//original
				resultado=(Pieza.getOrientacion()==Orientacion.ORIGINAL)?true:false;
				assertTrue(resultado);
	}

}
