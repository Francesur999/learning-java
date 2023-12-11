package practicas;

public class Objeto {

	public static void main(String[] args) {
		String[]cadenaInicial=new String[10];
		for(int i=0; i<10; i++) {
			cadenaInicial[i]="hola";
		}
		
		listaFijaCadena cadena1;
		cadena1= new listaFijaCadena(3,cadenaInicial);
		System.out.println("num elementos: "+ cadena1.getnElementos());
		for (int i = 0; i<cadena1.getnElementos();i++) {
			System.out.println(cadena1.getArray()[i]);
		}
	}
}

class listaFijaCadena {

	private int nElementos;
	
	public int getnElementos() {
		return nElementos;
	}

	public void setnElementos(int nElementos) {
		this.nElementos = nElementos;
	}

	
	

	private String[]Array = new String[MAXNUM];
	
	
	public String[] getArray() {
		return Array;
	}

	public void setArray(String[] array) {
		Array = array;
	}

	
		
	final static int MAXNUM = 10;

	public listaFijaCadena(int nElementos, String[]arrays) {
		this.nElementos = nElementos;
		this.Array = arrays;
		
		
		
	}
	
}
