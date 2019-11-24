package imagenes;

public class AsignadorDeFotosDePiezas {
	
	
	public static String poner_foto(String cod_pieza) {
		
		if(cod_pieza.equals("T")) {
			
			return "/imagenes/T.png";
			
		}else if(cod_pieza.equals("I")) {
			
			return "/imagenes/I.png";
			
		}else if(cod_pieza.equals("O")) {
		
			return "/imagenes/O.png";
			
		}else if(cod_pieza.equals("L")) {
		
			return "/imagenes/L.png";
			
		}else if(cod_pieza.equals("R")) {
		
			return "/imagenes/R.png";
			
		}else if(cod_pieza.equals("S")) {
	
			return "/imagenes/S.png";
			
		}else if(cod_pieza.equals("Z")) {
	
			return "/imagenes/Z.png";
			
		}
		
		return null;
		
		
	}
	

}
