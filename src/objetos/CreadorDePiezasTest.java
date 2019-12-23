package objetos;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import interfaz.CrearUsuario;
import interfaz.Ventana;

public class CreadorDePiezasTest {
//Test para comprobar si funciona correctamente eñ creador de piezas
	@Test
	public void CreadorDePiezas() {
		Boolean resultado=false;
		ArrayList<String> piezas=CreadorDePiezas.crear_lista_pirmera_vez();
		for (String string : piezas) {
			if(string.equals("T") ||string.equals("I") ||string.equals("O") ||string.equals("L") ||string.equals("R") ||string.equals("S") ||string.equals("Z") ) 
			{
			resultado=true;	
			}else {
					resultado =false;
			}
			assertTrue(resultado);
		}
	}
/** Vamos a probar que el metode mover guardada funciona correctamente y que crea la pieza en base a un String
 * para este método vamos a usar la pieza l para demostrar que funciona correctamente 
 */
	@Test
	public void  mover_guardada() {
		Boolean resultado =false;
		String pieza="L";
		Pieza p=CreadorDePiezas.mover_guardada(pieza);
		if(p instanceof PiezaL) {
			resultado =true;
		}
		assertTrue(resultado);
		
	}
	//Vamos a comprobar que la lista se mueve correctamente coon el metodo mocer_lista
	@Test
	public void moverLista() {
		Boolean resultado=false;
		ArrayList<String>copia=new ArrayList<>();
		Ventana.lista=copia;//meto datos de prueba para poder trabajar sobre un array lleno
		copia.add("R");
		copia.add("I");
		copia.add("T");
		String primero1=copia.get(0);//posicion 0 antes de hacer el borrado
		CreadorDePiezas.mover_lista();
		String primero2=copia.get(0);//posicion 0 tras hacer el borrado
		if(!primero1.equals(primero2)) {
			resultado=true;
		}
			assertTrue(resultado);//comprobamos que haya cambiado el el ultimo numero del array
	}
}

