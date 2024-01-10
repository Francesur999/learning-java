package animales;

public class Animal {

	private String nombre;
	private int tpvida;

	protected Animal(String nombre, int tpvida) {

		this.nombre = nombre;

		if ((tpvida > 0) && (tpvida < 150)) {

			this.tpvida = tpvida;

		} else {

			tpvida = 0;

		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTpvida() {
		return tpvida;
	}

	public void setTpvida(int tpvida) {
		this.tpvida = tpvida;
	}

}
