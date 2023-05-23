package org.ruben.java.leer.patternRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContieneRegex {
    

    public static void main(String[] args)
    {
        final String REGEX = ".*www.*";
        String texto = "www.blogruben.com";
 
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(texto);

        boolean cotieneREGEX = matcher.matches();
 
        System.out.println("Texto contiene el REGEX = " + cotieneREGEX);
    }


}
