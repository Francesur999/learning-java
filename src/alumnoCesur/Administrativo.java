package alumnoCesur;

class Administrativo extends Persona{
	
	
	// Atributos
	
	
	private boolean idiomas ;
	
	//Constructor
	
	public Administrativo(String nombre, int edad, boolean idiomas) {
		super(nombre, edad);
		this.idiomas = idiomas;
	}
	
	public Administrativo(String nombre) {
		
		super(nombre, 0);
		this.idiomas = false;
	}
	
	//Getters y Setters
	
	public boolean isIdiomas() {
		return idiomas;
	}
	public void setIdiomas(boolean idiomas) {
		this.idiomas = idiomas;
	}
	

}