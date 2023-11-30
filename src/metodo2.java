
public class metodo2 {

	public static void main(String[] args) {

		System.out.print(uneCadenas("hola", "mundo"));
		System.out.print(uneCadenas("hey","chaval"));
	}

	static String uneCadenas(String cadena1, String cadena2) {

		String cadena = cadena1 + cadena2;
		return cadena;

	}

	static void pasoCadena(String cadena, boolean mayuscula) {

		if (mayuscula = true) {

			cadena = cadena.toUpperCase();
		} else {
			cadena = cadena.toLowerCase();
		}

	}

	static int numOcurrenciaschar(String cadena, char caracter) {
		int n = 0;
		for (int i = 0; i < cadena.length(); i++) {
			for (int cont = 0; cont < cadena.length(); cont++) {
				if (cadena.charAt(i) == caracter) {
					 n = n+1;
					
				}
			}

		}
		return n;
	}

}
