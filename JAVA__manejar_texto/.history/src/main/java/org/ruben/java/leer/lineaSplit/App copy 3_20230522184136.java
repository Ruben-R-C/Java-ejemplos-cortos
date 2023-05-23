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
		String[] palabras = texto.split(" ",2);
		System.out.println(palabras[0]);
		System.out.println(palabras[1]);
		//Resultado
		//uno
		//dos tres cuatro
	}		


	private static void dividirStringEnPalabras() {
		//Usamos la funcion -> String[] split(String regex)
		String texto = "uno dos tres cuatro";
		String[] palabras = texto.split(" ");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
		//Resultado
		//uno
		//dos
		//tres
		//cuatro
	}


	




}
