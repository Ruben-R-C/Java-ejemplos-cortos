package org.ruben.java.leer.lineaScanner;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class LeerImputStreamDelTeclado {

	public static void main(String[] args) throws IOException, URISyntaxException {
		// System.in es un ImputStream
		// try-resources nos ahorra poner el scan.close
		try (Scanner scan = new Scanner(System.in);) {
			while (scan.hasNext()) {
				System.out.println(scan.next());
			}
		}
	}



}
