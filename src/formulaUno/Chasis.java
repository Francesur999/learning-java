package formulaUno;

public class Chasis {

	private final int idChasis;
	private final int material;
	private Ingeniero ingeniero;
	private final int trabIng;

	public Chasis(int idChasis, int material, Ingeniero ingeniero) {
		super();
		this.trabIng = ingeniero.getTrabajo();
		this.idChasis = idChasis;
		this.material = material;
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

	public void setIngeniero(Ingeniero ingeniero) {
		this.ingeniero = ingeniero;
	}

	public int getConstruido() {

		return ((material +  trabIng) / 3);
	}

}
