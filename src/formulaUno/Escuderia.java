package formulaUno;

public class Escuderia {

	private static final int NUMING = 4;
	private static final int NUMMEC = 6;
	private static final int NUMPIL = 2;
	private static final int NUMCOC = 2;

	// atributos de instancia
	public final String nombre;
	public Jefe_de_Escuderia jefe;
	public MiArray ingenieros;
	public MiArray mecanicos;
	public MiArray pilotos;
	public MiArrayCoche coches;

	public Escuderia(String nombre) {

		this.nombre = nombre;
		this.jefe = null;
		this.coches = new MiArrayCoche(NUMCOC);
		this.ingenieros = new MiArray(NUMING);
		this.mecanicos = new MiArray(NUMMEC);
		this.pilotos = new MiArray(NUMPIL);

	}
}
