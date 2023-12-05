
public class AlumnoCesur {

	

	public static void main(String[] args) {
		
		Alumno Fran = new Alumno("Fran", 18, "DAM");
		System.out.println(Fran.toString());
		
		Alumno Andrés = new Alumno("Andrés", 20, "DAM");
		System.out.println(Andrés.toString());
		
		Alumno Santiago = new Alumno("Santiago", 22, "DAM");
		System.out.println(Santiago.toString());
		
		Alumno Ramon = new Alumno("Ramon", 24, "DAM");
		System.out.println(Ramon.toString());
		
		Alumno Janhin = new Alumno("Janhin", 27, "DAM");
		System.out.println(Janhin.toString());
		
		Alumno Alvaro = new Alumno("Alvaro", 18, "DAM");
		System.out.println(Alvaro.toString());
		
		Alumno Alejandro = new Alumno("Alejandro", 23, "DAM");
		System.out.println(Alejandro.toString());
		
		Alumno Adrian = new Alumno("Adrián", 25, "DAM");
		System.out.println(Adrian.toString());
		
		Alumno Sinram = new Alumno("Fran", 23, "DAM");
		System.out.println(Sinram.toString());
		
		Alumno JuanCarlos = new Alumno("Juan Carlos", 24, "DAM");
		System.out.println(JuanCarlos.toString());
		
		Alumno Dario = new Alumno("Dario", 17, "DAM");
		System.out.println(Dario.toString());
		
		Alumno JoseRamon = new Alumno("Jose Ramón", 39, "DAM");
		System.out.println(JoseRamon.toString());
		
		Clase PremiumPlus = new Clase("Premium plus");
		System.out.println(PremiumPlus.toString());
		
		PremiumPlus.add(JoseRamon);
		PremiumPlus.add(Andrés);
		PremiumPlus.add(Fran);
		PremiumPlus.add(Santiago);
		PremiumPlus.add(Ramon);
		PremiumPlus.add(Dario);
		PremiumPlus.add(JuanCarlos);
		PremiumPlus.add(Alvaro);
		PremiumPlus.add(Janhin);
		PremiumPlus.add(Adrian);
		PremiumPlus.add(Alejandro);
		PremiumPlus.add(Sinram);
		
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
		
		return "[Alumno: "+nombre+", Edad: "+edad+", Curso: "+curso+ "]";
	}

}

class Clase{
	
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
		
		return "[Clase: "+nombre+", Numero de alumnos: "+numAlumnos+" ]";
	}
	
	
	public void add (Alumno nuevoAlumno) {
		
		if(numAlumnos<TOTALALUMNOS) {
		alumnos[numAlumnos]=nuevoAlumno;
		numAlumnos++;
		}
	}
}
