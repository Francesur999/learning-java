package alumnoCesur;

class Administrativo {
	
	
	// Atributos

	String nombre;
	int edad;
	boolean idiomas ;
	
	//Constructor
	
	public Administrativo(String nombre, int edad, boolean idiomas) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.idiomas = idiomas;
	}
	
	public Administrativo(String nombre) {
		super();
		this.nombre = nombre;
		this.idiomas = false;
	}
	
	//Getters y Setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean isIdiomas() {
		return idiomas;
	}
	public void setIdiomas(boolean idiomas) {
		this.idiomas = idiomas;
	}
	

}