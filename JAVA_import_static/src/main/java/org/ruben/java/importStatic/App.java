package org.ruben.java.importStatic;

import static org.ruben.java.importStatic.domain.SEMANA.JUEVES;
import static org.ruben.java.importStatic.domain.SEMANA.LUNES;
import static org.ruben.java.importStatic.domain.Saludar.isLaboral;

import org.ruben.java.importStatic.domain.Bloques;

import static org.ruben.java.importStatic.domain.CodigoCategoria.JAVA;
import static java.lang.Integer.*;
import static java.lang.Byte.*;
import static java.lang.System.out;

public class App {
	public static void main(String[] args) {

		//Enum estatico
		System.out.println(LUNES);
		
		//Funcion estatica
		isLaboral(JUEVES);

		//Variable estatica
		System.out.println(JAVA);

		//Variable estatica
 		out.println("Después de importar System.out, se puede utilizar directamente.");

		//Lanza un error porque MAX_VALUE es ambiguo esta tanto en Integer como es Byte
        //system.out.println(MAX_VALUE);
    

		//EL bloque estatico solo se ejecuta la primera vez que se instancia 
		//un bloque no-estatico se ejecuta todas las veces.
        Bloques t = new Bloques();
        Bloques t2 = new Bloques();
		//Static
		//Non-static block
		//Non-static block

	}
}
