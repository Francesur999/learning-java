package topGun;

public class Avion {

	// ATRIBUTOS

	private final int idAvion;
	private String modAvion;
	private int capAvion;
	private Piloto piloto;
	private static int contador = 0;
	private int combustible;

	
	// CONSTRUCTOR
	public Avion( String modAvion, int capAvion, Piloto piloto) {
		super();
		contador++;
		combustible = 0;
		this.idAvion = contador;
		this.modAvion = modAvion;
		this.capAvion = capAvion;
		this.piloto = piloto;
		
	
	}

	// GETTERS Y SETTERS

	public int getIdAvion() {
		return idAvion;
	}


	public String getModAvion() {
		return modAvion;
	}

	public void setModAvion(String modAvion) {
		this.modAvion = modAvion;
	}

	public int getCapAvion() {
		return capAvion;
	}

	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	public static int getContador() {
		return contador;
	}
	
	public int getCombustible() {
		return combustible;
	}

	public void setConsumir(int consumo) {
		this.combustible = combustible-consumo;
	}
	
	public void setRellenar(int relleno) {
		this.combustible = combustible+relleno;
	}


	// TO STRING
	public void mostrarAvion() {
		System.out.println("Avion [idAvion=" + idAvion + ", modAvion=" + modAvion + ", capAvion=" + capAvion+", " ); piloto.mostrarPiloto();
				
	}

}
