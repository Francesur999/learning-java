package practicas;

public class Fibonacci {
	
	public static void main(String[]args) {
		
		int maxNumFib = 100;
		int num = 1;
		int num2 = 1;
		int num3= 0;
		
		System.out.print(num+",");
		System.out.print(num2+",");
		
		while(num3 < maxNumFib ) {
			num3 = num + num2;
			System.out.print(num3+",");
			num= num2;
			num2 = num3;
		}
		
	}

}
