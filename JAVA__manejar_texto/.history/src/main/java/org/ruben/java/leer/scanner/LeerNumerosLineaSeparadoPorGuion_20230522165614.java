package org.ruben.java.leer.lineaScanner;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class LeerNumerosLineaSeparadoPorGuion {

	public static void main(String[] args) throws IOException, URISyntaxException {
		 String texto = "12-34-56-78";
		 // try-resources nos ahorra poner el scan.close
		 try (Scanner scan = new Scanner(texto)){
			scan.useDelimiter("-");
			while (scan.hasNextInt()) {
				System.out.println(scan.nextInt());
			}
		 }
	}


}
