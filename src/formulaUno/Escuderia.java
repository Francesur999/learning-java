package formulaUno;

    public class Escuderia {
	
    private String nombre;
	private Jefe_de_Escuderia jefe;
	private Coche coche ;
	
	public Escuderia(String nombre) {
		super();
		this.nombre = nombre;
	}


	public Jefe_de_Escuderia getJefe() {
		return jefe;
	}

	public void setJefe(Jefe_de_Escuderia jefe) {
		this.jefe = jefe;
	}

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	
	

}

