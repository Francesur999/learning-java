package practicas;
import java.util.Scanner;

public class numeroCifras {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Pon un numero positivo");
		
		num = teclado.nextInt();
		
		System.out.println("La primera cifra es: "+PrimeraCifra(num));
		System.out.println("La ultima cifra es: "+ultimaCifra(num));
		System.out.println("El total de cifras es: "+TotalCifra(num));
		
		
		teclado.close();
	
	} 
	
	public static int ultimaCifra(int num) {

		return num % 10;
	}
	
	public static int TotalCifra (int num) {
		
		int cifra = 0;
		
		do {
			cifra++;
			num = num/10;
		} while (num != 0);
		
		return cifra;
	}
		
	public static int PrimeraCifra ( int num) {
		int divisor = 1;
		
		do {

			num = num / 10;
			divisor = divisor * 10;

		} while (num / 10 != 0);
		
		
		return num;
		
	}

}
