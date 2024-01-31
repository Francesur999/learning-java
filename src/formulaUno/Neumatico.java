package formulaUno;

public class Neumatico {

	private final int idNeumatico;
	private final int material;
	private Ingeniero ingeniero;
	private final int tipo;
	private final int trabIng;

	public Neumatico(int idNeumatico, int material, Ingeniero ingeniero, int tipo) {
		super();
		this.trabIng = ingeniero.getTrabajo();
		this.idNeumatico = idNeumatico;
		this.material = material;
		this.ingeniero = ingeniero;
		this.tipo = tipo;
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

	public void setIngeniero(Ingeniero ingeniero) {
		this.ingeniero = ingeniero;
	}

	public int getTipo() {
		return tipo;
	}
	
	public int getConstruido() {
		
		return((material + tipo + trabIng)/3);
	}

}
