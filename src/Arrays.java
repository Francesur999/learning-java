import java.util.Random;

public class Arrays {

	public static void main(String[] args) {

		Random aleatorio;
		aleatorio = new Random();
		int[] listaPares;
		int[] listaInteger = new int[10];
		int[] listaImpares;
		int numPares = 0;
		int numImpar = 0;
		int contadorP;
		int contadorIm;
		int ord = 0;
		int m = 0;

		System.out.print("Esta es la array principal:[ ");

		for (int i = 0; i < listaInteger.length; i++) {
			listaInteger[i] = aleatorio.nextInt(1000);
			System.out.print(listaInteger[i] + " ");
		}
		System.out.println(" ]");

		for (int i = 0; i < listaInteger.length; i++) {
			if ((listaInteger[i] % 2) == 0) {

				numPares = numPares + 1;

			} else {
				numImpar = numImpar + 1;
			}
		}
		System.out.println(" ");
		System.out.println("Estos son los numeros de pares: " + numPares);
		System.out.println("Estos son los numeros de impares: " + numImpar);
		System.out.println(" ");

		listaPares = new int[numPares];
		contadorP = 0;
		listaImpares = new int[numImpar];
		contadorIm = 0;

		System.out.print("Esta es la array de pares:[ ");

		for (int i = 0; i < listaInteger.length; i++) {
			if ((listaInteger[i] % 2) == 0) {
				listaPares[contadorP] = listaInteger[i];
				contadorP++;
				System.out.print(listaInteger[i] + " ");
			}

		}
		System.out.println(" ]");
		System.out.println("");

		System.out.print("Esta es la array de impares:[ ");

		for (int i = 0; i < listaInteger.length; i++) {
			if ((listaInteger[i] % 2) != 0) {
				listaImpares[contadorIm] = listaInteger[i];
				contadorIm++;
				System.out.print(listaInteger[i] + " ");
			}

		}
		System.out.println(" ]");
		System.out.println("");

		for (int i = 0; i < listaPares.length; i++) {
			for (int x = 0; x < listaPares.length - 1 - i; x++) {

				if (listaPares[x] > listaPares[x + 1]) {
					ord = listaPares[x];
					listaPares[x] = listaPares[x + 1];
					listaPares[x + 1] = ord;

				}
			}
		}

		for (int i = 0; i < listaImpares.length; i++) {
			for (int x = 0; x < listaImpares.length - 1 - i; x++) {

				if (listaImpares[x] > listaImpares[x + 1]) {
					ord = listaImpares[x];
					listaImpares[x] = listaImpares[x + 1];
					listaImpares[x + 1] = ord;

				}
			}
		}

		System.out.print("Esta es la array ordenada: [ ");
		for (int i = 0; i < listaPares.length; i++) {

			listaInteger[i] = listaPares[i];
			System.out.print(listaInteger[i] + " ");
		}
		System.out.print("|");

		for (int i = numPares; i < listaInteger.length; i++) {

			listaInteger[i] = listaImpares[m];
			m++;
			System.out.print(listaInteger[i] + " ");
		}

		System.out.print(" ] ");
		
		

	}
	
}