package practicas;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		String palabra;
		char[] cadena;
		Scanner teclado = new Scanner(System.in);
		int x = 0;

		System.out.println("Escribe una palabra");
		palabra = teclado.nextLine();

		cadena = palabra.toCharArray();

		if (cadena.length % 2 == 0) {

			x = cadena.length;

			for (int i = 0; i < cadena.length; i++) {
				x--;

				if (cadena[i] == cadena[x]) {
					
					do {
						System.out.println("Es palindromo");
					}while(i==cadena.length);

				} else {
					
					i = 10;
					
					System.out.println("No es palindromo");

				}

			}
           
		
			

		} else {

			x = cadena.length;

			for (int i = 0; i < cadena.length; i++) {

				x--;

				if (cadena[i] == cadena[x]) {

				} else {
					
				}
			}
			System.out.println("Es palindromo");

		}

	}

}
