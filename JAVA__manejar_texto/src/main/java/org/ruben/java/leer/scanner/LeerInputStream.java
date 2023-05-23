package org.ruben.java.leer.scanner;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Scanner;

public class LeerInputStream {

	public static void main(String[] args) throws IOException, URISyntaxException {
		InputStream is = LeerInputStream.class.getResourceAsStream("/prueba.txt");
		// try-resources nos ahorra poner el scan.close
		try (Scanner scan = new Scanner(is);) {
			while (scan.hasNext()) {
				System.out.println(scan.next());
			}
		}

	
	}

}
