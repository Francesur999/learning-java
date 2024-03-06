package practicas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EjemplosFicherosAleatorio {

	public static void main(String[] args) throws IOException {

		RandomAccessFile fichero = null;
		try {
			fichero = new RandomAccessFile("ficheroAleatorio.txt", "rw");

			for (int i = 0; i < 10; i++) {
				fichero.writeChar(97 + i);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {

			if (fichero != null)
				fichero.close();
		}

		try {
			fichero = new RandomAccessFile("ficheroAleatorio.txt", "r");

			for (int i = 0; i < 10; i++) {

				System.out.println(fichero.readChar()+" "+fichero.getFilePointer());

			}
			
			System.out.println("\n El puntero acaba en la posición: "+fichero.getFilePointer());
			
			fichero.seek(0);
			
			for (int i = 0; i < 20; i = i+2) {

				System.out.println((char)fichero.readByte()+" "+fichero.getFilePointer());

			}

		System.out.println("\n El puntero acaba en la posición: "+fichero.getFilePointer());

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e){
			System.out.println(e.getMessage());
		}
		finally {

			if (fichero != null)
				fichero.close();
		}

	}

}
