package formulaUno;

public class Turbo {

	private final int idTurbo;
	private final int rpm;
	private final int tamaño;
	private Ingeniero ingeniero;
	private final int trabIng;

	public Turbo(int idTurbo, int rpm, int tamaño, Ingeniero ingeniero) {
		super();
		this.trabIng = ingeniero.getTrabajo();
		this.idTurbo = idTurbo;
		this.rpm = rpm;
		this.tamaño = tamaño;
		this.ingeniero = ingeniero;
	}

	public int getIdTurbo() {
		return idTurbo;
	}

	public int getRpm() {
		return rpm;
	}

	public int getTamaño() {
		return tamaño;
	}

	public Ingeniero getIngeniero() {
		return ingeniero;
	}

	public void setIngeniero(Ingeniero ingeniero) {
		this.ingeniero = ingeniero;
	}
	
public int getConstruido() {
		
		return((rpm + tamaño + trabIng)/3);
	}

}
