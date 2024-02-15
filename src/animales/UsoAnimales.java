package animales;
import java.util.Random;

public class UsoAnimales {

	public static void main(String[] args) {
	
		
		Random aleatorio = new Random();
		int[]enteros = new int [10];
		
		for (int i = 0; i < enteros.length; i++) {
			enteros[i]= aleatorio.nextInt(10);
			System.out.print(enteros[i]+" ");
		}
		
		int numero = aleatorio.nextInt(10);
		int cont = 0;
		
		boolean encontrado = false;
		
		int i = 0  ;
			
		while ( i < enteros.length && ! encontrado) {
			
			if ( enteros[i]== numero) {
				
				encontrado = true;
				cont++;
			}
			
			i++;
			
			
		}

		if (encontrado == true) {
			
			System.out.println("Enocntrado;"+numero+":"+encontrado);
			System.out.println("Encontrado "+cont+" veces");
		}else {
			System.out.println("El numero "+numero+ " no se ha encontrado.");
		}
		
			
		}
		
		
	
		
		
	}


