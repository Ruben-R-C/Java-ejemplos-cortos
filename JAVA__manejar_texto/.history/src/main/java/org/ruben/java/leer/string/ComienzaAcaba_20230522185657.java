package org.ruben.java.leer.string;

public class App {
    

    https://www.baeldung.com/string/starts-with

public static void main(String[] args) {
    String myStr = "Hola";
    System.out.println(myStr.endsWith("Ho"));   // false
    System.out.println(myStr.endsWith("la"));   // true

    String str = "Adios";
    System.out.println(str.startsWith("Adi"));           //true
    System.out.println(str.startsWith("os" ));           // false 
    System.out.println(str.startsWith("io", 1));

    assertTrue(str.startsWith("Adi"));             //true
    assertTrue(str.startsWith("dios", 1)); // false 
}
   


}
