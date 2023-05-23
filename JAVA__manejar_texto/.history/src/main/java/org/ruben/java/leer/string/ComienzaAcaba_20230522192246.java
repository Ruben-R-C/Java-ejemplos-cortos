package org.ruben.java.leer.string;

public class ComienzaAcaba {

    public static void main(String[] args) {

        String myStr = "Hola";
        System.out.println(myStr.endsWith("Ho")); // false
        System.out.println(myStr.endsWith("la")); // true

        String str = "Adios";
        System.out.println(str.startsWith("Adi")); // true
        System.out.println(str.startsWith("os")); // false
        System.out.println(str.startsWith("io", 2)); // true

    }





    public static boolean terminaE(String text, String suffix) {
        if (text == null || suffix == null) {
            return false;
        }
        String regex = ".*" + suffix + "$";
        return text.matches(regex);
    }

}
