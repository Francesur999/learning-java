package practicas;
import java.util.Scanner;

public class Frases {
	
	static final int CANTIDAD = 10;
	static String[] cadenas = new String[CANTIDAD];

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < CANTIDAD; i++) {

			System.out.println("Escribe una letra");
            
			setValue(cadenas,i,teclado.nextLine() );
			
		} for(int i = 0; i < CANTIDAD;i++) {
			
			System.out.println(getValue(cadenas, i));
		}
		
		
	}

	static String getValue(String[] cadenas, int posicion) {

		return (cadenas[posicion]);
		

	}

	String getValue(int posicion) {

		return cadenas[posicion];

	}

	static void setValue(String[] cadenas, int posicion, String Nuevacadena) {
		cadenas[posicion] = Nuevacadena;
	}
	
	static void escribirValor(String[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}


for ( int i = 0 ; i <array.length ; i++) {
	  int h;
	  
	do {
		  
	   h = aleatorio.nextInt(max); 
	  
	  }while(h > max || h < min);
	  
	  array[i] = h ; 
	 
	  System.out.print(array[i]+" ");
}
