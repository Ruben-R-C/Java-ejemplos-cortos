package org.ruben.java.leer.scanner;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class LeerNumerosLinea {

	public static void main(String[] args) throws IOException, URISyntaxException {

		String textoNumeros = "12 34 56 78";
		try(Scanner scan = new Scanner(textoNumeros)){
			while (scan.hasNextInt()) {
				System.out.println(scan.nextInt());
			}
		}
	}



}
