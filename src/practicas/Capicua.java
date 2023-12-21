package practicas;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {

		int num;
		int numF = 0;
		int numP = 0;
		int digito = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Pon un numero");
		num = teclado.nextInt();

		numP = num;

		do {

			digito = numP % 10;
			numP = numP / 10;
			numF = numF + digito;
			numF = numF * 10;

		} while (numP / 10 != 0);
		
		numF = numF + numP;

		if (num == numF || num<10) {

			System.out.println("Es capicua ");
		} else {

			System.out.println("No es capicua");
		}

		teclado.close();

	}

}
