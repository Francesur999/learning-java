
public class AlumnoCesur {

	public static void main(String[] args) {

		Alumno Fran = new Alumno("Fran", 18, "DAM");

		Alumno Andrés = new Alumno("Andrés", 20, "DAM");

		Alumno Santiago = new Alumno("Santiago", 22, "DAM");

		Alumno Ramon = new Alumno("Ramon", 24, "DAM");

		Alumno Janhin = new Alumno("Janhin", 27, "DAM");

		Alumno Alvaro = new Alumno("Alvaro", 18, "DAM");

		Alumno Alejandro = new Alumno("Alejandro", 23, "DAM");

		Alumno Adrian = new Alumno("Adrián", 25, "DAM");

		Alumno Sinram = new Alumno("Fran", 23, "DAM");

		Alumno JuanCarlos = new Alumno("Juan Carlos", 24, "DAM");

		Alumno Dario = new Alumno("Dario", 17, "DAM");

		Alumno JoseRamon = new Alumno("Jose Ramón", 39, "DAM");

		Alumno Juanan = new Alumno("Juanan", 26, "DAW");

		Clase premiumPlus = new Clase("Premium plus");

		premiumPlus.add(JoseRamon);
		premiumPlus.add(Andrés);
		premiumPlus.add(Fran);
		premiumPlus.add(Santiago);
		premiumPlus.add(Ramon);
		premiumPlus.add(Dario);
		premiumPlus.add(JuanCarlos);
		premiumPlus.add(Alvaro);
		premiumPlus.add(Janhin);
		premiumPlus.add(Adrian);
		premiumPlus.add(Alejandro);
		premiumPlus.add(Sinram);
		premiumPlus.add(Juanan);

		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			System.out.println(premiumPlus.getAlumnos()[i]);

			if (premiumPlus.getAlumnos()[i].getNombre() == "Dario") {
				premiumPlus.getAlumnos()[i].setEdad(18);
				System.out.println(premiumPlus.getAlumnos()[i]);
			}

			System.out.println(" ");

		}
		

		for (int x = 0; x < premiumPlus.getNumAlumnos(); x++) {

			if (premiumPlus.getAlumnos()[x].getCurso() == "DAW") {
				System.out.print ("Este es alumno de DAW" );
				System.out.println(premiumPlus.getAlumnos()[x]);

			} else {
				
				System.out.print("Estos son alumnos de DAM");
				System.out.println(premiumPlus.getAlumnos()[x]);
			}
		}

	}

}

class Alumno {

	private String nombre;
	private int edad;
	private String curso;

	public Alumno(String nombre, int edad, String curso) {
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String toString() {

		return "[Alumno: " + nombre + ", Edad: " + edad + ", Curso: " + curso + "]";
	}

}

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

		return "[Clase: " + nombre + ", Numero de alumnos: " + numAlumnos + " ]";
	}

	public void add(Alumno nuevoAlumno) {

		if (numAlumnos < TOTALALUMNOS) {
			alumnos[numAlumnos] = nuevoAlumno;
			numAlumnos++;
		}
	}
	
	public void delete(String nombreAlumno) {
		
		
		
	}
}
