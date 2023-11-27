import java.util.Scanner;

public class Hola_Mundo {

	public static void main(String[] args) {

		String cadena = "Hola mundo";
		int indice = 0;
		for (int i = 0; i < cadena.length(); i++) {
			
			indice = i;
			
			if (i % 2 == 0) {
				metodo(cadena.toUpperCase(), indice);

			} else {
				metodo(cadena.toLowerCase(), indice);
			}
			
		}

	}

	static void metodo(String cadena, int indice) {
		System.out.println(cadena.charAt(indice));
	}
}
