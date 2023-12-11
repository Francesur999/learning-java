package alumnoCesur;

class Clase {

	public Clase(String nombre) {
		alumnos = new Alumno[TOTALALUMNOS];
		numAlumnos = 0;
		this.nombre = nombre;
	}

	private String nombre;
	private int numAlumnos;
	private Alumno[] alumnos;
	private static final int TOTALALUMNOS = 15;
	private Profesor profesor;

	public Profesor getprofesor() {
		return profesor;
	}

	public void setprofesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;

	}

	public String toString() {

		return "[Clase: " + nombre + ", Profesor: " + profesor + " , NumAlumnos: " + numAlumnos + " ]";
	}

	public void add(Alumno nuevoAlumno) {

		if (numAlumnos < TOTALALUMNOS) {
			alumnos[numAlumnos] = nuevoAlumno;
			numAlumnos++;
		}
	}
	
	public void delete(String nombreAlumno) {
		
		int indice = 0 ;
		
		while((alumnos[indice].getNombre() != nombreAlumno) && (indice< alumnos.length)){
			
			indice++;
		}
		
		if ( indice < alumnos.length) {
			
			numAlumnos--;
			for (int i = indice; i < numAlumnos; i++) {
				alumnos[i] = alumnos[i + 1];
			}
			alumnos[numAlumnos] = null;

		} else { 
			System.out.println("El alumno [" + alumnos + "] no se encuentra en la clase [" + nombre + "]");
		}
		
		
		
	}
}