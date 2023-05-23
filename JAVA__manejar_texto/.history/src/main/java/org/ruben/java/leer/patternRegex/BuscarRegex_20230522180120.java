package org.ruben.java.leer.patternRegex;


    
// Java program to demonstrate
// Pattern.quote() method
 
import java.util.regex.*;
 
public class BuscarRegex {


    public static void main(String[] args)
    {
 
        final String REGEX = Pattern.quote("ru");
        String actualString = "raul raul";
        Pattern pattern = Pattern.compile(REGEX);
 
        // get a matcher object
        Matcher matcher = pattern.matcher(actualString);
 
        // print values if match found
        boolean matchfound = false;
        while (matcher.find()) {
            System.out.println("found the Regex in text:"
                               + matcher.group()
                               + " starting index:"
                               + matcher.start()
                               + " and ending index:"
                               + matcher.end());
 
            matchfound = true;
        }
        if (!matchfound) {
            System.out.println("No match found for Regex.");
        }

        //found the Regex in text:ee starting index:1 and ending index:3
        //found the Regex in text:ee starting index:9 and ending index:11
    }
}
