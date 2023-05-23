package org.ruben.java.leer.scanner;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Scanner;

import org.ruben.java.leer.lineaSplit.App;

public class LeerInputStream {

	public static void main(String[] args) throws IOException, URISyntaxException {
		InputStream is = App.class.getResourceAsStream("/prueba.txt");
		// try-resources nos ahorra poner el scan.close
		try (Scanner scan = new Scanner(is);) {
			while (scan.hasNext()) {
				System.out.println(scan.next());
			}
		}

	
	}

}
