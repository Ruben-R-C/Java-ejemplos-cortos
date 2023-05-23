package org.ruben.java.leer.patternRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContieneRegex {
    

    public static void main(String[] args)
    {
        final String REGEX = ".*Www.*";
        String texto = "www.blogruben.com";
 
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(texto);

        boolean matches = matcher.matches();
 
        System.out.println("Texto contiene el REGEX = " + matches);
    }


}
