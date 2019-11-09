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

	public String getCod_pieza() {
		return Cod_pieza;
	}

	public String getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(String orientacion) {

		c0.girarx0(Cod_pieza, orientacion);
		c0.girary0(Cod_pieza, orientacion);

		c1.girarx1(Cod_pieza, orientacion);
		c1.girary1(Cod_pieza, orientacion);

		c2.girarx2(Cod_pieza, orientacion);
		c2.girary2(Cod_pieza, orientacion);

		c3.girarx3(Cod_pieza, orientacion);
		c3.girary3(Cod_pieza, orientacion);

		this.orientacion = orientacion;
	}

}
