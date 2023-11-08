
public class Abecedario {

	public static void main(String[] args) {
		
		int i = 97; 
		int z = 97;
		
		do {
			
			System.out.print((char) i +(" ")) ;i++;
			
			
		} while( i < 123 && i >= 97);
		
		System.out.println();
		
		while( z < 97+26){
			
			System.out.print((char) z +(" ")) ;
			z = z + 1;
			
		}
		
		System.out.println();
		
		for(int p = 97; p < 123; p++) {
			System.out.print((char) p +(" ")) ;
		}
	}

}
