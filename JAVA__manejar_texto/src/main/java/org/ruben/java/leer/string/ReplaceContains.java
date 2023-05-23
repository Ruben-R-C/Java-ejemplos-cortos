package org.ruben.java.leer.string;

public class ReplaceContains {

public static void main(String[] args) {

    String myStr = "Hola Raul";
    
    System.out.println(myStr.contains("Ho"));    // true
    System.out.println(myStr.contains("ho"));    // false

    System.out.println(myStr.replaceAll("\\s", ""));  //HolaRaul
    System.out.println(myStr.replace('l', 'j'));      // Hoja Rauj
}


}
