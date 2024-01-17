package practicas;

public class SimuladorLista {

	public static void main(String[] args) {

		MiArray antonio;
		MiArray anthony;

		antonio = new MiArray();
		anthony = new MiArray(40);

	}

}

class MiArray {

	private int[] miArray;
	private int numElem = 0;
	private static final int LONGITUD_DEFAULT = 10;

	MiArray(int longitud) {
		numElem = 0;
		miArray = new int[longitud];

		for (int i = 0; i < miArray.length; i++) {

			miArray[i] = -1;

		}
	}

	MiArray() {
		numElem = 0;
		miArray = new int[LONGITUD_DEFAULT];

		for (int i = 0; i < miArray.length; i++) {

			miArray[i] = -1;

		}

	}

	public int getNumElem() {
		return numElem;
	}

	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}

	public int[] getMiArray() {

		return miArray;
	}

	public int getIntMiArray(int posicion) {

		if ((posicion < miArray.length) && (posicion >= 0)) {

			return miArray[posicion];

		} else {
			return -1;
		}

	}

	public void resetear() {

		for (int i = 0; i < miArray.length; i++) {

			miArray[i] = 0;
		}

	}

	public void Insertar(int valor) {

		if (numElem == miArray.length) {

			System.out.println("Array lleno");

		} else {

			miArray[numElem] = valor;
			numElem++;
		}

	}

	public int sacarValorUltimo() {

		int temp;

		if (numElem != 0) {
			temp = miArray[numElem - 1];

			miArray[numElem] = -1;
			numElem--;

			return temp;

		} else {

			return -1;
		}

	}

	public int sacarValorPrimero() {

		int temp;

		if (numElem == 0) {

			return -1;

		} else {

			temp = miArray[0];
			
			for(int i = 0; i<numElem-1;i++) {
				
				miArray[i]=miArray[i+1];
				
			}
			miArray[numElem-1]=-1;
			numElem--;

			

			return temp;

		}

	}

}
