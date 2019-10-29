package objetos;

public class Usuario {
	private String Nombre;
	private String contra;
	private int maxPuntu;
	private String email;
	public String getNombre() {
		return Nombre;
	}
	
	/**
	 * Asigna el nombre del usuario.
	 * 
	 * @param nombre --> nombre del usuario. 
	 * 
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	/**
	 * Devuelve la contrase�a.
	 * 
	 * @return contra --> contrase�a del usuario.
	 */
	public String getContra() {
		return contra;
	}
	
	/**
	 * Asigna la contrase�a del usuario.
	 * 
	 * @param contra --> contrase�a del usuario. 
	 * 
	 */
	public void setContra(String contra) {
		this.contra = contra;
	}
	
	/**
	 * Devuelve la puntuacion maxima.
	 * 
	 * @return maxPuntu --> puntuacion maxima. 
	 * 
	 */
	public int getMaxPuntu() {
		return maxPuntu;
	}
	
	/**
	 * Asigna la puntuacion maxima del usuario.
	 * 
	 * @param maxPuntu --> puntuacion maxima del usuario. 
	 * 
	 */
	public void setMaxPuntu(int maxPuntu) {
		this.maxPuntu = maxPuntu;
	}
	
	/**
	 * Devuelve el email del usuario.
	 * 
	 * @return email --> email del usuario. 
	 * 
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Asigna el email al usuario.
	 * 
	 * @param email --> email del usuario. 
	 * 
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Crea un usuario con puntuacion.
	 * 
	 * @param nombre --> nombre del usuario.
	 * 
	 * @param contra --> contraase�a del usuario.
	 * 
	 * @param maxPuntu --> maxima puntuacion del usuario.
	 * 
	 * @param email --> email del usuario.
	 * 
	 */
	public Usuario(String nombre, String contra, int maxPuntu, String email) {
		super();
		Nombre = nombre;
		this.contra = contra;
		this.maxPuntu = maxPuntu;
		this.email = email;
	}
	
	/**
	 * Crea un usuario sin puntuacion.
	 * 
	 * @param nombre --> nombre del usuario.
	 * 
	 * @param contra --> contraase�a del usuario.
	 * 
	 * @param email --> email del usuario.
	 * 
	 */
	public Usuario(String nombre,String contra,String email) {
		super();
		Nombre = nombre;
		this.contra = contra;
		this.maxPuntu=0;
		this.email = email;
	}
	

}