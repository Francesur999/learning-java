package topGun;

public class Combate extends Avion {

	private boolean esFurtivo;

	// CONSTRUCTOR

	public Combate(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean esFurtivo) {
		super(idAvion, modAvion, capAvion, piloto);
		this.esFurtivo = esFurtivo;
	}

	// GETTERS Y SETTERS
	public boolean isEsFurtivo() {
		return esFurtivo;
	}

	public void setEsFurtivo(boolean esFurtivo) {
		this.esFurtivo = esFurtivo;
	}

}
