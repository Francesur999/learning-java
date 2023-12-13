package alumnoCesur;

import practicas.Creator;

public class AlumnoCesur {
	public static void main(String[] args) {
		CentroEstudio cesurEste = new  CentroEstudio(5,4,"Cesur El Palo");
		CentroEstudio cesurPTA = new  CentroEstudio("Cesur El PTA");
		System.out.println(cesurEste);
		System.out.println(cesurPTA);
		
		
	}

}