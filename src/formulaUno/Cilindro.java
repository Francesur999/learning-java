package formulaUno;

public class Cilindro {
	private final int idCilindro;
	private final int capacidad;
	private final int material;
	private Ingeniero ingeniero;
	private final int trabIng;

	public Cilindro(int idCilindro, int capacidad, int material, Ingeniero ingeniero) {
		super();
		this.trabIng = ingeniero.getTrabajo();
		this.idCilindro = idCilindro;
		this.capacidad = capacidad;
		this.material = material;
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

	public void setIngeniero(Ingeniero ingeniero) {
		this.ingeniero = ingeniero;
	}

	public int getConstruido() {

		return ((material + capacidad + trabIng) / 3);
	}

}
