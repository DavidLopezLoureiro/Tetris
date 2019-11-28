package objetos;

public class Pieza {

	private String Cod_pieza;
	private String orientacion;
	private Cuadrado c0;
	private Cuadrado c1;
	private Cuadrado c2;
	private Cuadrado c3;

	
	/**
	 * ¡¡NO LLAMAR!! Constructor de piezas. (se usa mediante el metodo de la clase crear pieza)
	 * 
	 * @param cod_pieza --> String del codigo de la pieza.
	 * 
	 * @param orientacion --> String orientacion de la pieza.
	 * 
	 * @param c0 --> Cuadrado 0 de la pieza.
	 * 
	 * @param c1 --> Cuadrado 1 de la pieza.
	 * 
	 * @param c2 --> Cuadrado 2 de la pieza.
	 * 
	 * @param c3 --> Cuadrado 3 de la pieza.
	 * 
	 */
	public Pieza(String cod_pieza, String orientacion, Cuadrado c0, Cuadrado c1, Cuadrado c2, Cuadrado c3) {
		super();
		Cod_pieza = cod_pieza;
		this.orientacion = orientacion;
		this.c0 = c0;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}

	/**
	 * Devuelve el cuadrado 0.
	 * 
	 * @return c0 --> Cuadrado 0 de la pieza.
	 */
	public Cuadrado getc0() {
		return c0;
	}
	
	/**
	 * Devuelve el cuadrado 1.
	 * 
	 * @return c1 --> Cuadrado 1 de la pieza.
	 */
	public Cuadrado getc1() {
		return c1;
	}
	
	/**
	 * Devuelve el cuadrado 2.
	 * 
	 * @return c2 --> Cuadrado 2 de la pieza.
	 */
	public Cuadrado getc2() {
		return c2;
	}
	
	/**
	 * Devuelve el cuadrado 3.
	 * 
	 * @return c3 --> Cuadrado 0 de la pieza.
	 */
	public Cuadrado getc3() {
		return c3;
	}
	
	/**
	 * Devuelve el codigo de la pieza..
	 * 
	 * @return Cod_pieza --> String codigo de la pieza.
	 */
	public String getCod_pieza() {
		return Cod_pieza;
	}

	
	/**
	 * Devuelve la orientacion de la pieza..
	 * 
	 * @return orientacion --> String orientacion de la pieza.
	 */
	public String getOrientacion() {
		return orientacion;
	}

	/**
	 * Cambia la orientacion de la pieza a la orientacion siguiente de la cadena de orientaciones -> (ORIGINAL --> DERECHA --> ALREVES --> IZQUIERDA --> ORIGINAL -->...)
	 *
	 */
	public void setOrientacion() {
		
		if(orientacion.equals("Original")) {
			
			orientacion = "Derecha";
			
		}else if(orientacion.equals("Derecha")) {
			
			orientacion = "Alreves";
			
		}else if(orientacion.equals("Alreves")) {
			
			orientacion = "Izquierda";
			
		}else if(orientacion.equals("Izquierda")) {
			
			orientacion = "Original";
		}

		c0.girar0(Cod_pieza, orientacion);
		

		c1.girar1(Cod_pieza, orientacion);
	

		c2.girar2(Cod_pieza, orientacion);
		

		c3.girar3(Cod_pieza, orientacion);
		
	}

}
