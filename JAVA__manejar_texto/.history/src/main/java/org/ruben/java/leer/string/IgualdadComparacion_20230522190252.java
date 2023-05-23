package org.ruben.java.leer.string;

public class Iguales {


public static void main(String[] args) {
    \\\equalsIgnoreCase()

    String myStr1 = "Hello";
String myStr2 = "HELLO";
String myStr3 = "Another String";
System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false


String myStr1 = "HELLO";
String myStr2 = "hello";
System.out.println(myStr1.compareToIgnoreCase(myStr2))



String myStr1 = "Hello";
String myStr2 = "Hello";
System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal



String myStr = "Hello";
System.out.println(myStr.replace('l', 'p'));
}



}
