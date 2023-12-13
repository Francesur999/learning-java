package alumnoCesur;
import java.util.Random;
import practicas.Creator;

public class AlumnoCesur {
	public static void main(String[] args) {
		
		int n1;
		Random aleatorio = new Random();
		
		CentroEstudio cesurEste = new  CentroEstudio(5,4,"Cesur El Palo");
		CentroEstudio cesurPTA = new  CentroEstudio("Cesur El PTA");
		System.out.println(cesurEste);
		System.out.println(" ");
		
		
		Clase claseTemp ;
		String nombreClaseTemp;
			
		for( int i = 0 ; i < 5; i++) {
			nombreClaseTemp=Creator.newClase();
			 claseTemp = new Clase(nombreClaseTemp);
			 claseTemp.setprofesor(new Profesor(
			Creator.newName(),
			Creator.newAge(),
			nombreClaseTemp)
		    );
			 n1 = aleatorio.nextInt(15);
			 
			 
			 for(int x=0 ; x< n1 ; x++){
				 claseTemp.add(new Alumno(
						 Creator.newName(),
						 Creator.newAge(),
						 Creator.newClase()
						 ));
				 
				 System.out.println(claseTemp.getAlumnos()[x]);
				
			 }
			 	cesurEste.getClases()[i]=claseTemp;
			 	 System.out.println(cesurEste.getClases()[i]);
			 	 System.out.println(" ");
			 	 
		}
		
			for(int j = 0 ; j < 4 ; j++) {
				
				cesurEste.getAdministrativos()[j]=(new Administrativo(
						Creator.newName(),
						Creator.newAge(),
						aleatorio.nextBoolean()
						));
				
			System.out.println(cesurEste.getAdministrativos()[j]);
			}
			
		
	}

}