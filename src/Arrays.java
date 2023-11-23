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
			}else {
				
			listaImpares[contadorIm] = listaInteger[i];
			contadorIm++;
		}
	}
}}
