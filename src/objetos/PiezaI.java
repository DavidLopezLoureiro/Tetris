package objetos;

public class PiezaI extends Pieza{
	
	//ORIENTACION ORIGINAL --> 0
	//				  		   1
	//						   2
	//			 			   3
	
	public PiezaI() {
		super();
		Pieza.Cod_pieza = "I";
		Pieza.c0 = new Cuadrado("I_0", 4, 20, false, true, true);
		Pieza.c1 = new Cuadrado("I_1", 4, 19, false, true, true);
		Pieza.c2 = new Cuadrado("I_2", 4, 18, false, true, true);
		Pieza.c3 = new Cuadrado("I_3", 4, 17, true, true, true);
	}

	/**
	 * Cambia la orientacion de la pieza a la orientacion siguiente de la cadena de orientaciones -> (ORIGINAL --> DERECHA --> ALREVES --> IZQUIERDA --> ORIGINAL -->...)
	 *
	 */
public static void girar() {
	 switch (Pieza.orientacion) {
		
	 case ORIGINAL:
		 
			if(Pieza.c0.gety() - 1 >= 0 && Pieza.c0.getx() + 1  >= 0 && Pieza.c0.gety() - 1 <= 20 && Pieza.c0.getx() + 1 <= 8) {
			
	 		if(Pieza.c2.gety() + 1 >= 0 && Pieza.c2.getx() - 1  >= 0 && Pieza.c2.gety() + 1 <= 20 && Pieza.c2.getx() - 1 <= 8) {
	 		 		
	 		if(Pieza.c3.gety() + 2 >= 0 && Pieza.c3.getx() - 2  >= 0 && Pieza.c3.gety() + 2 <= 20 && Pieza.c3.getx() - 2 <= 8) {
		
			//C0
	 			Pieza.c0.sety(Pieza.c0.gety() - 1);
		 		Pieza.c0.setx(Pieza.c0.getx() + 1);	
			
				Pieza.c0.setchocha_abajo(true);
				Pieza.c0.setchoca_izquierda(false);
				Pieza.c0.setchoca_derecha(true);
				
			
			//C1
				Pieza.c1.sety(Pieza.c1.gety());
				Pieza.c1.setx(Pieza.c1.getx());
				
				Pieza.c1.setchocha_abajo(true);
				Pieza.c1.setchoca_izquierda(false);
				Pieza.c1.setchoca_derecha(false);
			
			
			//C2
				Pieza.c2.sety(Pieza.c2.gety() + 1);
				Pieza.c2.setx(Pieza.c2.getx() - 1);
				
				Pieza.c2.setchocha_abajo(true);
				Pieza.c2.setchoca_izquierda(false);
				Pieza.c2.setchoca_derecha(false);
			
			
			//C3
				Pieza.c3.sety(Pieza.c3.gety() + 2);
				Pieza.c3.setx(Pieza.c3.getx() - 2);				
		
				Pieza.c3.setchocha_abajo(true);
				Pieza.c3.setchoca_izquierda(true);
				Pieza.c3.setchoca_derecha(false);
			
				Pieza.orientacion = Pieza.Orientacion.DERECHA;
				
	 					}
	 				}
				}
			
				
				break;
				
	 	case DERECHA:
	 		
	 			if(Pieza.c0.gety() - 1 >= 0 && Pieza.c0.getx() - 1  >= 0 && Pieza.c0.gety() - 1 <= 20 && Pieza.c0.getx() - 1 <= 8) {
				
		 		if(Pieza.c2.gety() + 1 >= 0 && Pieza.c2.getx() + 1  >= 0 && Pieza.c2.gety() + 1 <= 20 && Pieza.c2.getx() + 1 <= 8) {
		 		 		
		 		if(Pieza.c3.gety() + 2 >= 0 && Pieza.c3.getx() + 2  >= 0 && Pieza.c3.gety() + 2 <= 20 && Pieza.c3.getx() + 2 <= 8) {
			
		 	//C0
		 		Pieza.c0.sety(Pieza.c0.gety() - 1);
		 		Pieza.c0.setx(Pieza.c0.getx() - 1);
				
				Pieza.c0.setchocha_abajo(true);
				Pieza.c0.setchoca_izquierda(true);
				Pieza.c0.setchoca_derecha(true);
				
			
			//C1
				Pieza.c1.sety(Pieza.c1.gety());
				Pieza.c1.setx(Pieza.c1.getx());
				
				Pieza.c1.setchocha_abajo(false);
				Pieza.c1.setchoca_izquierda(true);
				Pieza.c1.setchoca_derecha(true);
			
			
			//C2
				Pieza.c2.sety(Pieza.c2.gety() + 1);
				Pieza.c2.setx(Pieza.c2.getx() + 1);			
				
				Pieza.c2.setchocha_abajo(false);
				Pieza.c2.setchoca_izquierda(true);
				Pieza.c2.setchoca_derecha(true);
			
			
			//C3
				Pieza.c3.sety(Pieza.c3.gety() + 2);
				Pieza.c3.setx(Pieza.c3.getx() + 2);
				
				Pieza.c3.setchocha_abajo(false);
				Pieza.c3.setchoca_izquierda(true);
				Pieza.c3.setchoca_derecha(true);
				
				Pieza.orientacion = Pieza.Orientacion.ALREVES;
				
					}
				}
			}
				break;
				
	 	case ALREVES:
	 		
	 			if(Pieza.c0.gety() + 1 >= 0 && Pieza.c0.getx() - 1  >= 0 && Pieza.c0.gety() + 1 <= 20 && Pieza.c0.getx() - 1 <= 8) {
				
		 		if(Pieza.c2.gety() - 1 >= 0 && Pieza.c2.getx() + 1  >= 0 && Pieza.c2.gety() - 1 <= 20 && Pieza.c2.getx() + 1 <= 8) {
		 		 		
		 		if(Pieza.c3.gety() - 2 >= 0 && Pieza.c3.getx() + 2  >= 0 && Pieza.c3.gety() - 2 <= 20 && Pieza.c3.getx() + 2 <= 8) {
			
		 	//C0
		 		Pieza.c0.sety(Pieza.c0.gety() + 1);
		 		Pieza.c0.setx(Pieza.c0.getx() - 1);
				
				Pieza.c0.setchocha_abajo(true);
				Pieza.c0.setchoca_izquierda(true);
				Pieza.c0.setchoca_derecha(false);
				
			
			//C1
				Pieza.c1.sety(Pieza.c1.gety());
				Pieza.c1.setx(Pieza.c1.getx());
				
				Pieza.c1.setchocha_abajo(true);
				Pieza.c1.setchoca_izquierda(false);
				Pieza.c1.setchoca_derecha(false);
			
			
			//C2
				Pieza.c2.sety(Pieza.c2.gety() - 1);
				Pieza.c2.setx(Pieza.c2.getx() + 1);			
				
				Pieza.c2.setchocha_abajo(true);
				Pieza.c2.setchoca_izquierda(false);
				Pieza.c2.setchoca_derecha(false);
			
			
			//C3
				Pieza.c3.sety(Pieza.c3.gety() - 2);
				Pieza.c3.setx(Pieza.c3.getx() + 2);
				
				Pieza.c3.setchocha_abajo(true);
				Pieza.c3.setchoca_izquierda(false);
				Pieza.c3.setchoca_derecha(true);
			
				Pieza.orientacion = Pieza.Orientacion.IZQUIERDA;

					}
				}
			}
				
				break;
				
	 	case IZQUIERDA:
	 		
	 			if(Pieza.c0.gety() + 1 >= 0 && Pieza.c0.getx() + 1  >= 0 && Pieza.c0.gety() + 1 <= 20 && Pieza.c0.getx() + 1 <= 8) {
				
		 		if(Pieza.c2.gety() - 1 >= 0 && Pieza.c2.getx() - 1  >= 0 && Pieza.c2.gety() - 1 <= 20 && Pieza.c2.getx() - 1 <= 8) {
		 		 		
		 		if(Pieza.c3.gety() - 2 >= 0 && Pieza.c3.getx() - 2  >= 0 && Pieza.c3.gety() - 2 <= 20 && Pieza.c3.getx() - 2 <= 8) {
			
			
		 	//C0
		 		Pieza.c0.sety(Pieza.c0.gety() + 1);
		 		Pieza.c0.setx(Pieza.c0.getx() + 1);
				
				Pieza.c0.setchocha_abajo(false);
				Pieza.c0.setchoca_izquierda(true);
				Pieza.c0.setchoca_derecha(true);
				
			
			//C1
				Pieza.c1.sety(Pieza.c1.gety());
				Pieza.c1.setx(Pieza.c1.getx());
				
				Pieza.c1.setchocha_abajo(false);
				Pieza.c1.setchoca_izquierda(true);
				Pieza.c1.setchoca_derecha(true);
			
			
			//C2
				Pieza.c2.sety(Pieza.c2.gety() - 1);
				Pieza.c2.setx(Pieza.c2.getx() - 1);			
				
				Pieza.c2.setchocha_abajo(false);
				Pieza.c2.setchoca_izquierda(true);
				Pieza.c2.setchoca_derecha(true);
			
			
			//C3
				Pieza.c3.sety(Pieza.c3.gety() - 2);
				Pieza.c3.setx(Pieza.c3.getx() - 2);
				
				Pieza.c3.setchocha_abajo(true);
				Pieza.c3.setchoca_izquierda(true);
				Pieza.c3.setchoca_derecha(true);
			
				Pieza.orientacion = Pieza.Orientacion.ORIGINAL;
				
					}
				}
			}
				
				break;

		default:
			break;
			
			
		}
		
	}
}