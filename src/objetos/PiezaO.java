package objetos;

public class PiezaO extends Pieza{
	
	//ORIENTACION ORIGINAL --> 0 1
	//				  		   2 3
	
	public PiezaO() {
		super();
		Pieza.Cod_pieza = "O";
		Pieza.c0 = new Cuadrado("O_0", 4, 20, false, true, false);
		Pieza.c1 = new Cuadrado("O_1", 5, 20, false, false, true);
		Pieza.c2 = new Cuadrado("O_2", 4, 19, true, true, false);
		Pieza.c3 = new Cuadrado("O_3", 5, 19, true, false, true);
	}

	
}