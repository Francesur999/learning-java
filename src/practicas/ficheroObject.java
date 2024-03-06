package practicas;

import java.io.ObjectOutputStream;

import animales.Animal;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class ficheroObject {

	public static void main(String[] args) throws IOException , ClassNotFoundException{

		Animal perro = new Animal("Perro", 32);
		Animal gato = new Animal("Gato", 30);

		ObjectOutputStream salida = null;

		try {
			salida = new ObjectOutputStream((new BufferedOutputStream(new FileOutputStream("FicheroObjetos.txt"))));

			salida.writeObject(perro);
			salida.writeObject(gato);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (salida != null) {
				salida.close();
			}

		}
		Animal generico;

		ObjectInputStream entrada = null;
		try {
			entrada = new ObjectInputStream((new BufferedInputStream(new FileInputStream("FicheroObjetos.txt"))));
			
			 generico=(Animal) entrada.readObject();
			 System.out.println(generico.getNombre());
			 
			 generico=(Animal) entrada.readObject();
			 System.out.println(generico.getNombre());
			 
			 generico.setTpvida(16);
			 generico.setTpvida(120);
			 System.out.println(generico.getTpvida());
			 System.out.println(perro.getTpvida());
			 System.out.println(gato.getTpvida());
			 
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			
		} finally {
			if (entrada != null) {
				entrada.close();
			}

		}

	}
}
