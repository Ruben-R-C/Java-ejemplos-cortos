package org.ruben.ficheros.leer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListarFicherosDeUnDirectorio {






	public static List<Fichero> listarFicherosDeUnDirectorio(String directorio){
		File carpeta = new File(directorio);
		String[] listado = carpeta.list();
		List<Fichero> ficheros = new ArrayList<>();
		if (listado == null || listado.length == 0) {
			System.out.println("No hay elementos dentro de la carpeta actual");
		}
		else {
			for (int i=0; i< listado.length; i++) {
				ficheros.add(new ListarFicherosDeUnDirectorio.Fichero(listado[i],directorio));
			}
		}
		return ficheros;
	}





	public static class Fichero {
		private String nombre;
		private String ruta;
	
	
		Fichero(String nombreFichero, String ruta){
			this.nombre = nombreFichero;
			this.ruta = ruta;
			
		}
	
		public String getNombreConRuta(){
			return this.ruta+"/"+this.nombre;
		}

	}
	




}
