package practicas;

import java.io.FileInputStream;
import java.io.IOException;

public class EjemplosFicheros {

	public static void main(String[] args) throws IOException {

		FileInputStream entrada = null;

		try {

			entrada = new FileInputStream("Fichero.txt");

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {

		}
		if (entrada != null) {

			entrada.close();
		}
	}

}
