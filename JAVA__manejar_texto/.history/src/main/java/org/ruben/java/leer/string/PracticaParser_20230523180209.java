package org.ruben.java.leer.string;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticaParser {

    public static void main(String[] args) {

        String input = "raul,prac tica,separar,   texto,\"ignorando, las comas, del string,\",";



        //parsear(String separador, String ignorar)
        
        List<String> tokens = new ArrayList<String>();
        int startPosition = 0;
        boolean isInQuotes = false;
        for (int currentPosition = 0; currentPosition < input.length(); currentPosition++) {
            if (input.charAt(currentPosition) == '\"') {
                isInQuotes = !isInQuotes;
            }
            else if (input.charAt(currentPosition) == ',' && !isInQuotes) {
                tokens.add(input.substring(startPosition, currentPosition));
                startPosition = currentPosition + 1;
            }
        }
        
        String lastToken = input.substring(startPosition);
        if (lastToken.equals(",")) {
            tokens.add("");
        } else {
            tokens.add(lastToken);
        }
        System.out.println(tokens);
    }
}
    

