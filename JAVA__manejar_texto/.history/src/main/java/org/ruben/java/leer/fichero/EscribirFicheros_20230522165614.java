package org.ruben.java.leer.fichero;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;

public class EscribirFicheros {

	public static void main(String[] args) {
		// try-catch-resources nos ahorra poner el writer.close en el finally
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("texto.txt"))) {
			writer.write("Este es un texto de prueba");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}





}
