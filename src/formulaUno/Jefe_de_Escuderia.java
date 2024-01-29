package formulaUno;

public class Jefe_de_Escuderia extends Persona {
	
	private int inteligencia;
	private int liderazgo;
	private int experiencia;
	
	public Jefe_de_Escuderia(int edad, String nombre, int dni, int inteligencia, int liderazgo, int experiencia) {
		super(edad, nombre, dni);
		this.inteligencia = inteligencia;
		this.liderazgo = liderazgo;
		this.experiencia = experiencia;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getLiderazgo() {
		return liderazgo;
	}

	public void setLiderazgo(int liderazgo) {
		this.liderazgo = liderazgo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	
}
