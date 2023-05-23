package org.ruben.java.leer.patternRegex;


    
// Java program to demonstrate
// Pattern.quote() method
 
import java.util.regex.*;
 
public class BuscarRegex {


    public static void main(String[] args)
    {
 
        final String REGEX = Pattern.quote("ul");
        String texto = "raul raul";
        Pattern pattern = Pattern.compile(REGEX);
 
        Matcher matcher = pattern.matcher(texto);

        boolean encontrado = false;
        while (matcher.find()) {
            System.out.println("Texto :"
                               + matcher.group()
                               + " index de inicio:"
                               + matcher.start()
                               + " final:"
                               + matcher.end());
 
            encontrado = true;
        }
        if (!encontrado) {
            System.out.println("No se encuentra.");
        }

        //Texto :ul index de inicio:2 final:4
        //Texto :ul index de inicio:7 final:9
    }
}
