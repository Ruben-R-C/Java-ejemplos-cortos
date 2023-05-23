package org.ruben.java.leer.lineaSplit;

import java.io.IOException;
import java.net.URISyntaxException;

public class DividirStringEnPalabras {

	public static void main(String[] args) throws IOException, URISyntaxException {

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
