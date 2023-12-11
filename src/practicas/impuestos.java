package practicas;
import java.util.Scanner;
public class impuestos {

	public static void main(String[] args) {
	
	 int porcentaje;
	 String elección;
	 double salario;
     Scanner teclado = new Scanner ( System.in);
		
	do {
		do {
			
			System.out.print("Mete tu salario anual");
			salario = teclado.nextDouble();
			
		}while(salario<=0);
		
		if(salario < 30001) {
			
			porcentaje = 10;
			
		} else if ( (salario>30000) && (salario<50001)){
			
			porcentaje = 15;
			
		}else{
			
			porcentaje = 15;
		}
		
		System.out.println(salario * porcentaje / 100 + " "+ porcentaje + "%");
		
		
	System.out.println("Si quieres meter otro salario pulsa s , si quieres finalizar pulsa otra letra");
	
	elección = teclado.next();
	
	}while(elección.charAt(0) == 's');
	
	System.out.println("Has finalizado el programa");
	
	teclado.close();
	}

}
