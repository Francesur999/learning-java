package topGun;
import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
	
		int contador=4;
		Scanner teclado = new Scanner(System.in);
		
		Piloto primero = new Piloto(1,"Pete Maverick",10000,"capitan");
		Piloto segundo = new Piloto(2,"Natasha Phoenix",3000,"teniente");
		Piloto tercero = new Piloto(3,"Bradley Rooster",3500,"teniente");

	 System.out.println("Introduce  el nombre del piloto , las horas de vuelo  y su rango (EN ESTE ORDEN)");
	 
	 Piloto cuarto = new Piloto (contador, teclado.next(), teclado.nextInt(), teclado.next());
	 
	 contador++;
	 
     System.out.println("Introduce el nombre del piloto , las horas de vuelo  y su rango (EN ESTE ORDEN)");
	 
	 Piloto quinto = new Piloto (contador, teclado.next(), teclado.nextInt(), teclado.next());
	 
	 
	 primero.mostrarPiloto();
	 tercero.mostrarPiloto();
	 cuarto.mostrarPiloto();
	 quinto.mostrarPiloto();
	 
	 Avion uno = new Combate (1,"Caza",2,primero,true);
	 Avion dos = new Combate (2,"blackhawk",15,segundo,false);
	 Avion tres = new Entrenamiento (3,"Pilatus",2,tercero,true);
	 
	 contador = 4;
	 
 System.out.println("Introduce  el nombre del avion , el numero de asientos  y si es de doble mando o no (EN ESTE ORDEN)");
	 
	 Avion cuatro = new Entrenamiento (contador, teclado.next(), teclado.nextInt(),cuarto, teclado.nextBoolean());
	 
     System.out.println("Introduce  el nombre del avion , el numero de asientos  y si es de doble mando o no (EN ESTE ORDEN)");
     
     contador++;
	 
	 Avion cinco = new Entrenamiento (contador, teclado.next(), teclado.nextInt(),quinto, teclado.nextBoolean());
	 
	 
	 uno.mostrarAvion();
	 System.out.println(" ");
	 dos.mostrarAvion();
	 System.out.println(" ");
	 tres.mostrarAvion();
	 System.out.println(" ");
	 cuatro.mostrarAvion();
	 System.out.println(" ");
	 cinco.mostrarAvion();
	
	}

}
