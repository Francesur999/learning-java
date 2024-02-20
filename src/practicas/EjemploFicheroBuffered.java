package practicas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EjemploFicheroBuffered {
	public static void main (String[]args) throws IOException  {
		
		BufferedReader entrada = null;
		BufferedWriter salida2 = null;
		PrintWriter salida = null;
		
		try {
			entrada = new BufferedReader(new FileReader("PruebaFichero.txt"));
			salida2 = new BufferedWriter ( new FileWriter("ficheroCopia.txt"));
			salida = new PrintWriter ( new FileWriter("ficheroCopia.txt"));
			String linea;
			int numL = 4;
			int cont = 1;
			
			while (numL>0) {
				linea = entrada.readLine();
				
				if (cont % 2 == 0) {
			
				salida.println(linea);
				}
				numL--;
				cont++;
			}
		} catch (FileNotFoundException e) {
			
		System.out.println(e.getMessage());
		
		}finally {
			
			if(entrada!=null) {
				entrada.close();
			}
			if(salida2!=null) {
				salida.close();
			}
			if(salida!=null) {
				
				salida.close();
			}
		}
		
	}

}
