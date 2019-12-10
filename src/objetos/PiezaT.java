package objetos;

public class PiezaT extends Pieza{
	
	//ORIENTACION ORIGINAL --> 301
	//				  			2
	
	public PiezaT() {
		super();
		Pieza.Cod_pieza = "T";
		Pieza.c0 = new Cuadrado("T_0", 4, 20, false, false, false);
		Pieza.c1 = new Cuadrado("T_1", 5, 20, true, false, true);
		Pieza.c2 = new Cuadrado("T_2", 4, 19, true, true, true);
		Pieza.c3 = new Cuadrado("T_3", 3, 20, true, true, false);
	}

	/**
	 * Cambia la orientacion de la pieza a la orientacion siguiente de la cadena de orientaciones -> (ORIGINAL --> DERECHA --> ALREVES --> IZQUIERDA --> ORIGINAL -->...)
	 *
	 */
	public static void girar() {
		
	 switch (Pieza.orientacion) {
		
	 	case ORIGINAL:
	 		
	 		if(Pieza.c1.gety() - 1 >= 0 && Pieza.c1.getx() - 1  >= 0) {
	 			
	 			if(Pieza.c1.gety() - 1 <= 20 && Pieza.c1.getx() - 1 <= 8) {
	 				
	 				if(Pieza.c2.gety() + 1 >= 0 && Pieza.c2.getx() - 1  >= 0) {
	 		 			
	 		 			if(Pieza.c2.gety() + 1 <= 20 && Pieza.c2.getx() - 1 <= 8) {

	 		 				if(Pieza.c3.gety() + 1 >= 0 && Pieza.c3.getx() + 1  >= 0) {
	 		 		 			
	 		 		 			if(Pieza.c3.gety() + 1 <= 20 && Pieza.c3.getx() + 1 <= 8) {
	 		 				
	 				
	 				
			//C0
	 			Pieza.c0.sety(Pieza.c0.gety());
		 		Pieza.c0.setx(Pieza.c0.getx());	
			
				Pieza.c0.setchocha_abajo(false);
				Pieza.c0.setchoca_izquierda(false);
				Pieza.c0.setchoca_derecha(true);
				
			
			//C1
				Pieza.c1.sety(Pieza.c1.gety() - 1);
				Pieza.c1.setx(Pieza.c1.getx() - 1);
				
				Pieza.c1.setchocha_abajo(true);
				Pieza.c1.setchoca_izquierda(true);
				Pieza.c1.setchoca_derecha(true);
			
			
			//C2
				Pieza.c2.sety(Pieza.c2.gety() + 1);
				Pieza.c2.setx(Pieza.c2.getx() - 1);
				
				Pieza.c2.setchocha_abajo(true);
				Pieza.c2.setchoca_izquierda(true);
				Pieza.c2.setchoca_derecha(false);
			
			
			//C3
				Pieza.c3.sety(Pieza.c3.gety() + 1);
				Pieza.c3.setx(Pieza.c3.getx() + 1);				
		
				Pieza.c3.setchocha_abajo(false);
				Pieza.c3.setchoca_izquierda(true);
				Pieza.c3.setchoca_derecha(true);
			
				Pieza.orientacion = Pieza.Orientacion.DERECHA;
				
				
								}
							}
						}
					}
				}
			}
	 		
	 		break;
				
	 	case DERECHA:
			
		 	//C0
		 		Pieza.c0.sety(Pieza.c0.gety());
		 		Pieza.c0.setx(Pieza.c0.getx());
				
				Pieza.c0.setchocha_abajo(true);
				Pieza.c0.setchoca_izquierda(false);
				Pieza.c0.setchoca_derecha(false);
				
			
			//C1
				Pieza.c1.sety(Pieza.c1.gety() + 1);
				Pieza.c1.setx(Pieza.c1.getx() - 1);
				
				Pieza.c1.setchocha_abajo(true);
				Pieza.c1.setchoca_izquierda(true);
				Pieza.c1.setchoca_derecha(false);
			
			
			//C2
				Pieza.c2.sety(Pieza.c2.gety() + 1);
				Pieza.c2.setx(Pieza.c2.getx() + 1);			
				
				Pieza.c2.setchocha_abajo(false);
				Pieza.c2.setchoca_izquierda(true);
				Pieza.c2.setchoca_derecha(true);
			
			
			//C3
				Pieza.c3.sety(Pieza.c3.gety() - 1);
				Pieza.c3.setx(Pieza.c3.getx() + 1);
				
				Pieza.c3.setchocha_abajo(true);
				Pieza.c3.setchoca_izquierda(false);
				Pieza.c3.setchoca_derecha(true);
				
				Pieza.orientacion = Pieza.Orientacion.ALREVES;
				
				break;
				
	 	case ALREVES:
			
		 	//C0
		 		Pieza.c0.sety(Pieza.c0.gety());
		 		Pieza.c0.setx(Pieza.c0.getx());
				
				Pieza.c0.setchocha_abajo(false);
				Pieza.c0.setchoca_izquierda(true);
				Pieza.c0.setchoca_derecha(false);
				
			
			//C1
				Pieza.c1.sety(Pieza.c1.gety() + 1);
				Pieza.c1.setx(Pieza.c1.getx() + 1);
				
				Pieza.c1.setchocha_abajo(false);
				Pieza.c1.setchoca_izquierda(true);
				Pieza.c1.setchoca_derecha(true);
			
			
			//C2
				Pieza.c2.sety(Pieza.c2.gety() - 1);
				Pieza.c2.setx(Pieza.c2.getx() + 1);			
				
				Pieza.c2.setchocha_abajo(true);
				Pieza.c2.setchoca_izquierda(false);
				Pieza.c2.setchoca_derecha(true);
			
			
			//C3
				Pieza.c3.sety(Pieza.c3.gety() - 1);
				Pieza.c3.setx(Pieza.c3.getx() - 1);
				
				Pieza.c3.setchocha_abajo(true);
				Pieza.c3.setchoca_izquierda(true);
				Pieza.c3.setchoca_derecha(true);
			
				Pieza.orientacion = Pieza.Orientacion.IZQUIERDA;
				
				break;
				
	 	case IZQUIERDA:
			
			
		 	//C0
		 		Pieza.c0.sety(Pieza.c0.gety());
		 		Pieza.c0.setx(Pieza.c0.getx());
				
				Pieza.c0.setchocha_abajo(false);
				Pieza.c0.setchoca_izquierda(false);
				Pieza.c0.setchoca_derecha(false);
				
			
			//C1
				Pieza.c1.sety(Pieza.c1.gety() - 1);
				Pieza.c1.setx(Pieza.c1.getx() + 1);
				
				Pieza.c1.setchocha_abajo(true);
				Pieza.c1.setchoca_izquierda(false);
				Pieza.c1.setchoca_derecha(true);
			
			
			//C2
				Pieza.c2.sety(Pieza.c2.gety() - 1);
				Pieza.c2.setx(Pieza.c2.getx() - 1);			
				
				Pieza.c2.setchocha_abajo(true);
				Pieza.c2.setchoca_izquierda(true);
				Pieza.c2.setchoca_derecha(true);
			
			
			//C3
				Pieza.c3.sety(Pieza.c3.gety() + 1);
				Pieza.c3.setx(Pieza.c3.getx() - 1);
				
				Pieza.c3.setchocha_abajo(true);
				Pieza.c3.setchoca_izquierda(true);
				Pieza.c3.setchoca_derecha(false);
			
				Pieza.orientacion = Pieza.Orientacion.ORIGINAL;
				
				break;

		default:
			break;
			
			
		}
		
	}
}



			