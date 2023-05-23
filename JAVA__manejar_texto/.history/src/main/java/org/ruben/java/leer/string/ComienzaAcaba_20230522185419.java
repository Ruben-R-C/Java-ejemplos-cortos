package org.ruben.java.leer.string;

public class App {
    

    https://www.baeldung.com/string/starts-with

public static void main(String[] args) {
    String myStr = "Hola";
    System.out.println(myStr.endsWith("Ho"));   // false
    System.out.println(myStr.endsWith("la"));   // true

    String str = "Adios";
    assertTrue(str.startsWith("Adi"));
    assertTrue(str.startsWith("dios", 1));
}
   


}
