package org.ruben.java.leer.patternRegex;


    
// Java program to demonstrate
// Pattern.quote() method
 
import java.util.regex.*;
 
public class BuscarRegex {


    public static void main(String[] args)
    {
 
        final String REGEX = Pattern.quote("ul");
        String actualString = "raul raul";
        Pattern pattern = Pattern.compile(REGEX);
 
        Matcher matcher = pattern.matcher(actualString);

        boolean matchfound = false;
        while (matcher.find()) {
            System.out.println("Texto :"
                               + matcher.group()
                               + " index de inicio:"
                               + matcher.start()
                               + " index final:"
                               + matcher.end());
 
            matchfound = true;
        }
        if (!matchfound) {
            System.out.println("No match found for Regex.");
        }

        //Texto :ul index de inicio:2 index final:4
        //Texto :ul index de inicio:7 index final:9
    }
}
