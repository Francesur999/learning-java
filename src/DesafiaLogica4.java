import java.util.Scanner;

public class DesafiaLogica4 {

	public static void main(String[] args) {

		int n1;
		int n2;
		int n3;
		int elección;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Escribe el primer numero");
		n1 = teclado.nextInt();

		System.out.print("Escribe el segundo numero");
		n2 = teclado.nextInt();

		System.out.print("Escribe el tercer numero");
		n3 = teclado.nextInt();

		if (n1 >= n2 && n1 >= n3) {

			if (n2 > n3 || n2 == n3) {
				System.out.print(n1 + " " + n2 + " " + n3);

			} else if (n3 > n2) {
				System.out.print(n1 + " " + n3 + " " + n2);

			}

		} else if (n2 >= n1 && n2 >= n3) {

			if (n1 > n3 || n1 == n3) {
				System.out.print(n2 + " " + n1 + " " + n3);

			} else if (n3 > n1) {
				System.out.print(n2 + " " + n3 + " " + n1);

			}
			
		} else if (n3 >= n1 && n3 >= n2) {

			if (n2 > n1 || n2 == n1) {
				System.out.print(n3 + " " + n2 + " " + n1);

			} else if (n1 > n2) {
				System.out.print(n3 + " " + n1 + " " + n2);

			}
			
		} else if (n1==n2 && n2==n3) { 
			
			System.out.print(n1 + " " + n2 + " " + n3);
			
			
		}
	}
}
