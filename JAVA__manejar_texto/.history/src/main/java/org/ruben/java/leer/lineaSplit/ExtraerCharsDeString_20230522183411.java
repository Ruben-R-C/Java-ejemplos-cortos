package org.ruben.java.leer.lineaSplit;

import java.io.IOException;
import java.net.URISyntaxException;

public class ExtraerCharsDeString {

	public static void main(String[] args) throws IOException, URISyntaxException {
		String[] letras = "abc".split("");
		for (String letra : letras) {
			System.out.println(letra);
		}
	}


}
