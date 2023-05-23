package org.ruben.java.leer.scanner;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class LeerPalabrasLinea {

	public static void main(String[] args) throws IOException, URISyntaxException {

		String linea = "hola mundo como estamos";
		// try-resources nos ahorra poner el scan.close
		try(Scanner scan = new Scanner(linea)){
			while (scan.hasNext()) {
				System.out.println(scan.next());
			}
		}

	
	}



}
