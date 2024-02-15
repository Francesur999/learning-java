package practicas;

import java.util.Scanner;
import java.util.Random;

public class arrayCaracter {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		char elección;
		int tamaño;

		System.out.println("Introduce el tamaño de la array");

		tamaño = teclado.nextInt();

		char[] array = new char[tamaño];

		for (int i = 0; i < array.length; i++) {

			array[i] = (char) aleatorio.nextInt(97, 122);

		}

		System.out.println("Pide un numero entre el 97 y 122 ( codigo asciss)");

		elección = (char) teclado.nextInt();

		int cont = 0;

		for (int i = 0; i < array.length; i++) {

			if (elección == array[i]) {

				cont++;

			} 

			}
		
		  System.out.println("El caracter "+elección+" se ha encontrado "+cont+" veces.");

		}
	}

