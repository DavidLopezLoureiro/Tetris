package objetos;

import java.util.ArrayList;

import interfaz.Ventana;
import objetos.Pieza;

public class CreadorDePiezas {
	


	/**Crea la lista de piezas por primera vez.
	 * 
	 * @return lista -->  ArrayList de Strings de ccodigos de piezas.
	 * 
	 **/
	public static ArrayList<String> crear_lista_pirmera_vez() {

		ArrayList<String> lista = new ArrayList<String>();
		
		for (int j=0 ; j<4 ; j++) {
			
			 int numero = (int)Math.floor(Math.random()*(6-0+1)+0);
			
			if(numero == 0) {
				
				lista.add("T");
				
			}else if(numero == 1) {
				
				lista.add("I");
			
			}else if(numero == 2) {
		
				lista.add("O");
				
			}else if(numero == 3) {

				lista.add("L");
				
			}else if(numero == 4) {
	
				lista.add("R");
				
			}else if(numero == 5) {

				lista.add("S");
				
			}else if(numero == 6) {

				lista.add("Z");
				
			}
			
		}
		
		return lista;	
	}
	

	/**
	 * Metodo usado para el cambio de piezas entre la pieza que esta en juego y la pieza que esta guardada.
	 * 
	 * @param transito --> String del codigo de la pieza que esta guardada en este momento y la cual sa cambiara por la pieza actual en juego.
	 * 
	 * @return t -->  Pieza que estaba guardada y ahora esta en juego.
	 * 
	 **/
	public static Pieza mover_guardada(String transito) {
		
			
			if(transito.equals("T")) {
				
				PiezaT t = new PiezaT();
				
				return t;
				
			}else if(transito.equals("I")) {
				
				PiezaI t = new PiezaI();
				
				return t;
				
			}else if(transito.equals("O")) {
				
				PiezaO t = new PiezaO();
				
				return t;
				
			}else if(transito.equals("L")) {
				
				PiezaL t = new PiezaL();
				
				return t;
				
			}else if(transito.equals("R")) {
				
				PiezaR t = new PiezaR();
				
				return t;
				
			}else if(transito.equals("S")) {
				
				PiezaS t = new PiezaS();
			
				return t;
				
			}else if(transito.equals("Z")) {
				
				PiezaZ t = new PiezaZ();
				
				return t;
				
			}
			
			return null;
		
	}
	
	/**
	 * Metodo para sacar la siguiente pieza de la lista, mover las otras una posicion en la lista y a�adir una nueva pieza aleatoria a la lista.
	 * 
	 * @return t -->  Pieza siguiente en la lista que ahora esta en juego.
	 * 
	 **/
	public static Pieza mover_lista() {
		
		 int numero = (int)Math.floor(Math.random()*(6-0+1)+0);
		 
		 String pieza = Ventana.lista.get(0);
		 Ventana.lista.remove(0);
			
			if(numero == 0) {
				
				Ventana.lista.add("T");
				
			}else if(numero == 1) {
				
				 Ventana.lista.add("I");
			
			}else if(numero == 2) {
		
				 Ventana.lista.add("O");
				
			}else if(numero == 3) {

				 Ventana.lista.add("L");
				
			}else if(numero == 4) {
	
				 Ventana.lista.add("R");
				
			}else if(numero == 5) {

				 Ventana.lista.add("S");
				
			}else if(numero == 6) {

				 Ventana.lista.add("Z");
				
			}
			
			if(pieza.equals("T")) {
				
				PiezaT t = new PiezaT();
				
				return t;
				
			}else if(pieza.equals("I")) {
				
				PiezaI t = new PiezaI();
				
				return t;
				
			}else if(pieza.equals("O")) {
				
				PiezaO t = new PiezaO();
				
				return t;
				
			}else if(pieza.equals("L")) {
				
				PiezaL t = new PiezaL();
				
				return t;
				
			}else if(pieza.equals("R")) {
				
				PiezaR t = new PiezaR();
				
				return t;
				
			}else if(pieza.equals("S")) {
				
				PiezaS t = new PiezaS();
			
				return t;
				
			}else if(pieza.equals("Z")) {
				
				PiezaZ t = new PiezaZ();
				
				return t;
				
			}
			
			return null;
		
	}
	
	
}
