package formulaUno;

import java.util.Random;

public class Ingeniero extends Persona {

	private final int inteligencia;

	private final int innovacion;

	private int experiencia;

	public Ingeniero(int edad, String nombre, int dni, int inteligencia, int innovacion, int experiencia) {
		super(edad, nombre, dni);
		Random aleatorio = new Random ();
		this.inteligencia = aleatorio.nextInt(10);;
		this.innovacion = aleatorio.nextInt(10);;
		this.experiencia = aleatorio.nextInt(10);;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public int getInnovacion() {
		return innovacion;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	public int getTrabajo() {
		
		return((inteligencia + innovacion + experiencia)/3);
	}
	

}
