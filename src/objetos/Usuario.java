package objetos;

public class Usuario {
	private String Nombre;
	private String contra;
	private int maxPuntu;
	private String email;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getContra() {
		return contra;
	}
	public void setContra(String contra) {
		this.contra = contra;
	}
	public int getMaxPuntu() {
		return maxPuntu;
	}
	public void setMaxPuntu(int maxPuntu) {
		this.maxPuntu = maxPuntu;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Usuario(String nombre, String contra, int maxPuntu, String email) {
		super();
		Nombre = nombre;
		this.contra = contra;
		this.maxPuntu = maxPuntu;
		this.email = email;
	}
	
	

}
