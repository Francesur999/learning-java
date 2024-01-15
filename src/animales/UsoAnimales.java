package animales;

public class UsoAnimales {

	public static void main(String[] args) {
		
		Mamifero perro = new Mamifero("perro",15,true);
		
		Insecto hormiga = new Insecto("Hormiga",1,false,true,"oso hormiguero");
		
		System.out.println("El animal "+hormiga.getNombre()+" tiene alas?: "+hormiga.isAlas());
		System.out.println(hormiga.getEnemigo().getNombre()+" es el enemigo de la "+hormiga.getNombre());
		
		Insecto volantona;
		volantona = hormiga;
		volantona.setNombre("volantona");
		
		Insecto atomica = new Insecto(
				
				hormiga.getNombre()+"atomica",
				hormiga.getTpvida(),
				hormiga.isAlas(),
				hormiga.isAntenas(),
				hormiga.getEnemigo().getNombre()
				);
		hormiga.setAlas(true);
		System.out.println("El animal "+hormiga.getNombre()+" tiene alas?: "+hormiga.isAlas());		
		System.out.println("El animal "+atomica.getNombre()+" tiene alas?: "+atomica.isAlas());		
		System.out.println("El animal "+volantona.getNombre()+" tiene alas?: "+volantona.isAlas());		
		volantona.setNombre(atomica.getNombre());
		
		System.out.println("Volantona dice: "+volantona.atributo);
	}

}
