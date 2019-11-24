package objetos;

public class PiezaL extends Pieza{
	
	//ORIENTACION ORIGINAL --> 0 
	//				  		   1 
	//						   2 3

	public PiezaL() {
		super();
		Pieza.Cod_pieza = "L";
		Pieza.c0 = new Cuadrado("L_0", 4, 20, false, true, true);
		Pieza.c1 = new Cuadrado("L_1", 4, 19, false, true, true);
		Pieza.c2 = new Cuadrado("L_2", 4, 18, true, true, false);
		Pieza.c3 = new Cuadrado("L_3", 5, 18, true, false, true);
	}

	/**
	 * Cambia la orientacion de la pieza a la orientacion siguiente de la cadena de orientaciones -> (ORIGINAL --> DERECHA --> ALREVES --> IZQUIERDA --> ORIGINAL -->...)
	 *
	 */
	public static void girar() {
		 switch (Pieza.orientacion) {
			
		 	case ORIGINAL:
			
				//C0
					Pieza.c0.setx(Pieza.c0.getx() + 2);
					Pieza.c0.sety(Pieza.c0.gety() + 2);
					
					Pieza.c0.setchocha_abajo(true);
					Pieza.c0.setchocha_abajo(true);
					Pieza.c0.setchocha_abajo(true);
					
				
				//C1
					Pieza.c1.setx(Pieza.c1.getx() + 2);
					Pieza.c1.sety(Pieza.c1.gety() + 2);
					
					Pieza.c1.setchocha_abajo(true);
					Pieza.c1.setchocha_abajo(true);
					Pieza.c1.setchocha_abajo(true);
				
				
				//C2
					Pieza.c2.setx(Pieza.c2.getx() + 2);
					Pieza.c2.sety(Pieza.c2.getx() + 2);
					
					Pieza.c2.setchocha_abajo(true);
					Pieza.c2.setchocha_abajo(true);
					Pieza.c2.setchocha_abajo(true);
				
				
				//C3
					Pieza.c3.setx(Pieza.c3.getx() + 2);
					Pieza.c3.sety(Pieza.c3.gety() + 2);
			
					Pieza.c3.setchocha_abajo(true);
					Pieza.c3.setchocha_abajo(true);
					Pieza.c3.setchocha_abajo(true);
				
				
				//HACER CON ENUMS
					Pieza.orientacion = Pieza.Orientacion.DERECHA;
		
				
			
		 	case DERECHA:
				
				//C0
					Pieza.c0.setx(Pieza.c0.getx() + 2);
					Pieza.c0.sety(Pieza.c0.gety() + 2);
					
					Pieza.c0.setchocha_abajo(true);
					Pieza.c0.setchocha_abajo(true);
					Pieza.c0.setchocha_abajo(true);
					
				
				//C1
					Pieza.c1.setx(Pieza.c1.getx() + 2);
					Pieza.c1.sety(Pieza.c1.gety() + 2);
					
					Pieza.c1.setchocha_abajo(true);
					Pieza.c1.setchocha_abajo(true);
					Pieza.c1.setchocha_abajo(true);
				
				
				//C2
					Pieza.c2.setx(Pieza.c2.getx() + 2);
					Pieza.c2.sety(Pieza.c2.getx() + 2);
					
					Pieza.c2.setchocha_abajo(true);
					Pieza.c2.setchocha_abajo(true);
					Pieza.c2.setchocha_abajo(true);
				
				
				//C3
					Pieza.c3.setx(Pieza.c3.getx() + 2);
					Pieza.c3.sety(Pieza.c3.gety() + 2);
			
					Pieza.c3.setchocha_abajo(true);
					Pieza.c3.setchocha_abajo(true);
					Pieza.c3.setchocha_abajo(true);
				
				
				//HACER CON ENUMS
					Pieza.orientacion = Pieza.Orientacion.ALREVES;
					
					
					
		 	case ALREVES:
				
				
				//C0
					Pieza.c0.setx(Pieza.c0.getx() + 2);
					Pieza.c0.sety(Pieza.c0.gety() + 2);
					
					Pieza.c0.setchocha_abajo(true);
					Pieza.c0.setchocha_abajo(true);
					Pieza.c0.setchocha_abajo(true);
					
				
				//C1
					Pieza.c1.setx(Pieza.c1.getx() + 2);
					Pieza.c1.sety(Pieza.c1.gety() + 2);
					
					Pieza.c1.setchocha_abajo(true);
					Pieza.c1.setchocha_abajo(true);
					Pieza.c1.setchocha_abajo(true);
				
				
				//C2
					Pieza.c2.setx(Pieza.c2.getx() + 2);
					Pieza.c2.sety(Pieza.c2.getx() + 2);
					
					Pieza.c2.setchocha_abajo(true);
					Pieza.c2.setchocha_abajo(true);
					Pieza.c2.setchocha_abajo(true);
				
				
				//C3
					Pieza.c3.setx(Pieza.c3.getx() + 2);
					Pieza.c3.sety(Pieza.c3.gety() + 2);
			
					Pieza.c3.setchocha_abajo(true);
					Pieza.c3.setchocha_abajo(true);
					Pieza.c3.setchocha_abajo(true);
				
				
				//HACER CON ENUMS
					Pieza.orientacion = Pieza.Orientacion.IZQUIERDA;
					
		 	case IZQUIERDA:
				
				
				//C0
					Pieza.c0.setx(Pieza.c0.getx() + 2);
					Pieza.c0.sety(Pieza.c0.gety() + 2);
					
					Pieza.c0.setchocha_abajo(true);
					Pieza.c0.setchocha_abajo(true);
					Pieza.c0.setchocha_abajo(true);
					
			
				//C1
					Pieza.c1.setx(Pieza.c1.getx() + 2);
					Pieza.c1.sety(Pieza.c1.gety() + 2);
					
					Pieza.c1.setchocha_abajo(true);
					Pieza.c1.setchocha_abajo(true);
					Pieza.c1.setchocha_abajo(true);
				
				
				//C2
					Pieza.c2.setx(Pieza.c2.getx() + 2);
					Pieza.c2.sety(Pieza.c2.getx() + 2);
					
					Pieza.c2.setchocha_abajo(true);
					Pieza.c2.setchocha_abajo(true);
					Pieza.c2.setchocha_abajo(true);
				
				
				//C3
					Pieza.c3.setx(Pieza.c3.getx() + 2);
					Pieza.c3.sety(Pieza.c3.gety() + 2);
			
					Pieza.c3.setchocha_abajo(true);
					Pieza.c3.setchocha_abajo(true);
					Pieza.c3.setchocha_abajo(true);
				
				
				//HACER CON ENUMS
					Pieza.orientacion = Pieza.Orientacion.ORIGINAL;

			default:
				break;
				
				
			}
		
	}
}