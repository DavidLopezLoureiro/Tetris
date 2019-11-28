package objetos;

public class Pieza {

	protected static String Cod_pieza;
	protected static Orientacion orientacion;
	protected static Cuadrado c0;
	protected static Cuadrado c1;
	protected static Cuadrado c2;
	protected static Cuadrado c3;
	
	public enum Orientacion { ORIGINAL, IZQUIERDA, ALREVES, DERECHA }
	
	
	/**
	 * Constructor de piezas.
	 */
	public Pieza() {
		super();
		Pieza.orientacion = Pieza.Orientacion.ORIGINAL;
		}
	
	
	
	//PIEZA
	
			/**
			 * Devuelve el codigo de la pieza..
			 * 
			 * @return Cod_pieza --> String codigo de la pieza.
			 */
			public static String getCod_pieza() {
				return Cod_pieza;
			}
		
		
			/**
			 * Devuelve la orientacion de la pieza..
			 * 
			 * @return orientacion --> String orientacion de la pieza.
			 */
			public static Orientacion getOrientacion() {
				return orientacion;
			}

	
	
	//CUADRADOS
			
			/**
			 * Devuelve el cuadrado 0.
			 * 
			 * @return c0 --> Cuadrado 0 de la pieza.
			 */
			public static Cuadrado getc0() {
				return c0;
			}
			
			/**
			 * Devuelve el cuadrado 1.
			 * 
			 * @return c1 --> Cuadrado 1 de la pieza.
			 */
			public static Cuadrado getc1() {
				return c1;
			}
			
			/**
			 * Devuelve el cuadrado 2.
			 * 
			 * @return c2 --> Cuadrado 2 de la pieza.
			 */
			public static Cuadrado getc2() {
				return c2;
			}
			
			/**
			 * Devuelve el cuadrado 3.
			 * 
			 * @return c3 --> Cuadrado 0 de la pieza.
			 */
			public static Cuadrado getc3() {
				return c3;
			}
	
			
	
}
