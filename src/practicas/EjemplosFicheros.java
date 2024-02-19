package practicas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjemplosFicheros {

	public static void main(String[] args) throws IOException {

		FileReader entrada = null;
		boolean nofin = true;
		char caracter;
		try {
			entrada = new FileReader("Fichero2.txt");

			do {

				caracter = (char) entrada.read();

				if (caracter == (char) -1) {

					nofin = false;
				} else {
					System.out.print(caracter);
				}
			} while (nofin);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (entrada != null) {

				entrada.close();
			}

		}

		String frase = "esto es una prueba de escritura en fichero";
		char[] fraseArray = new char[frase.length()];
		for (int i = 0; i < frase.length(); i++) {

			fraseArray[i] = frase.charAt(i);
		}

		FileOutputStream salida = null;

		try {
			salida = new FileOutputStream("Fichero2.txt");

			for (int i = 0; i < fraseArray.length; i++) {

				salida.write(fraseArray[i]);

			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {

			if (salida != null) {

				salida.close();
			}

		}

		System.out.println(" ");

		FileWriter fwriter = null;
		String fraseNueva;
		Scanner teclado = new Scanner(System.in);

		try {
			fwriter = new FileWriter("Fichero2.txt", true);
			
			fwriter.write((int) '\n');

			do {
				System.out.print("Escribe una frase");
				fraseNueva = teclado.nextLine();

				for (int i = 0; i < fraseNueva.length(); i++) {

					fwriter.write(fraseNueva.charAt(i));
				}
				
				fwriter.write((int) '\n');

			} while (fraseNueva.charAt(0) != 'Q' || (fraseNueva.length() != 1) && (fraseNueva.length()>0));

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {

			if (fwriter != null) {

				fwriter.close();
			}

		}

	}
}
