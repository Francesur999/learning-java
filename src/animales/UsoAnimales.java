package animales;

public class UsoAnimales {

	public static void main(String[] args) {
		
		Mamifero perro = new Mamifero("perro",15,true);
		Insecto hormiga = new Insecto("Hormiga",1,false,true,"oso hormiguero");
		
		System.out.println("El animal "+hormiga.getNombre()+" tiene alas?: "+hormiga.isAlas());
		System.out.println(hormiga.getEnemigo().getNombre()+" es el enemigo de la "+hormiga.getNombre());
	}

}
