package org.ruben.java.leer.string;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticaParser {

    public static void main(String[] args) {

        String input = "raul,prac tica,,,separar,   texto,\"ignorando, las comas, del string,\",";
        System.out.println(parsear(',',  '\"',  input)); 

    }


    private static List<String> parsear(char separador, char ignorar, String texto){
        List<String> tokens = new ArrayList<String>();
        int startPosition = 0;
        boolean isInQuotes = false;
        for (int currentPosition = 0; currentPosition < texto.length(); currentPosition++) {
            if (texto.charAt(currentPosition) == ignorar) {
                isInQuotes = !isInQuotes;
            }
            else if (texto.charAt(currentPosition) == separador && !isInQuotes) {
                tokens.add(texto.substring(startPosition, currentPosition));
                startPosition = currentPosition + 1;
            }
        }
        
        String lastToken = texto.substring(startPosition);
        if (lastToken.equals(separador)) {
            tokens.add("");
        } else {
            tokens.add(lastToken);
        }
        return tokens;
    }
}
    

