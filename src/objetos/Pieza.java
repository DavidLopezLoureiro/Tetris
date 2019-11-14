package objetos;

public class Pieza {

	private String Cod_pieza;
	private String orientacion;
	private Cuadrado c0;
	private Cuadrado c1;
	private Cuadrado c2;
	private Cuadrado c3;

	public Pieza(String cod_pieza, String orientacion, Cuadrado c0, Cuadrado c1, Cuadrado c2, Cuadrado c3) {
		super();
		Cod_pieza = cod_pieza;
		this.orientacion = orientacion;
		this.c0 = c0;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}

	public Cuadrado getc0() {
		return c0;
	}
	
	public Cuadrado getc1() {
		return c1;
	}
	
	public Cuadrado getc2() {
		return c2;
	}
	
	public Cuadrado getc3() {
		return c3;
	}
	
	public String getCod_pieza() {
		return Cod_pieza;
	}

	public String getOrientacion() {
		return orientacion;
	}

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
