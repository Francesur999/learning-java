import java.util.Scanner;

public class metodos {

	public static void main(String[] args) {

		int valor;
		int max;
		int min;
		Scanner teclado = new Scanner(System.in);
        do {
		System.out.println("Escribe el maximo");
		max = teclado.nextInt();
		System.out.println("Escribe el minimo");
		min = teclado.nextInt();
        } while(!comprobarMax (max, min));
		do {
			System.out.println("Escribe el valor");
			valor = teclado.nextInt();
		} while (!comprobarValor(max, min, valor));

		System.out.println("Es cierto que el valor " + valor + " esta entre " + max + " y " + min + "?");
		System.out.println(comprobarValor(max, min, valor));

		teclado.close();

	}

	static boolean comprobarValor(int max, int min, int valor) {

		if ((valor <= max) && (valor >= min)) {

			return true;
		} else {

			return false;
		}

	}

	static boolean comprobarMax (int max, int min) {
		if((min>max)) {
			
			return false;
		} return true;
		

	}
}
