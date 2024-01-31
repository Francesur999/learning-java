package formulaUno;

import java.util.Random;

public class Mecanico extends Persona {

	private final int velocidad;

	private int experiencia;

	public Mecanico(int edad, String nombre, int dni, int velocidad, int experiencia) {
		super(edad, nombre, dni);
		Random aleatorio = new Random();
		this.velocidad = aleatorio.nextInt(10);
		;
		this.experiencia = aleatorio.nextInt(10);
		;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

}
