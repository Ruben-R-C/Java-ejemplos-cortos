package org.ruben.java.excepciones;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ImprimirExcepcion {
    public static void main(String[] args) {

        imprimirToString();
        imprimirPrintStackTrace1();
        imprimirPrintStackTrace2();
    }

    // toString devuelve un string de la descripcion del error sin la pila
    // java.lang.ArithmeticException: / by zero
    private static void imprimirToString() {
        try {
            System.out.println(12 / 0);
        } catch (ArithmeticException e) {
            System.out.println("PINTATR EN LOG ->" + e.toString());
        }
    }

    // pinta la pila por consola
    // java.lang.ArithmeticException: / by zero
    // at org.ruben.java.excepciones.ImprimirExcepcion.imprimirPrintStackTrace(ImprimirExcepcion.java:23)
    // at org.ruben.java.excepciones.ImprimirExcepcion.main(ImprimirExcepcion.java:7)
    private static void imprimirPrintStackTrace1() {
        try {
            System.out.println(12 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    // devuelve un String de la pila del error 
    // java.lang.ArithmeticException: / by zero
    // at org.ruben.java.excepciones.ImprimirExcepcion.imprimirPrintStackTrace(ImprimirExcepcion.java:23)
    // at org.ruben.java.excepciones.ImprimirExcepcion.main(ImprimirExcepcion.java:7)
    private static void imprimirPrintStackTrace2() {
        try {
            System.out.println(12 / 0);
        } catch (ArithmeticException e) {
            System.out.println("PINTAR EN LOG ->" + parsearStacktraceToString(e));

        }
    }

    public static String parsearStacktraceToString(Exception e) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        e.printStackTrace(ps);
        ps.close();
        return baos.toString();
    }

}
