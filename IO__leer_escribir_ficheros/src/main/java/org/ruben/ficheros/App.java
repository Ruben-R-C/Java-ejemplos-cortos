package org.ruben.ficheros;

import org.ruben.ficheros.ficheros.IOFichero;

public class App {

    public static void main(String[] args)  {  
        String contenido = IOFichero.leerFichero("src/main/resources/Hola.txt","UTF-8");
        System.out.println(contenido);
    }










    
}
