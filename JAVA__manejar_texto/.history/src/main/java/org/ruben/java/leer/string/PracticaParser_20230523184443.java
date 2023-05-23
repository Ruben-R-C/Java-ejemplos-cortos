package org.ruben.java.leer.string;

import java.util.ArrayList;
import java.util.List;

public class PracticaParser {

    public static void main(String[] args) {

        String input = "raul,prac tica,,,separar,   texto,\"ignorando, las comas, del string,\",";
        List<String> listado = parsear(',',  '\"',  input); 
        System.out.println(listado);
    }

    //Implementar un parseo es mas eficiente que un expresion regular compleja 
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
    

