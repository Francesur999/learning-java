package animales;

public class Insecto extends Animal {

	private boolean alas;

	private boolean antenas;

	private Enemigo[] enemigos;

	public String atributo;

	public Insecto(String nombre, int tpvida, boolean alas, boolean antenas) {

		super(nombre, tpvida);

		this.alas = alas;
		this.antenas = antenas;
		atributo = "Soy insecto";
		enemigos = new Enemigo[5];
	}

	public boolean isAlas() {
		return alas;
	}

	public void setAlas(boolean alas) {
		this.alas = alas;
	}

	public boolean isAntenas() {
		return antenas;
	}

	public void setAntenas(boolean antenas) {
		this.antenas = antenas;
	}

	public Enemigo[] getEnemigos() {
		return enemigos;
	}

	public void setEnemigo(String enemigo) {

		int x = 0;

		for (int i = 0; i < 5; i++) {

			if (enemigos[x] == null) {

				enemigos[x] = new Enemigo(enemigo);
			}
			x++;

		}

	}

	class Enemigo {

		private String nombre;

		public Enemigo(String nombre) {
			super();
			this.nombre = nombre;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

	}

}
