package org.ruben.java.leer.lineaSplit;

import java.io.IOException;
import java.net.URISyntaxException;

public class DividirEnCaracteres {

	public static void main(String[] args) throws IOException, URISyntaxException {

		dividirEnCaracteres();

	}



	private static void dividirStringEnCaracteres() {
		String k = "abc";
		char[] caracteres = k.toCharArray();
		for (char c : caracteres) {
			System.out.println(c);
		}
	}




}
