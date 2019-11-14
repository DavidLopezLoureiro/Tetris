package objetos;

public class Cuadrado {

	private String Cod_cuadrado; //Cod_pieza + "_n"
	private String color;
	private int x;
	private int y;
	private boolean choca_abajo;
	private boolean choca_izquierda;
	private boolean choca_derecha;

	public Cuadrado(String cod_cuadrado, String color, int x, int y, boolean choca_abajo, boolean choca_izquierda, boolean choca_derecha) {	
		super();
		Cod_cuadrado = cod_cuadrado; 
		this.color = color;
		this.x = x;
		this.y = y;
		this.choca_abajo = choca_abajo;
		this.choca_izquierda = choca_izquierda;
		this.choca_derecha = choca_derecha;
	}
	
	//GETS
	
		//GET COLOR	
	public String getColor() {
		return color;
	}
	
		//GET COD_CUADRADO
	public String getCod_cuadrado() {
		return Cod_cuadrado;
	}
	
		//GETS DE X Y
	public int getx() {
		return x;
	}
	
	public int gety() {
		return y;
	}

		//GETS DE CHOQUES
	public boolean getabajo() {
		return choca_abajo;
	}
	
	public boolean getizquierda() {
		return choca_izquierda;
	}
	
	public boolean getderecha() {
		return choca_derecha;
	}
	
	//SETS
	
		//SETS DE X Y
	public void setx(int x) {
		this.x = x;
	}
	
	public void sety(int y) {
		this.y = y;
	}
	
	
	// FALTA DE ADAPTAR ESTOS METODOS PARA CADA PIEZA Y CADA ORIENTACION

	// C0
	public void girar0(String Cod_pieza, String orientacion) {

		// T
		if (Cod_pieza.equals("T") && orientacion.equals("Derecha")) {
			this.choca_abajo = false;
			this.choca_izquierda = false;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("T") && orientacion.equals("Izquierda")) {
			this.choca_abajo = false;
			this.choca_izquierda = true;
			this.choca_derecha = false;
		} else if (Cod_pieza.equals("T") && orientacion.equals("Alreves")) {
			this.choca_abajo = true;
			this.choca_izquierda = false;
			this.choca_derecha = false;
		} else if (Cod_pieza.equals("T") && orientacion.equals("Original")) {
			this.choca_abajo = false;
			this.choca_izquierda = false;
			this.choca_derecha = false;
			
			// I
		} else if (Cod_pieza.equals("I") && orientacion.equals("Derecha")) {
			this.x = x + 1;
			this.y = y - 1;
			this.choca_abajo = true;
			this.choca_izquierda = false;
			this.choca_derecha = false;
		} else if (Cod_pieza.equals("I") && orientacion.equals("Izquierda")) {
			this.x = x - 1;
			this.y = y + 1;
			this.choca_abajo = true;
			this.choca_izquierda = false;
			this.choca_derecha = false;
		} else if (Cod_pieza.equals("I") && orientacion.equals("Alreves")) {
			this.x = x - 1;
			this.y = y - 1;
			this.choca_abajo = false;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("I") && orientacion.equals("Original")) {
			this.x = x + 1;
			this.y = y + 1;
			this.choca_abajo = false;
			this.choca_izquierda = true;
			this.choca_derecha = true;

			// S AUN NO ESTA HECHA
		} else if (Cod_pieza.equals("S") && orientacion.equals("Derecha")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("S") && orientacion.equals("Izquierda")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("S") && orientacion.equals("Alreves")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("S") && orientacion.equals("Original")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;

			// Z AUN NO ESTA HECHA
		} else if (Cod_pieza.equals("Z") && orientacion.equals("Derecha")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("Z") && orientacion.equals("Izquierda")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("Z") && orientacion.equals("Alreves")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("Z") && orientacion.equals("Original")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;

			// L
		} else if (Cod_pieza.equals("L") && orientacion.equals("Derecha")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = false;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("L") && orientacion.equals("Izquierda")) {
			this.x = x - 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = false;
		} else if (Cod_pieza.equals("L") && orientacion.equals("Alreves")) {
			this.y = y - 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("L") && orientacion.equals("Original")) {
			this.y = y + 2;
			this.choca_abajo = false;
			this.choca_izquierda = true;
			this.choca_derecha = true;

			// R
		} else if (Cod_pieza.equals("R") && orientacion.equals("Derecha")) {
			this.y = y - 2;
			this.choca_abajo = true;
			this.choca_izquierda = false;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("R") && orientacion.equals("Izquierda")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = false;
		} else if (Cod_pieza.equals("R") && orientacion.equals("Alreves")) {
			this.x = x - 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("R") && orientacion.equals("Original")) {
			this.x = x + 2;
			this.choca_abajo = false;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		}

	}
	
	//booleans no cambiados apartir de aqui

	
	// C1
		public void girar1(String Cod_pieza, String orientacion) {

			// T
			if (Cod_pieza.equals("T") && orientacion.equals("Derecha")) {
				this.x = x - 1;
				this.y = y - 1;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Izquierda")) {
				x = x + 1;
				y = y + 1;
				choca_abajo = true;
				choca_izquierda = true;
				choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Alreves")) {
				this.x = x - 1;
				this.y = y + 1;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Original")) {
				this.x = x + 1;
				this.y = y - 1;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// I
			} else if (Cod_pieza.equals("I") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Alreves")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// S
			} else if (Cod_pieza.equals("S") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Alreves")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// Z
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Alreves")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// L
			} else if (Cod_pieza.equals("L") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Alreves")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// R
			} else if (Cod_pieza.equals("R") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Alreves")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			}

		}

	
		// C2
		public void girar2(String Cod_pieza, String orientacion) {

			// T
			if (Cod_pieza.equals("T") && orientacion.equals("Derecha")) {
				this.x = x - 1;
				this.y = y + 1;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Izquierda")) {
				this.x = x + 1;
				this.y = y - 1;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Alreves")) {
				this.x = x + 1;
				this.y = y + 1;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Original")) {
				this.x = x - 1;
				this.y = y - 1;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// I
			} else if (Cod_pieza.equals("I") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Alreves")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// S
			} else if (Cod_pieza.equals("S") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Alreves")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// Z
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Alreves")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// L
			} else if (Cod_pieza.equals("L") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Alreves")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// R
			} else if (Cod_pieza.equals("R") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Alreves")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			}

		}

		// C3
		public void girar3(String Cod_pieza, String orientacion) {

			// T
			if (Cod_pieza.equals("T") && orientacion.equals("Derecha")) {
				this.x = x + 1;
				this.y = y + 1;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Izquierda")) {
				this.x = x - 1;
				this.y = y - 1;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Alreves")) {
				this.x = x + 1;
				this.y = y - 1;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Original")) {
				this.x = x - 1;
				this.y = y + 1;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// I
			} else if (Cod_pieza.equals("I") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Alreves")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// S
			} else if (Cod_pieza.equals("S") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Alreves")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// Z
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Alreves")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// L
			} else if (Cod_pieza.equals("L") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Alreves")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// R
			} else if (Cod_pieza.equals("R") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Alreves")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			}

		}

	
}
