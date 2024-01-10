package animales;

public class Mamifero extends Animal{
	
	private boolean velloCorporal;
	
	
	public Mamifero(String nombre, int tpvida, boolean velloCorporal) {
		
		super(nombre, tpvida);
		
		this.velloCorporal = velloCorporal;
	}

	public boolean isVelloCorporal() {
		
		return velloCorporal;
	}

	public void setVelloCorporal(boolean velloCorporal) {
		
		this.velloCorporal = velloCorporal;
	}

	
	

}
