package org.ruben.java.leer.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticaRegex {

    public static void main(String[] args) {
        
        //strfamilia.replaceFirst ("^0*", strfamilia); //quitar los ceros del inicio      
        
        // Queremos el String "Java is cool"
        final String TEXTO = "Some text. targetValue=Java is cool. some other text";

        // Usando Split
        String text = TEXTO.split("targetValue=")[1]; // [ "Some text. ", "Java is cool. some other text" ]
        text = text.split("[.]")[0];                  // [ "Java is cool", " some other text" ]
        System.out.println(text);

        // Usando ReplaceAll
        text = TEXTO.replaceAll(".*targetValue=", ""); //Java is cool. some other text
        text = text.replaceAll("[.].*", "");           //Java is cool
        System.out.println(text);

        // Usando Pattern
        Pattern pattern = Pattern.compile("targetValue=([^.]*)");
        Matcher matcher = pattern.matcher(TEXTO);
        System.out.println("Existe -> " + matcher.find()); // Existe -> true
        text = matcher.group(1);                           // Java is cool
        System.out.println(text);                         

        //Otras busquedas usando regex
        //"targetValue=([^.]*)"     -> todos los caracteres que comienza por "targetValue=" y no contiene puntos [^.]
        //"targetValue=(.*?)[.]"    -> texto que comienza por "targetValue=" acaba en punto y no tiene puntos
        //"?<=targetValue=).*(?=[.])"     -> lookbehind, lo que haya detras de "targetValue=" y lookhead lo que haya delante de un punto
        //"(?<=targetValue=)[^.]*"  -> lookbehind, lo que haya detras de "targetValue=" y no contenga un punto
    }
}
    

