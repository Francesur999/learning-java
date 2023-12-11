package alumnoCesur;
import practicas.Creator;

public class AlumnoCesur {

	public static void main(String[] args) {
		
		Profesor teacher = new Profesor("Daniel", 47, "DAM");
		System.out.println(teacher.getNombre());

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
		
		for(int i= 0 ; i<15; i++) {
			
			premiumPlus.add(new Alumno(Creator.newName(),Creator.newAge(),"DAM"));
			
		}
		


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
