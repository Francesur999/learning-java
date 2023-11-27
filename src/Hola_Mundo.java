import java.util.Scanner;

public class Hola_Mundo {

	public static void main(String[] args) {

		String cadena = "Hola mundo";

		for (int i = 0; i < cadena.length(); i++) {
			if (i % 2 == 0) {
				System.out.println(cadena.toUpperCase().charAt(i));

			} else {
				System.out.println(cadena.toLowerCase().charAt(i));
			}
		}
		cadena = cadena .toUpperCase();
		System.out.println(cadena);
	}
}
