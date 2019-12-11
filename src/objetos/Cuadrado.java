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
	
	

	
}
