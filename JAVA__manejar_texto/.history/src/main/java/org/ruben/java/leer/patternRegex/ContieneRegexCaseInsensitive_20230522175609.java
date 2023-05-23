package org.ruben.java.leer.patternRegex;

import java.util.regex.Pattern;

public class ContieneRegexCaseInsensitive {
    

    public static void main(String[] args)
    {
        // create a REGEX String
        String REGEX = ".*org.*";
 
        // create the string
        // in which you want to search
        String actualString
            = "geeksforgeeks.org";
 
        // compile the regex to create pattern
        // using compile() method
        Pattern pattern = Pattern.compile(REGEX,
                             Pattern.CASE_INSENSITIVE);
 
        // check whether Regex string is
        // found in actualString or not
        boolean matches = pattern
                              .matcher(actualString)
                              .matches();
 
        System.out.println("actualString "
                           + "contains REGEX = "
                           + matches);
    }


}
