package formulaUno;
import java.util.Random;
public class Piloto extends Persona {

	private final int reflejos;

	private final int inteligencia;

	private final int agresividad;

	private int experiencia;

	public Piloto(int edad, String nombre, int dni, int reflejos, int inteligencia, int agresividad, int experiencia) {
		super(edad, nombre, dni);
		Random aleatorio = new Random ();
		this.reflejos =  aleatorio.nextInt(10);
		this.inteligencia = aleatorio.nextInt(10);;
		this.agresividad = aleatorio.nextInt(10);;
		this.experiencia = aleatorio.nextInt(10);;
	}

	public int getReflejos() {
		return reflejos;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public int getAgresividad() {
		return agresividad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

}
