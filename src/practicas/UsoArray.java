package practicas;
import java.util.Scanner;
import java.util.Random;
import java.math.*;

public class UsoArray {
	
	public static void main(String[] args) {
	
	Scanner teclado=new Scanner(System.in);
	Random aleatorio= new Random ();
	int max;
	int min;
	int tamaño;
	int contP = 0;
	int contIm = 0;
	
	
	
	
  System.out.println("Introduce el tamaño de la array");
	
  tamaño = teclado.nextInt();
  
  do {
  
  System.out.println("Introduce el max positivo");
  
  max = teclado.nextInt();
  
  System.out.println("Introduce el min positivo");
  
  min = teclado.nextInt();
  
  }while(max < 0 || min < 0);
  
  
  int[] array = new int [tamaño];
  
  
  for ( int i = 0 ; i <array.length ; i++) {
	
	  
	  array[i] = (int) (Math.random() * (max - min)+ min) ; 
	 
	  System.out.print(array[i]+" ");
  }
  
  //Pares
  
 for ( int i = 0 ; i <array.length ; i++) {
	if(array[i]% 2 == 0) {
		
		contP ++;
	}else {
		
		contIm++;
	}
	
  }
 
       int[]pares = new int[contP];
       int[]Impares = new int[contIm];
       
       contP = 0;
       contIm = 0;
       
       
 for ( int i = 0 ; i <array.length ; i++) {
	 if(array[i]% 2 == 0) {
			
			pares[contP] = array[i];
			contP++;
		}else {
			
			Impares[contIm]=array[i];
			contIm++;
		}
  }


}
	
}

