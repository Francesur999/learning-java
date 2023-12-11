package practicas;
import java.util.Scanner;

public class arrays2 {

	static final int TOTALNUM = 10;
	static int[] arraysEnteros = new int[TOTALNUM];

	public static void main(String[] args) {

		pideNumeros();
		imprimeNumeros();
		cambiaPar();
		igualaCero();
		igualaX(20);
		hastaX(10);

	}

	static void pideNumeros() {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < arraysEnteros.length; i++) {
			System.out.println("Escribe un numero: ");
			arraysEnteros[i] = teclado.nextInt();
		}
		System.out.println(" ");
	}

	static void imprimeNumeros() {
		for (int i = 0; i < arraysEnteros.length; i++) {

			if (arraysEnteros[i] % 2 == 0) {
				System.out.print(arraysEnteros[i] + ", ");
			}

		}

		System.out.println(" ");

	}

	static void cambiaPar() {
		for (int i = 0; i < arraysEnteros.length; i++) {
			if (arraysEnteros[i] % 2 != 0) {
				System.out.print(arraysEnteros[i + 1]+ ",");
			} else {
				
				System.out.print(arraysEnteros[i]);

			}

			System.out.println(" ");
		}
	}

	static void igualaCero() {
		for (int i = 0; i < arraysEnteros.length; i++) {

			arraysEnteros[i] = 0;
			System.out.print(arraysEnteros[i] + ", ");
		}
		System.out.println(" ");
	}

	static void igualaX(int x) {
		for (int i = 0; i < arraysEnteros.length; i++) {

			arraysEnteros[i] = x;
			System.out.print(arraysEnteros[i] + ", ");
		}
		System.out.println(" ");
	}

	static void hastaX(int x) {

		if (x % 2 != 0) {
			x++;
		}

		for (int i = 0; i < arraysEnteros.length; i++) {

			arraysEnteros[i] = x;
			System.out.print(arraysEnteros[i] + ", ");
			x = x + 2;

		}
		System.out.println(" ");
	}
}
