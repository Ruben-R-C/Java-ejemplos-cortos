package org.ruben.java.leer.string;

public class ReplaceContains {

public static void main(String[] args) {
    String myStr = "Hola";
    System.out.println(myStr.replace('l', 'j')); // Hoja
    

    System.out.println(myStr.contains("Ho"));    // true
    System.out.println(myStr.contains("l"));     // true
    System.out.println(myStr.contains("Hi"));    // false
}


}
