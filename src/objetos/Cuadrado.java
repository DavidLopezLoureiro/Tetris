package objetos;

public class Cuadrado {

	private String Cod_cuadrado; //Cod_pieza + "_n"
	private int x;
	private int y;
	private boolean choca_abajo;
	private boolean choca_izquierda;
	private boolean choca_derecha;

	
	/**
	 * ¡¡NO LLAMAR!! Constructor de cada cuadrado de la pieza. (se usa mediante el metodo de la clase crear pieza)
	 * 
	 * @param cod_cuadrado --> String del codigo del cuadrado.
	 * 
	 * @param color --> String del color del cuadrado.
	 * 
	 * @param x --> int de la posicion x del cuadrado.
	 * 
	 * @param y --> int de la posicion y del cuadrado.
	 * 
	 * @param choca_abajo --> boolean para saber si el cuadrado tiene contacto con la parte de abajo.
	 * 
	 * @param choca_izquierda --> boolean para saber si el cuadrado tiene contacto con la izquierda.
	 * 
	 * @param choca_derecha --> boolean para saber si el cuadrado tiene contacto con la derecha.
	 */
	public Cuadrado(String cod_cuadrado, int x, int y, boolean choca_abajo, boolean choca_izquierda, boolean choca_derecha) {	
		super();
		Cod_cuadrado = cod_cuadrado; 
		this.x = x;
		this.y = y;
		this.choca_abajo = choca_abajo;
		this.choca_izquierda = choca_izquierda;
		this.choca_derecha = choca_derecha;
	}
	
	//COD_CUADRADO
	
			/**
			 * Devuelve el codigo del cuadrado.
			 * 	
			 * @return color --> String del codigo del cuadrado.
			 */
			public String getCod_cuadrado() {
				return Cod_cuadrado;
			}
	
	//X
	
	/**
			 * Devuelve la x del cuadrado.
			 * 	
			 * @return x --> int de la x del cuadrado.
			 */
			public int getx() {
				return x;
			}
			
			/**
			 * Establece la x del cuadrado a lo que le pasemos.
			 * 	
			 * @param x --> int posicion x que queremos que el cuadrado tenga.
			 */
			public void setx(int x) {
				this.x = x;
			}
			
	//Y
			/**
			 * Devuelve la y del cuadrado.
			 * 	
			 * @return y --> int de la y del cuadrado.
			 */
			public int gety() {
				return y;
			}
			
	
			/**
			 * Establece la y del cuadrado a lo que le pasemos.
			 * 	
			 * @param y --> int posicion y que queremos que el cuadrado tenga.
			 */
			public void sety(int y) {
				this.y = y;
			}

	
	
	//ABAJO
		
			
			/**
			 * Devuelve el boolean choca_abajo del cuadrado.
			 * 	
			 * @return choca_abajo --> boolean que indica si el cuadrado choca con elementos debajo de el.
			 */
			public boolean getabajo() {
				return choca_abajo;
			}
			
		
			/**
			 * Establece el boolean de choca_abajo.
			 * 	
			 * @param choca_abajo --> boolean para saber si choca abajo.
			 */
			public void setchocha_abajo(boolean choca_abajo) {
				this.choca_abajo = choca_abajo;
			}
			
			
	//IZQUIERDA
			
			
			/**
			 * Devuelve el boolean choca_izquierda del cuadrado.
			 * 	
			 * @return choca_izquierda --> boolean que indica si el cuadrado choca con elementos a la izquierda de el.
			 */
			public boolean getizquierda() {
				return choca_izquierda;
			}
		
			
			/**
			 * Establece el boolean de choca_izquierda.
			 * 	
			 * @param choca_izquierda --> boolean para saber si choca por la izquierda.
			 */
			public void setchoca_izquierda(boolean choca_izquierda) {
				this.choca_izquierda = choca_izquierda;
			}
	
