package practicas;

import java.io.File;
import java.io.IOException;

public class EjemplosFicherosFiles {
	
	public static void main(String[]args)throws IOException {
		/*
		File fichero = null;
		fichero = new File ("pruebaFile");
		
		System.out.println(fichero.getAbsolutePath());
		System.out.println(fichero.getCanonicalPath());
		
		File miDirectorio = null;
		miDirectorio = new 	File ("C:\\Users\\FranciscoGonzálezGar\\eclipse-workspace\\Learning java") ;
		String[]miLista;
		miLista = miDirectorio.list();
		
		for(int i = 0 ; i < miLista.length ; i++) {
			System.out.println(miLista[i]);
			
		}
		*/
		
		File miDirectorio = null;
		miDirectorio = new File ("C:\\Users\\FranciscoGonzálezGar\\eclipse-workspace\\Learning java");
		File[]miLista;
		miLista = miDirectorio.listFiles();
		
		for(int i = 0 ; i < miLista.length ; i++) {
			if(miLista[i].isDirectory()) {
			System.out.println("Directorio:   " +miLista[i].getName());
			}else {
				
				System.out.println(miLista[i].getName());
			}
			
		}
	}

}
