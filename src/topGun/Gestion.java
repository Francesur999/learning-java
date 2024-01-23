package topGun;
import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
	
		
		Scanner teclado = new Scanner(System.in);
		
		Piloto primero = new Piloto("Pete Maverick",10000,"capitan");
		Piloto segundo = new Piloto("Natasha Phoenix",3000,"teniente");
		Piloto tercero = new Piloto("Bradley Rooster",3500,"teniente");

	 System.out.println("Introduce el id,  el nombre del piloto , las horas de vuelo  y su rango (EN ESTE ORDEN)");
	 
	 Piloto cuarto = new Piloto ( teclado.next(), teclado.nextInt(), teclado.next());
	 
	
	 
     System.out.println("Introduce el Id ,nombre del piloto , las horas de vuelo  y su rango (EN ESTE ORDEN)");
	 
	 Piloto quinto = new Piloto ( teclado.next(), teclado.nextInt(), teclado.next());
	 
	 
	 primero.mostrarPiloto();
	 tercero.mostrarPiloto();
	 cuarto.mostrarPiloto();
	 quinto.mostrarPiloto();
	 
	 Avion uno = new Combate ("Caza",2,primero,true);
	 Avion dos = new Combate ("blackhawk",15,segundo,false);
	 Avion tres = new Entrenamiento ("Pilatus",2,tercero,true);
	 
	
	 
 System.out.println("Introduce  el nombre del avion , el numero de asientos  y si es de doble mando o no (EN ESTE ORDEN)");
	 
	 Avion cuatro = new Entrenamiento ( teclado.next(), teclado.nextInt(),cuarto, teclado.nextBoolean());
	 
     System.out.println("Introduce  el nombre del avion , el numero de asientos  y si es de doble mando o no (EN ESTE ORDEN)");
     
    
	 
	 Avion cinco = new Entrenamiento ( teclado.next(), teclado.nextInt(),quinto, teclado.nextBoolean());
	 
	 
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
