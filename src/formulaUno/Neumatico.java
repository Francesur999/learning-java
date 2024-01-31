package formulaUno;

import java.util.Random;

public class Neumatico {

	private enum tipoDureza {
		blando, medio, duro
	};

	private tipoDureza dureza;

	private final int idNeumatico;
	private final int material;
	private final Ingeniero ingeniero;
	private final int trabIng;

	public Neumatico(int idNeumatico, int material, Ingeniero ingeniero) {
		super();
		Random aleatorio = new Random();
		this.trabIng = ingeniero.getTrabajo();
		this.idNeumatico = idNeumatico;
		this.material = aleatorio.nextInt(10);
		;
		this.ingeniero = ingeniero;
		this.dureza = null;
	}

	public int getIdNeumatico() {
		return idNeumatico;
	}

	public int getMaterial() {
		return material;
	}

	public Ingeniero getIngeniero() {
		return ingeniero;
	}

	public tipoDureza getDureza() {
		return dureza;
	}

	public void setDureza(String dureza) {

		switch (dureza) {

		case "blando":

			this.dureza = tipoDureza.blando;
			break;
		case "medio":
			this.dureza = tipoDureza.medio;
			break;
		case "duro":
			this.dureza = tipoDureza.duro;
			break;
		default:
			System.out.println("Puto inutil");

		}

	}

	public void setDureza(tipoDureza dureza) {
		
		this.dureza = dureza;
	}

	public int construido() {

		return ((material + trabIng) / 3);
	}

}
