package org.ruben.ficheros.escribir;

import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;


public class AnadirLineaAlFinal {
    

public static void main(String[] args) {
    
}



    static void anadirLineaAlFinal(String nombreFicheroConRuta, String linea) {
		try(Writer output = new BufferedWriter(new FileWriter(nombreFicheroConRuta, true))) {
			output.append(linea);
		} catch (IOException e) {
			throw new RuntimeException("Error al escribir una linea en el archivo: "+nombreFicheroConRuta);
		} 
	}
}
