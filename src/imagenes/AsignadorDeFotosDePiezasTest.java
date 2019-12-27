package imagenes;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class AsignadorDeFotosDePiezasTest {
	//inicializamos previamente un arraylist con todos los tipos de piezas parr la asignacion
	ArrayList<String> tipos;
	@Before
	public void initialize() {
		tipos=new ArrayList<String>();
		tipos.add("I");
		tipos.add("L");
		tipos.add("O");
		tipos.add("R");
		tipos.add("S");
		tipos.add("T");
		tipos.add("Z");
	}
//	comprobamos que las asignaciones de imagagenes se estan haciendo correctamente
	@Test
	public void AsignacionFotos() {
		for ( String dato: tipos) {
			String prueba="/imagenes/"+dato+".png";
			Boolean resultado=prueba.equals(AsignadorDeFotosDePiezas.poner_foto(dato));
			assertTrue(resultado);
		}
		
	}

}
