package formulaUno;

import java.util.Random;

public class Turbo {

	private final int idTurbo;
	private final int rpm;
	private final int tamaño;
	private final Ingeniero ingeniero;
	private final int trabIng;

	public Turbo(int idTurbo, int rpm, int tamaño, Ingeniero ingeniero) {
		super();
		Random aleatorio = new Random();
		this.trabIng = ingeniero.getTrabajo();
		this.idTurbo = idTurbo;
		this.rpm = aleatorio.nextInt(10);
		;
		this.tamaño = aleatorio.nextInt(10);
		;
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

	public int construido() {

		return ((rpm + tamaño + trabIng) / 3);
	}

}
