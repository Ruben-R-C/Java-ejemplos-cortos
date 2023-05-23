package org.ruben.java.leer.string;

public class Substring {

public static void main(String[] args) {

    String texto = "Hola Raul";
    System.out.println(texto.substring(0, 4)); //Hola

    //subSequence is igual a substring pero devuelve un CharSequence
    //public CharSequence subSequence(int beginIndex, int endIndex)
    System.out.println(texto.subSequence(0, 4)); //Hola
}



}
