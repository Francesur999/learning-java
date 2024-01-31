package formulaUno;

import java.util.Random;

public class Chasis {

	private final int idChasis;
	private final int material;
	private final Ingeniero ingeniero;
	private final int trabIng;

	public Chasis(int idChasis, int material, Ingeniero ingeniero) {
		super();
		Random aleatorio = new Random();
		this.trabIng = ingeniero.getTrabajo();
		this.idChasis = idChasis;
		this.material = aleatorio.nextInt(10);
		;
		this.ingeniero = ingeniero;
	}

	public int getIdChasis() {
		return idChasis;
	}

	public int getMaterial() {
		return material;
	}

	public Ingeniero getIngeniero() {
		return ingeniero;
	}

	public int construido() {

		return ((material + trabIng) / 3);
	}

}
