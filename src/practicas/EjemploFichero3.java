package practicas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjemploFichero3 {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner (System.in);
		FileReader entrada = null;
		

		try {

			entrada = new FileReader("PruebaFichero.txt");
			char caracter = (char) entrada.read();
			;

			while (caracter != (char) -1) {
				System.out.print(caracter);
				caracter = (char) entrada.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}
		System.out.println(" ");
		
	     entrada = null;
	     int linea;
	     int cont = 0;
	     
	     try {
			entrada = new FileReader("PruebaFichero.txt");
			char caracter2 = (char) entrada.read();
			
			do {
			System.out.println("Cuantas lineas quieres escribir entre 1 y 4");
			linea = teclado.nextInt();
			}while(linea<=0 || linea >4);

			while (caracter2 != (char) -1 && linea > 0) {
				
				System.out.print(caracter2);
				caracter2 = (char) entrada.read();
				
				if(caracter2 == '\n') {
					
					linea = linea - 1;
				}
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			
			if ( entrada!= null) {
				
				entrada.close();
			}
		}

	}

}
