package practicas;

import java.util.Scanner;

public class NumeroCifra {

	public static void main(String[] args) {

		int num;
		int numFinal;
		Scanner teclado = new Scanner(System.in);
		int divisor = 1;
		int cifra = 0;

		do {
			System.out.println("Escribe un numero");
			num = teclado.nextInt();

		} while (num <= 0);

		numFinal = num % 10;

		do {

			num = num / 10;
			divisor = divisor * 10;
			cifra++;

		} while (num / 10 != 0);

		System.out.println("El numero de cifra es: " + (cifra + 1));

		System.out.println("La ultima cifra es: " + numFinal);

		System.out.println("La primera cifra es: " + num);

		teclado.close();

	}

}
