package practicas;
import java.util.Scanner;

public class DiasSemana {

	public static void main(String[] args) {

		int mes;
		int semana;
		int diaSemana;
		int numeroDia;
		int mesCompleto;
		int diaR;
		
		diaSemana = 0;

		semana = 0;

		mes = 0;
		
		mesCompleto = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
		   System.out.print("Escribe un  dias entre 1 y 336: ");
		   numeroDia = teclado.nextInt();
		}while(numeroDia<1 || numeroDia>336);
		
		 
		mesCompleto = numeroDia/28;
		
		while (mes < mesCompleto ) {

			if (mes == 0) {

				System.out.print("Enero");

			} else if (mes == 1) {

				System.out.print("Febrero");

			} else if (mes == 2) {

				System.out.print("Marzo");

			} else if (mes == 3) {

				System.out.print("Abril");

			} else if (mes == 4) {

				System.out.print("Mayo");

			} else if (mes == 5) {

				System.out.print("Junio");

			} else if (mes == 6) {

				System.out.print("Julio");

			} else if (mes == 7) {

				System.out.print("Agosto");

			} else if (mes == 8) {

				System.out.print("Septiembre");

			} else if (mes == 9) {

				System.out.print("Octubre");

			} else if (mes == 10) {

				System.out.print("Noviembre");

			} else if (mes == 11) {

				System.out.print("Diciembre");

			} 
			
			mes = mes +1;
			

			while (semana < 4) 	{

				while (diaSemana < 8) {
					if (diaSemana == 1) {

						System.out.print("[" + "L" + " ");

					} else if (diaSemana == 2) {

						System.out.print("M" + " ");

					} else if (diaSemana == 3) {

						System.out.print("X" + " ");

					} else if (diaSemana == 4) {

						System.out.print("J" + " ");

					} else if (diaSemana == 5) {

						System.out.print("V" + " ");

					} else if (diaSemana == 6) {

						System.out.print("S" + " ");

					} else if (diaSemana == 7) {

						System.out.print("D" + "]");

					}

					diaSemana = diaSemana + 1;

				}
				diaSemana = 0;
				semana = semana + 1;
				

			} 
			System.out.println("");
			semana = 0;
		} diaR = numeroDia - mesCompleto * 28;
		
	}
}


