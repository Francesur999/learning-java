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
		for (int i = 0; i < listaInteger.length; i++) {
			listaInteger[i] = aleatorio.nextInt();

		}

		for (int i = 0; i < listaInteger.length; i++) {
			if ((listaInteger[i] % 2) == 0) {

				numPares = numPares + 1;

			} else {
				numImpar = numImpar + 1;
			}
		}
		System.out.println(numPares);
		System.out.println(numImpar);
		listaPares = new int[numPares];
		contadorP = 0;
		listaImpares = new int[numImpar];
		contadorIm = 0;

		for (int i = 0; i < listaInteger.length; i++) {
			if ((listaInteger[i] % 2) == 0) {
				listaPares[contadorP] = listaInteger[i];
				contadorP++;
			} else {

				listaImpares[contadorIm] = listaInteger[i];
				contadorIm++;
			}

		}

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
		
		for ( int i = 0; i < listaPares.length; i++) {
			
			listaInteger[i] = listaPares[i];
		}
		
		for ( int i = numPares; i < listaInteger.length; i++ ) {
			
			listaInteger[i] = listaImpares[m];
			m++;
		}
			
		
	}
}