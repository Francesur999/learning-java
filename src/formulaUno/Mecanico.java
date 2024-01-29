package formulaUno;

public class Mecanico extends Persona {

	private int velocidad;
	
	private int experiencia;

	public Mecanico(int edad, String nombre, int dni, int velocidad, int experiencia) {
		super(edad, nombre, dni);
		this.velocidad = velocidad;
		this.experiencia = experiencia;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
}
