package formulaUno;

import java.util.Random;

public class Cilindro {
	private final int idCilindro;
	private final int capacidad;
	private final int material;
	private final Ingeniero ingeniero;
	private final int trabIng;

	public Cilindro(int idCilindro, int capacidad, int material, Ingeniero ingeniero) {
		super();
		Random aleatorio = new Random();
		this.trabIng = ingeniero.getTrabajo();
		this.idCilindro = idCilindro;
		this.capacidad = aleatorio.nextInt(10);
		;
		this.material = aleatorio.nextInt(10);
		;
		this.ingeniero = ingeniero;
	}

	public int getIdCilindro() {
		return idCilindro;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getMaterial() {
		return material;
	}

	public Ingeniero getIngeniero() {
		return ingeniero;
	}

	public int construido() {

		return ((material + capacidad + trabIng) / 3);
	}

}
