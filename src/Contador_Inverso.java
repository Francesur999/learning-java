
import java.util.Scanner;

public class Contador_Inverso {

	public static void main(String[] args) {

		int n1;
		int n2;
		int salt;
		int cont2 = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Escribe el numero maximo");
		n1 = teclado.nextInt();

		do {

			System.out.print("Escribe el numero mínimo");
			n2 = teclado.nextInt();

		} while (n2 >= n1);

		System.out.print("Escribe en cuanto en cuanto quieres saltar ");
		salt = teclado.nextInt();
		System.out.println(" ");

		while (n1 >= n2) {
			System.out.print(n1 + " ");
			n1 = n1 - salt;

			for (int cont = 0; cont == 10000; cont++) {

				if (cont2 == 9) {
					System.out.println();
					cont2 = cont2 + 1;

				}
				cont2 = 0;

			}

		}
	}

}
