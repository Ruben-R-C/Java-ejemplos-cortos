package org.ruben.java.leer.lineaSplit;

import java.io.IOException;
import java.net.URISyntaxException;

public class DividirRegex {

	public static void main(String[] args) throws IOException, URISyntaxException {
		dividirRegexAlmuadillas();
		dividirRegexEnVariosDelimitadores();
	}


	private static void dividirRegexAlmuadillas() {
		//Usamos la funcion -> String[] split(String regex)
		String texto = "uno##dos#tres###cuatro";
		String[] palabras = texto.split("#+");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
		//Resultado
		//uno
		//dos
		//tres
		//cuatro
	}

	private static void dividirRegexEnVariosDelimitadores() {
		String example = "Raul;Maria:Jose-Pablo";
		String[] names = example.split("[;:-]");
		for (String name : names) {
			System.out.println(name);
		}
	}



}
