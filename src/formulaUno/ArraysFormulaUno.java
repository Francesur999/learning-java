package formulaUno;

    class MiArrayCoche {

	private Coche[] coche;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	MiArrayCoche(int longitud) {
		numElem = 0;
		coche = new Coche[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			coche[i] = null;
		}

	}

	MiArrayCoche() {
		numElem = 0;
		coche = new Coche[lONGITUD_DEFAULT];
		for (int i = 0; i < coche.length; i = i + 1) {
			coche[i] = null;
		}
	}

	public int getNumElem() {
		return numElem;
	}

	public Coche[] getMiArray() {
		return coche;
	}

	public Coche getIntMiArray(int posicion) {
		if ((posicion < coche.length) && (posicion >= 0)) {
			return coche[posicion];
		} else {
			return null; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < coche.length; i++) {
			coche[i] = null;
			numElem = 0;
		}

	}

	public void insertarValor(Coche valor) {
		if (numElem == coche.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			coche[numElem] = valor;
			numElem++;
		}
	}

}

class MiArrayPiloto {

	private Piloto[] piloto;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	MiArrayPiloto(int longitud) {
		numElem = 0;
		piloto = new Piloto[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			piloto[i] = null;
		}

	}

	MiArrayPiloto() {
		numElem = 0;
		piloto = new Piloto[lONGITUD_DEFAULT];
		for (int i = 0; i < piloto.length; i = i + 1) {
			piloto[i] = null;
		}
	}

	public int getNumElem() {
		return numElem;
	}

	public Piloto[] getMiArray() {
		return piloto;
	}

	public Piloto getIntMiArray(int posicion) {
		if ((posicion < piloto.length) && (posicion >= 0)) {
			return piloto[posicion];
		} else {
			return null; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < piloto.length; i++) {
			piloto[i] = null;
			numElem = 0;
		}

	}

	public void insertarValor(Piloto valor) {
		if (numElem == piloto.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			piloto[numElem] = valor;
			numElem++;
		}
	}

}

class MiArrayIngeniero {

	private Ingeniero[] ingeniero;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	MiArrayIngeniero(int longitud) {
		numElem = 0;
		ingeniero = new Ingeniero[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			ingeniero[i] = null;
		}

	}

	MiArrayIngeniero() {
		numElem = 0;
		ingeniero = new Ingeniero[lONGITUD_DEFAULT];
		for (int i = 0; i < ingeniero.length; i = i + 1) {
			ingeniero[i] = null;
		}
	}

	public int getNumElem() {
		return numElem;
	}

	public Ingeniero[] getMiArray() {
		return ingeniero;
	}

	public Ingeniero getIntMiArray(int posicion) {
		if ((posicion < ingeniero.length) && (posicion >= 0)) {
			return ingeniero[posicion];
		} else {
			return null; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < ingeniero.length; i++) {
			ingeniero[i] = null;
			numElem = 0;
		}

	}

	public void insertarValor(Ingeniero valor) {
		if (numElem == ingeniero.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			ingeniero[numElem] = valor;
			numElem++;
		}
	}

}

class MiArrayMecanico {

	private Mecanico[] mecanico;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	MiArrayMecanico(int longitud) {
		numElem = 0;
		mecanico = new Mecanico[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			mecanico[i] = null;
		}

	}

	MiArrayMecanico() {
		numElem = 0;
		mecanico = new Mecanico[lONGITUD_DEFAULT];
		for (int i = 0; i < mecanico.length; i = i + 1) {
			mecanico[i] = null;
		}
	}

	public int getNumElem() {
		return numElem;
	}

	public Mecanico[] getMiArray() {
		return mecanico;
	}

	public Mecanico getIntMiArray(int posicion) {
		if ((posicion < mecanico.length) && (posicion >= 0)) {
			return mecanico[posicion];
		} else {
			return null; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < mecanico.length; i++) {
			mecanico[i] = null;
			numElem = 0;
		}

	}

	public void insertarValor(Mecanico valor) {
		if (numElem == mecanico.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			mecanico[numElem] = valor;
			numElem++;
		}
	}

}