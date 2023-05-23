package org.ruben.java.leer.patternRegex;

import java.util.regex.Pattern;

public class ContieneRegexIgnoreCase {
    

    public static void main(String[] args)
    {
        final String REGEX = ".*COM.*";
        String actualString = "blogruben.com";
 
        Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
 
        boolean cotieneREGEX = pattern
                              .matcher(actualString)
                              .matches();
 
        System.out.println( "contains REGEX = " + cotieneREGEX);
    }


}
