package practicas;

import java.util.Random;

public class SimuladorLista {

	public static void main(String[] args) {

		MiArray antonio = new MiArray(100);
		int par = 0;
		int impar = 0;
		Random aleatorio = new Random();

		for (int i = 0; i < antonio.getMiArray().length; i++) {
			antonio.getMiArray()[i] = aleatorio.nextInt(100);
		}

		for (int i = 0; i < antonio.getMiArray().length; i++) {

			if (antonio.getIntMiArray(i) % 2 == 0) {

				par++;

			} else {

				impar++;

			}

		}
		System.out.println("El total entre pares e impares es de:  " + (par + impar));

		MiArray listaPares = new MiArray(par);
		MiArray listaImpares = new MiArray(impar);

		for (int i = 0; i < antonio.getMiArray().length; i++) {

			if (antonio.getMiArray()[i] % 2 == 0) {

				listaPares.insertar(antonio.getIntMiArray(i));

			} else {

				listaImpares.insertar(antonio.getIntMiArray(i));

			}

		}

		for (int i = 0; i < listaImpares.getMiArray().length; i++) {

		}

		for (int i = 0; i < listaPares.getMiArray().length; i++) {

		}

		antonio.resetear();

		for (int i = 0; i < antonio.getMiArray().length; i = i + 2) {

			for (int x = 0; x < listaPares.getMiArray().length; x++) {

				antonio.insertar(listaPares.getIntMiArray(x));

			}
		}

		for (int i = 1; i < antonio.getMiArray().length; i = i + 2) {

			for (int x = 0; x < listaImpares.getMiArray().length; x++) {

				antonio.insertar(listaImpares.getIntMiArray(x));
			}
		}
		System.out.print(antonio.getMiArray() + " ");
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

	public void insertar(int valor) {

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

			for (int i = 0; i < numElem - 1; i++) {

				miArray[i] = miArray[i + 1];

			}
			miArray[numElem - 1] = -1;
			numElem--;

			return temp;

		}

	}

}
