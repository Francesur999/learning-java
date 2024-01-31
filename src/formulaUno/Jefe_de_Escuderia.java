package formulaUno;

import java.util.Random;

public class Jefe_de_Escuderia extends Persona {
	
	private final int inteligencia;
	private final int liderazgo;
	private int experiencia;
	
	public Jefe_de_Escuderia(int edad, String nombre, int dni, int inteligencia, int liderazgo, int experiencia) {
		super(edad, nombre, dni);
		Random aleatorio = new Random ();
		this.inteligencia = aleatorio.nextInt(10);;
		this.liderazgo = aleatorio.nextInt(10);;
		this.experiencia = aleatorio.nextInt(10);;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	

	public int getLiderazgo() {
		return liderazgo;
	}



	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	
}
