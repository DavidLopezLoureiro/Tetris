package objetos;

public class Cuadrado {

	private String Cod_cuadrado; //Cod_pieza + "_n"
	private String color;
	private int x;
	private int y;
	private boolean choca_abajo;
	private boolean choca_izquierda;
	private boolean choca_derecha;

	public Cuadrado(String cod_cuadrado, String color, int x, int y, boolean choca_abajo, boolean choca_izquierda,
			boolean choca_derecha) {
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
	public void girarx0(String Cod_pieza, String orientacion) {

		// T
		if (Cod_pieza.equals("T") && orientacion.equals("Derecha")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("T") && orientacion.equals("Izquierda")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("T") && orientacion.equals("Abajo")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("T") && orientacion.equals("Original")) {
			this.x = x + 2;
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
		} else if (Cod_pieza.equals("I") && orientacion.equals("Abajo")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("I") && orientacion.equals("Original")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;

			// O
		} else if (Cod_pieza.equals("O") && orientacion.equals("Derecha")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("O") && orientacion.equals("Izquierda")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("O") && orientacion.equals("Abajo")) {
			this.x = x + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("O") && orientacion.equals("Original")) {
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
		} else if (Cod_pieza.equals("S") && orientacion.equals("Abajo")) {
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
		} else if (Cod_pieza.equals("Z") && orientacion.equals("Abajo")) {
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
		} else if (Cod_pieza.equals("L") && orientacion.equals("Abajo")) {
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
		} else if (Cod_pieza.equals("R") && orientacion.equals("Abajo")) {
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

	public void girary0(String Cod_pieza, String orientacion) {

		// T
		if (Cod_pieza.equals("T") && orientacion.equals("Derecha")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("T") && orientacion.equals("Izquierda")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("T") && orientacion.equals("Abajo")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("T") && orientacion.equals("Original")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;

			// I
		} else if (Cod_pieza.equals("I") && orientacion.equals("Derecha")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("I") && orientacion.equals("Izquierda")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("I") && orientacion.equals("Abajo")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("I") && orientacion.equals("Original")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;

			// O
		} else if (Cod_pieza.equals("O") && orientacion.equals("Derecha")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("O") && orientacion.equals("Izquierda")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("O") && orientacion.equals("Abajo")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("O") && orientacion.equals("Original")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;

			// S
		} else if (Cod_pieza.equals("S") && orientacion.equals("Derecha")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("S") && orientacion.equals("Izquierda")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("S") && orientacion.equals("Abajo")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("S") && orientacion.equals("Original")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;

			// Z
		} else if (Cod_pieza.equals("Z") && orientacion.equals("Derecha")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("Z") && orientacion.equals("Izquierda")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("Z") && orientacion.equals("Abajo")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("Z") && orientacion.equals("Original")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;

			// L
		} else if (Cod_pieza.equals("L") && orientacion.equals("Derecha")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("L") && orientacion.equals("Izquierda")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("L") && orientacion.equals("Abajo")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("L") && orientacion.equals("Original")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;

			// R
		} else if (Cod_pieza.equals("R") && orientacion.equals("Derecha")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("R") && orientacion.equals("Izquierda")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("R") && orientacion.equals("Abajo")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		} else if (Cod_pieza.equals("R") && orientacion.equals("Original")) {
			this.y = y + 2;
			this.choca_abajo = true;
			this.choca_izquierda = true;
			this.choca_derecha = true;
		}
	}

	// C1
		public void girarx1(String Cod_pieza, String orientacion) {

			// T
			if (Cod_pieza.equals("T") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Abajo")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Original")) {
				this.x = x + 2;
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
			} else if (Cod_pieza.equals("I") && orientacion.equals("Abajo")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// O
			} else if (Cod_pieza.equals("O") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Abajo")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Original")) {
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
			} else if (Cod_pieza.equals("S") && orientacion.equals("Abajo")) {
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
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Abajo")) {
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
			} else if (Cod_pieza.equals("L") && orientacion.equals("Abajo")) {
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
			} else if (Cod_pieza.equals("R") && orientacion.equals("Abajo")) {
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

		public void girary1(String Cod_pieza, String orientacion) {

			// T
			if (Cod_pieza.equals("T") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// I
			} else if (Cod_pieza.equals("I") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// O
			} else if (Cod_pieza.equals("O") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// S
			} else if (Cod_pieza.equals("S") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// Z
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// L
			} else if (Cod_pieza.equals("L") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// R
			} else if (Cod_pieza.equals("R") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			}
		}
		// C2
		public void girarx2(String Cod_pieza, String orientacion) {

			// T
			if (Cod_pieza.equals("T") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Abajo")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Original")) {
				this.x = x + 2;
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
			} else if (Cod_pieza.equals("I") && orientacion.equals("Abajo")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// O
			} else if (Cod_pieza.equals("O") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Abajo")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Original")) {
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
			} else if (Cod_pieza.equals("S") && orientacion.equals("Abajo")) {
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
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Abajo")) {
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
			} else if (Cod_pieza.equals("L") && orientacion.equals("Abajo")) {
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
			} else if (Cod_pieza.equals("R") && orientacion.equals("Abajo")) {
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

		public void girary2(String Cod_pieza, String orientacion) {

			// T
			if (Cod_pieza.equals("T") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// I
			} else if (Cod_pieza.equals("I") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// O
			} else if (Cod_pieza.equals("O") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// S
			} else if (Cod_pieza.equals("S") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// Z
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// L
			} else if (Cod_pieza.equals("L") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// R
			} else if (Cod_pieza.equals("R") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			}
		}
		// C3
		public void girarx3(String Cod_pieza, String orientacion) {

			// T
			if (Cod_pieza.equals("T") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Abajo")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Original")) {
				this.x = x + 2;
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
			} else if (Cod_pieza.equals("I") && orientacion.equals("Abajo")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Original")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// O
			} else if (Cod_pieza.equals("O") && orientacion.equals("Derecha")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Izquierda")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Abajo")) {
				this.x = x + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Original")) {
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
			} else if (Cod_pieza.equals("S") && orientacion.equals("Abajo")) {
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
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Abajo")) {
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
			} else if (Cod_pieza.equals("L") && orientacion.equals("Abajo")) {
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
			} else if (Cod_pieza.equals("R") && orientacion.equals("Abajo")) {
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

		public void girary3(String Cod_pieza, String orientacion) {

			// T
			if (Cod_pieza.equals("T") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// I
			} else if (Cod_pieza.equals("I") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("I") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// O
			} else if (Cod_pieza.equals("O") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("O") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// S
			} else if (Cod_pieza.equals("S") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("S") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// Z
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("Z") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// L
			} else if (Cod_pieza.equals("L") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("L") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;

				// R
			} else if (Cod_pieza.equals("R") && orientacion.equals("Derecha")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Izquierda")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Abajo")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("R") && orientacion.equals("Original")) {
				this.y = y + 2;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			}
		}
}
