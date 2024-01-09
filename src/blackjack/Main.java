package blackjack;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	}

	static int numJugadores() {

		int num;
		String jug1;
		String jug2;
		String jug3;
		String jug4;

		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("¿Cuantos jugadores sois ( max 4 y min 2)");

			num = teclado.nextInt();

			for ( int i = 0; i < num; i++) {
				
				
			}

		} while (num > 1 && num < 5);

		return num;

	}

}
