package org.ruben.java.leer.lineaSplit;

import java.io.IOException;
import java.net.URISyntaxException;

public class App {

	public static void main(String[] args) throws IOException, URISyntaxException {

		//dividirEnCaracteres();
		//extraerChars();
		//dividirEnPalabras();
		//dividirEnDos();
		//dividirEnVariosDelimitadores();

		dividirDigitos();
	}


	private static void dividirLimiteTres() {
		//Usamos la funcion -> String[] split(String regex, int limit)
		String texto = "uno dos tres cuatro cinco";
		String[] palabras = texto.split(" ",3);
		System.out.println(palabras[0]);
		System.out.println(palabras[1]);
		System.out.println(palabras[2]);

		//Resultado
		//uno
		//dos tres cuatro
	}		





}
