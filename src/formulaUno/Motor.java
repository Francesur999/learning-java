package formulaUno;

public class Motor {
    
	private int idMotor;
	private Cilindro cilindro;
	private Turbo turbo;
	private Ingeniero ingeniero;
	
	public Motor(int idMotor, Cilindro cilindro, Turbo turbo, Ingeniero ingeniero) {
		super();
		this.idMotor = idMotor;
		this.cilindro = cilindro;
		this.turbo = turbo;
		this.ingeniero = ingeniero;
	}

	public int getIdMotor() {
		return idMotor;
	}

	public void setIdMotor(int idMotor) {
		this.idMotor = idMotor;
	}

	public Cilindro getCilindro() {
		return cilindro;
	}

	public void setCilindro(Cilindro cilindro) {
		this.cilindro = cilindro;
	}

	public Turbo getTurbo() {
		return turbo;
	}

	public void setTurbo(Turbo turbo) {
		this.turbo = turbo;
	}

	public Ingeniero getIngeniero() {
		return ingeniero;
	}

	public void setIngeniero(Ingeniero ingeniero) {
		this.ingeniero = ingeniero;
	}
	
	
	
}
