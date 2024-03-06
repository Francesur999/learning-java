package practicas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ListaYoutube {

	public static void main(String[] args) throws IOException {

		// 45 bloques
		// cada bloque tiene 9 lineas
		// 1 , 3 ,5 me interesan
		// 2, 4, 6, 7, 8, 9 no las quiero
		// Cada linea que quiero la meto en un String
		// Al final de cada bloque almaceno en otro fichero la union de las tres lineas
		// Orden: num - nombre - tiempo
		// creamos un directorio dentro del workspace y ahí almcenamos el youtubeEscrito.txt

		BufferedReader lector = null;
		BufferedWriter escritor = null;
		File directorio = null;
		String num = null;
		String tiempo = null;
		String nombre = null;
		String frase = null;
		try {
			directorio = new File ("dirFinal");
			directorio.mkdir();
			lector = new BufferedReader(new FileReader("youtube.txt"));
			escritor = new BufferedWriter(new FileWriter(directorio.getAbsolutePath()+"//youtubeEscrito.txt",true));
			for (int h = 0; h < 45; h++) {
				for (int i = 0; i < 9; i++) {
					if (i == 0) {
						num = lector.readLine();
					} else if (i == 2) {

						tiempo = lector.readLine();
					} else if (i == 4) {

						nombre = lector.readLine();
					} else {
						lector.readLine();
					}

				}
				frase = num + "-" + nombre + "-" + tiempo+"\n";
				escritor.write(frase);
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {

			if (lector != null) {

				lector.close();
			}

			if (escritor != null) {

				escritor.close();
			}
			
		}

	}

}