	//DERECHA
			
			
			/**
			 * Devuelve el boolean choca_derecha del cuadrado.
			 * 	
			 * @return choca_derecha --> boolean que indica si el cuadrado choca con elementos a la derecha de el.
			 */
			public boolean getderecha() {
				return choca_derecha;
			}	
			
			/**
			 * Establece el boolean de choca_derecha.
			 * 	
			 * @param choca_derecha --> boolean para saber si choca por la derecha.
			 */
			public void setchoca_derecha(boolean choca_derecha) {
				this.choca_derecha = choca_derecha;
			}
	
	// Codigo de referencia se borrara más adelante

	/**
	 * ¡¡ NO LLAMAR !! Gira el cuadrado 0 de la pieza. (Se llama mediante el metodo setOrientacion() de la clase Pieza)
	 * 	
	 * @param Cod_pieza --> String codigo de la pieza de la cual el cuadrado en cuestion forma parte.
	 * 
	 * @param orientacio --> String orientacion que tendra la pieza para calcular como gira el cuadrado.
	 */
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

	
		/**
		 * ¡¡ NO LLAMAR !! Gira el cuadrado 1 de la pieza. (Se llama mediante el metodo setOrientacion() de la clase Pieza)
		 * 	
		 * @param Cod_pieza --> String codigo de la pieza de la cual el cuadrado en cuestion forma parte.
		 * 
		 * @param orientacio --> String orientacion que tendra la pieza para calcular como gira el cuadrado.
		 */
		public void girar1(String Cod_pieza, String orientacion) {

			// T
			if (Cod_pieza.equals("T") && orientacion.equals("Derecha")) {
				this.x = x - 1;
				this.y = y - 1;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Izquierda")) {
				this.x = x + 1;
				this.y = y + 1;
				this.choca_abajo = false;
				this.choca_izquierda = true;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Alreves")) {
				this.x = x - 1;
				this.y = y + 1;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = false;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Original")) {
				this.x = x + 1;
				this.y = y - 1;
				choca_abajo = true;
				choca_izquierda = false;
				choca_derecha = true;

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

	
		/**
		 * ¡¡ NO LLAMAR !! Gira el cuadrado 2 de la pieza. (Se llama mediante el metodo setOrientacion() de la clase Pieza)
		 * 	
		 * @param Cod_pieza --> String codigo de la pieza de la cual el cuadrado en cuestion forma parte.
		 * 
		 * @param orientacio --> String orientacion que tendra la pieza para calcular como gira el cuadrado.
		 */
		public void girar2(String Cod_pieza, String orientacion) {

			// T
			if (Cod_pieza.equals("T") && orientacion.equals("Derecha")) {
				this.x = x - 1;
				this.y = y + 1;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = false;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Izquierda")) {
				this.x = x + 1;
				this.y = y - 1;
				this.choca_abajo = true;
				this.choca_izquierda = false;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Alreves")) {
				this.x = x + 1;
				this.y = y + 1;
				this.choca_abajo = false;
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

		/**
		 * ¡¡ NO LLAMAR !! Gira el cuadrado 3 de la pieza. (Se llama mediante el metodo setOrientacion() de la clase Pieza)
		 * 	
		 * @param Cod_pieza --> String codigo de la pieza de la cual el cuadrado en cuestion forma parte.
		 * 
		 * @param orientacio --> String orientacion que tendra la pieza para calcular como gira el cuadrado.
		 */
		public void girar3(String Cod_pieza, String orientacion) {

			// T
			if (Cod_pieza.equals("T") && orientacion.equals("Derecha")) {
				this.x = x + 1;
				this.y = y + 1;
				this.choca_abajo = false;
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
				this.choca_izquierda = false;
				this.choca_derecha = true;
			} else if (Cod_pieza.equals("T") && orientacion.equals("Original")) {
				this.x = x - 1;
				this.y = y + 1;
				this.choca_abajo = true;
				this.choca_izquierda = true;
				this.choca_derecha = false;

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
