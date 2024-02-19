package practicas;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFicheros2 {

	public static void main(String[] args) throws IOException {
		

	Scanner teclado = new Scanner(System.in);
	FileInputStream entrada = null;
	FileOutputStream salida = null;
	String cosa;
	int[]array;
	
	try {

		salida= new FileOutputStream("Fichero.txt");
		
		System.out.println("Escribe frase");
		cosa = teclado.nextLine();
		array= new int [cosa.length()];
		
		for(int i = 0; i<cosa.length();i++) {
			
			array[i]=(int)cosa.charAt(i);
			salida.write(array[i]);
		}
		
	} catch (IOException e) {

		System.out.println(e.getMessage());

	} finally {
		
		if (salida != null) {

			salida.close();
		}

	}
	
	try {

		entrada = new FileInputStream("Fichero.txt");
		int asci = entrada.read();
		while (asci != -1) {
			System.out.print((char) asci + " ");
			asci = entrada.read();
		}

	} catch (Exception e) {

		System.out.println(e.getMessage());

	} finally {

	}
	if (entrada != null) {

		entrada.close();
	}
	}

}
