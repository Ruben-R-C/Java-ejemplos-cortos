package org.ruben.java.leer.fichero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.ruben.java.leer.lineaSplit.App;

public class LeerFicheroDirResources {

	public static void main(String[] args)  {

		InputStream is = App.class.getClass().getResourceAsStream("/prueba.txt");
		try (InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
				BufferedReader reader = new BufferedReader(streamReader)) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



}
