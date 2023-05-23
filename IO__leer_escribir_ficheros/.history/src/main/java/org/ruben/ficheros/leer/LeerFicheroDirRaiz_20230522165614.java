package org.ruben.java.leer.fichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

public class LeerFicheroDirRaiz {

	public static void main(String[] args) throws IOException, URISyntaxException {
		// try-catch-resources nos ahorra poner el reader.close en el finally
		try (BufferedReader reader = new BufferedReader(new FileReader("texto.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



}
