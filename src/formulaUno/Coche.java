package formulaUno;

public class Coche{

	private final Escuderia Coche;
	private final String modelo;
	private Chasis chasis;
	private Neumatico neumaticos;
	private Motor motor;
	private Ingeniero ingeniero;
	
	public Coche(Escuderia escuderia, String modelo, Chasis chasis, Neumatico neumaticos, Motor motor, Ingeniero ingeniero) {
		super();
		Coche = escuderia;
		this.modelo = modelo;
		this.chasis = chasis;
		this.neumaticos = neumaticos;
		this.motor = motor;
		this.ingeniero = ingeniero;
	}

	public Chasis getChasis() {
		return chasis;
	}

	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}

	public Neumatico getNeumaticos() {
		return neumaticos;
	}

	public void setNeumaticos(Neumatico neumaticos) {
		this.neumaticos = neumaticos;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Ingeniero getIngeniero() {
		return ingeniero;
	}

	public void setIngeniero(Ingeniero ingeniero) {
		this.ingeniero = ingeniero;
	}

	public String getModelo() {
		return modelo;
	}
	
	
}