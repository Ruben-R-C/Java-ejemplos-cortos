package org.ruben.ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class IOFichero {

    /**
	 * Leemos un fichero y devolvemos un String con el contenido.
	 * El encoding puede ser por ejemplo "ISO-8859-1" o "UTF-8"
     */
    public static String leerFichero( String rutaNombreFichero, String encoding ) {
		File file = new File(rutaNombreFichero);
		try(InputStream oIs = new FileInputStream(file))  {
			byte[] abBuffer = new byte[oIs.available()];
			oIs.read( abBuffer, 0, oIs.available() );
			return new String( abBuffer, encoding );
		} catch ( IOException exp ) {
			throw new RuntimeException("Error al leer los archivo: "+rutaNombreFichero, exp);
		}
	}

	public static void escribirFichero(String nombreFicheroConRuta, String contenido) {
		try(FileWriter file = new FileWriter(nombreFicheroConRuta);BufferedWriter output = new BufferedWriter(file);) {
		  	output.write(contenido);
		} catch (IOException e) {
			throw new RuntimeException("Error al escribir en el fichero "+nombreFicheroConRuta, e);
		}
	}

	public static List<String> leeFicheroPorLineas(String nombrearchivo) {
        List<String> result;
        try (Stream<String> lines = Files.lines(Paths.get(nombrearchivo))) {
            result = lines.collect(Collectors.toList());
        } catch ( IOException exp ) {
			throw new RuntimeException("Error al leer el archivo: "+nombrearchivo, exp);
		}
        return result;

    }


	public static List<Fichero> listarFicherosDeUnDirectorio(String directorio){
		File carpeta = new File(directorio);
		String[] listado = carpeta.list();
		List<Fichero> ficheros = new ArrayList<>();
		if (listado == null || listado.length == 0) {
			System.out.println("No hay elementos dentro de la carpeta actual");
		}
		else {
			for (int i=0; i< listado.length; i++) {
				ficheros.add(new IOFichero.Fichero(listado[i],directorio));
			}
		}
		return ficheros;
	}


	static void anadirLineaAlFinal(String nombreFicheroConRuta, String linea) {
		try(Writer output = new BufferedWriter(new FileWriter(nombreFicheroConRuta, true))) {
			output.append(linea);
		} catch (IOException e) {
			throw new RuntimeException("Error al escribir una linea en el archivo: "+nombreFicheroConRuta);
		} 
	}


	static class Fichero {
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
