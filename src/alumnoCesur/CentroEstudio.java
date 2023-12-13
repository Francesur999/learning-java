package alumnoCesur;

public class CentroEstudio {

	
	
	// ATRIBUTOS
	private final int MAXCLASES;
	private final int MAXADMIN;
	private String nombre;
	private Administrativo[] administrativos;
	private Clase[] clases;

	// CONSTRUCTOR

	public CentroEstudio(int mAXCLASES, int mAXADMIN, String nombre) {
		super();
		MAXCLASES = mAXCLASES;
		MAXADMIN = mAXADMIN;
		this.nombre = nombre;
		this.administrativos = new Administrativo[MAXADMIN];
		this.clases= new Clase[MAXCLASES];
	}

	public CentroEstudio(String nombre) {
		
		this.nombre = nombre;
		MAXADMIN = 10;
		MAXCLASES = 10;
		this.administrativos = new Administrativo[MAXADMIN];
		this.clases= new Clase[MAXCLASES];
	}
	
	public int getMAXCLASES() {
		return MAXCLASES;
	}

	public int getMAXADMIN() {
		return MAXADMIN;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Administrativo[] getAdministrativos() {
		return administrativos;
	}

	public void setAdministrativos(Administrativo[] administrativos) {
		this.administrativos = administrativos;
	}

	public Clase[] getClases() {
		return clases;
	}

	public void setClases(Clase[] clases) {
		this.clases = clases;
	}
	
	public String toString() {
		
		return("["+"Centro: "+nombre+", CAPACIDAD { Clases: " +MAXCLASES+ ", Num de admins: " + MAXADMIN+"}]");
		
		
	}

}
