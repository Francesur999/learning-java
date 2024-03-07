package retoUd5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);

		String nombre1;
		String nombre2;
		String ruta;

		do {
			System.out.println("Escribe el nombre del primer fichero ");
			nombre1 = teclado.nextLine();
		} while (nombre1.length() < 2);

		System.out.println("El nombre del fichero: " + nombre1 + " es válido");
		System.out.println(" ");

		do {
			System.out.println("Escribe el nombre del segundo fichero ");
			nombre2 = teclado.nextLine();
		} while (nombre2.length() < 2);

		System.out.println("El nombre del fichero: " + nombre2 + " es válido");
		System.out.println(" ");

		ruta = System.getProperty("user.dir");
		System.out.println("Ruta de mi directorio actual: " + ruta);

		String directorioActual = System.getProperty("user.dir");

		String rutaCompletaFich1 = directorioActual + File.separator + nombre1;
		String rutaCompletaFich2 = directorioActual + File.separator + nombre2;
		
		File fichero1 = new File(rutaCompletaFich1);
		File fichero2 = new File(rutaCompletaFich2);

		if (comprobarExiste(nombre1)) {

			System.out.println("El fichero: " + nombre1 + " ya existe");

		} else {
			fichero1.createNewFile();
		}
		
		if (comprobarExiste(nombre2)) {

			System.out.println("El fichero: " + nombre2 + " ya existe");

		} else {
			fichero2.createNewFile();
		}
		if (comprobarExiste(nombre1)) {
			escribirEnFichero(fichero1);
		}
		
		teclado.close();
	}

	static boolean leerDeFichero(File miFichero) throws IOException {

		FileReader entrada = null;

		try {
			entrada = new FileReader(miFichero);
			int caracter = entrada.read();

			while (caracter != -1) {

				System.out.println((char) caracter);
				caracter = entrada.read();
			}

			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

			return false;
		} finally {

			if (entrada != null) {

				entrada.close();
			}
		}
	}

	static boolean leerDeFichero(String miFichero) throws IOException {

		FileReader entrada = null;
		try {
			entrada = new FileReader(miFichero);

			int caracter = entrada.read();

			while (caracter != -1) {

				System.out.println((char) caracter);
				caracter = entrada.read();
			}

			return true;

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

			return false;

		} finally {

			if (entrada != null) {

				entrada.close();
			}
		}

	}

	static boolean escribirEnFichero(File miFichero) throws IOException {
		FileWriter salida = null;
		try {
			salida = new FileWriter(miFichero);
			for (int i = 0; i < 11; i++) {

				salida.write(" "+i);
				salida.write('\n');

			}
			return true;
		} catch (IOException e) {
			System.out.println(e.getMessage());

			return false;
		} finally {

			if (salida != null) {

				salida.close();
			}
		}

	}

	static boolean escribirEnFichero(String miFichero) throws IOException {

		FileWriter salida = null;
		try {
			salida = new FileWriter(miFichero);
			for (int i = 0; i < 11; i++) {

				salida.write((char) i);
				salida.write('\n');

			}
			return true;
		} catch (IOException e) {
			System.out.println(e.getMessage());

			return false;
		} finally {

			if (salida != null) {

				salida.close();
			}
		}

	}

	static boolean borrarFichero(File miFichero) {

		return miFichero.delete();

	}

	static boolean borrarFichero(String miFichero) {

		File fichero = new File(miFichero);
		return fichero.delete();

	}

	static boolean comprobarExiste(File miFichero) {

		return miFichero.exists();

	}

	static boolean comprobarExiste(String miFichero) {

		File fichero = new File(miFichero);

		return fichero.exists();

	}

	static boolean duplicarFicheros(File origen, File destino) throws IOException {

		FileReader entrada = null;
		FileWriter salida = null;

		try {
			entrada = new FileReader(origen);
			salida = new FileWriter(destino);

			int caracter = entrada.read();

			while (caracter != -1) {

				salida.write((char) caracter);
				caracter = entrada.read();
			}

			return true;

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {

			if (entrada != null) {

				entrada.close();
			}
			if (salida != null) {

				salida.close();
			}

		}
	}
}
