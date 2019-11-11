package objetos;

public class creador_de_piezas {

	
	public Pieza crear_pieza(String cod_pieza) {

		// GENERAL
		String orientacion = "Original"; // siempre empieza en orientacion original
		String color = "blanco"; // el color se asigna más tarde pero estamos obligados a inicializarlo
		
		// array[21][9]

		// C0
		int x_0 = 0;
		int y_0 = 0;
		boolean choca_abajo_0 = true;
		boolean choca_izquierda_0 = true;
		boolean choca_derecha_0 = true;

		// C1
		int x_1 = 0;
		int y_1 = 0;
		boolean choca_abajo_1 = true;
		boolean choca_izquierda_1 = true;
		boolean choca_derecha_1 = true;

		// C2
		int x_2 = 0;
		int y_2 = 0;
		boolean choca_abajo_2 = true;
		boolean choca_izquierda_2 = true;
		boolean choca_derecha_2 = true;

		// C3
		int x_3 = 0;
		int y_3 = 0;
		boolean choca_abajo_3 = true;
		boolean choca_izquierda_3 = true;
		boolean choca_derecha_3 = true;

		if (cod_pieza.equals("T")) {

			// COLOR
			color = "morado";
			
			//ORIENTACION ORIGINAL --> 301
			//				  			2

			// C0
			x_0 = 4;
			y_0 = 20;
			choca_abajo_0 = false;
			choca_izquierda_0 = false;
			choca_derecha_0 = false;

			// C1
			x_1 = 5;
			y_1 = 20;
			choca_abajo_0 = true;
			choca_izquierda_0 = false;
			choca_derecha_0 = true;

			// C2
			x_2 = 4;
			y_2 = 19;
			choca_abajo_0 = true;
			choca_izquierda_0 = true;
			choca_derecha_0 = true;

			// C3
			x_3 = 3;
			y_3 = 20;
			choca_abajo_0 = true;
			choca_izquierda_0 = true;
			choca_derecha_0 = false;

		} else if (cod_pieza.equals("I")) {

			// COLOR
			color = "azul";

			//ORIENTACION ORIGINAL --> 0
			//				  		   1
			//						   2
			//			 			   3
			
			// C0
			x_0 = 4;
			y_0 = 20;
			choca_abajo_0 = false;
			choca_izquierda_0 = true;
			choca_derecha_0 = true;

			// C1
			x_1 = 4;
			y_1 = 19;
			choca_abajo_0 = false;
			choca_izquierda_0 = true;
			choca_derecha_0 = true;

			// C2
			x_2 = 4;
			y_2 = 18;
			choca_abajo_0 = false;
			choca_izquierda_0 = true;
			choca_derecha_0 = true;

			// C3
			x_3 = 4;
			y_3 = 17;
			choca_abajo_0 = true;
			choca_izquierda_0 = true;
			choca_derecha_0 = true;

		} else if (cod_pieza.equals("O")) {

			// COLOR
			color = "amarillo";
			
			//ORIENTACION ORIGINAL --> 0 1
			//				  		   2 3

			// C0
			x_0 = 4;
			y_0 = 20;
			choca_abajo_0 = false;
			choca_izquierda_0 = true;
			choca_derecha_0 = false;

			// C1
			x_1 = 5;
			y_1 = 20;
			choca_abajo_0 = false;
			choca_izquierda_0 = false;
			choca_derecha_0 = true;

			// C2
			x_2 = 4;
			y_2 = 19;
			choca_abajo_0 = true;
			choca_izquierda_0 = true;
			choca_derecha_0 = false;

			// C3
			x_3 = 5;
			y_3 = 19;
			choca_abajo_0 = true;
			choca_izquierda_0 = false;
			choca_derecha_0 = true;

		} else if (cod_pieza.equals("S")) {

			// COLOR
			color = "verde";
			
			//ORIENTACION ORIGINAL --> 0 
			//				  		   1 2
			//							 3

			// C0
			x_0 = 4;
			y_0 = 20;
			choca_abajo_0 = false;
			choca_izquierda_0 = true;
			choca_derecha_0 = true;

			// C1
			x_1 = 4;
			y_1 = 19;
			choca_abajo_0 = true;
			choca_izquierda_0 = true;
			choca_derecha_0 = false;

			// C2
			x_2 = 5;
			y_2 = 19;
			choca_abajo_0 = false;
			choca_izquierda_0 = false;
			choca_derecha_0 = true;

			// C3
			x_3 = 5;
			y_3 = 18;
			choca_abajo_0 = true;
			choca_izquierda_0 = true;
			choca_derecha_0 = true;

		} else if (cod_pieza.equals("Z")) {

			// COLOR
			color = "rojo";
			
			//ORIENTACION ORIGINAL -->   0 
			//				  		   1 2
			//						   3

			// C0
			x_0 = 4;
			y_0 = 20;
			choca_abajo_0 = false;
			choca_izquierda_0 = true;
			choca_derecha_0 = true;

			// C1
			x_1 = 3;
			y_1 = 19;
			choca_abajo_0 = false;
			choca_izquierda_0 = true;
			choca_derecha_0 = false;

			// C2
			x_2 = 4;
			y_2 = 19;
			choca_abajo_0 = true;
			choca_izquierda_0 = false;
			choca_derecha_0 = true;

			// C3
			x_3 = 3;
			y_3 = 18;
			choca_abajo_0 = true;
			choca_izquierda_0 = true;
			choca_derecha_0 = true;

		} else if (cod_pieza.equals("L")) {

			// COLOR
			color = "naranja";
			
			//ORIENTACION ORIGINAL --> 0 
			//				  		   1 
			//						   2 3

			// C0
			x_0 = 4;
			y_0 = 20;
			choca_abajo_0 = false;
			choca_izquierda_0 = true;
			choca_derecha_0 = true;

			// C1
			x_1 = 4;
			y_1 = 19;
			choca_abajo_0 = false;
			choca_izquierda_0 = true;
			choca_derecha_0 = true;

			// C2
			x_2 = 4;
			y_2 = 18;
			choca_abajo_0 = true;
			choca_izquierda_0 = true;
			choca_derecha_0 = false;

			// C3
			x_3 = 5;
			y_3 = 18;
			choca_abajo_0 = true;
			choca_izquierda_0 = false;
			choca_derecha_0 = true;

		} else if (cod_pieza.equals("R")) {

			// COLOR
			color = "azul";
			
			//ORIENTACION ORIGINAL -->   0 
			//				  		     1 
			//						   3 2

			// C0
			x_0 = 4;
			y_0 = 20;
			choca_abajo_0 = false;
			choca_izquierda_0 = true;
			choca_derecha_0 = true;

			// C1
			x_1 = 4;
			y_1 = 19;
			choca_abajo_0 = false;
			choca_izquierda_0 = true;
			choca_derecha_0 = true;

			// C2
			x_2 = 4;
			y_2 = 18;
			choca_abajo_0 = true;
			choca_izquierda_0 = false;
			choca_derecha_0 = true;

			// C3
			x_3 = 3;
			y_3 = 18;
			choca_abajo_0 = true;
			choca_izquierda_0 = true;
			choca_derecha_0 = false;

		}

		Cuadrado c0 = new Cuadrado(cod_pieza + "_0", color, x_0, y_0, choca_abajo_0, choca_izquierda_0,
				choca_derecha_0);
		Cuadrado c1 = new Cuadrado(cod_pieza + "_1", color, x_1, y_1, choca_abajo_1, choca_izquierda_1,
				choca_derecha_1);
		Cuadrado c2 = new Cuadrado(cod_pieza + "_2", color, x_2, y_2, choca_abajo_2, choca_izquierda_2,
				choca_derecha_2);
		Cuadrado c3 = new Cuadrado(cod_pieza + "_3", color, x_3, y_3, choca_abajo_3, choca_izquierda_3,
				choca_derecha_3);

		return new Pieza(cod_pieza, orientacion, c0, c1, c2, c3);
	}
}
