package formulaUno;

public class Escuderia {

	private static final int NUMING = 4;
	private static final int NUMMEC = 6;
	private static final int NUMPIL = 2;
	private static final int NUMCOC = 2;

	// atributos de instancia
	public final String nombre;
	public Jefe_de_Escuderia jefe;
	public MiArrayIngeniero ingenieros;
	public MiArrayMecanico mecanicos;
	public MiArrayPiloto pilotos;
	public MiArrayCoche coches;

	public Escuderia(String nombre) {

		this.nombre = nombre;
		this.jefe = null;
		this.coches = new MiArrayCoche(NUMCOC);
		this.ingenieros = new MiArrayIngeniero(NUMING);
		this.mecanicos = new MiArrayMecanico(NUMMEC);
		this.pilotos = new MiArrayPiloto(NUMPIL);

	}


	public void construirCoche(Coche coche) {

		coches.insertarValor(coche);
	}

	public void contratarPiloto(Piloto piloto) {

		pilotos.insertarValor(piloto);
	}

	public void construirIngeniero(Ingeniero ingeniero) {

		ingenieros.insertarValor(ingeniero);
	}

	public void construirMecanico(Mecanico mecanico) {

		mecanicos.insertarValor(mecanico);
	}
	
	public void destruirCoche(Coche coche) {
	}
	
	public void destruirPiloto(Coche coche) {
	}
	
	public void destruirIngeniero(Coche coche) {
	}
	
	public void destruirMecanico(Coche coche) {
	}

}