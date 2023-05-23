package org.ruben.java.leer.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class contieneRegex {
    

    public static void main(String[] args)
    {
        // create a REGEX String
        String REGEX = ".*www.*";
 
        // create the string
        // in which you want to search
        String actualString
            = "www.geeksforgeeks.org";
 
        // compile the regex to create pattern
        // using compile() method
        Pattern pattern = Pattern.compile(REGEX);
 
        // get a matcher object from pattern
        Matcher matcher = pattern.matcher(actualString);
 
        // check whether Regex string is
        // found in actualString or not
        boolean matches = matcher.matches();
 
        System.out.println("actualString "
                           + "contains REGEX = "
                           + matches);
    }


}
