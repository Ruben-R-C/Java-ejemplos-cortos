package org.ruben.java.customExcepcion;

import org.ruben.java.customExcepcion.domain.AppExcepcion;

public class CustomException {

    public static void main(String[] args) throws AppExcepcion   {
            hacerAlgo();
    }

    private static void hacerAlgo() throws AppExcepcion  {
        System.out.println("hacerAlgo()");

        try {
            lanzoErrorFuncional();
        } catch (AppExcepcion e) {
            throw new AppExcepcion(e, "Error al hacer algo");
        }
    }


    private static void lanzoErrorFuncional() throws AppExcepcion {
        System.out.println("lanzoErrorFuncional()");
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            throw new AppExcepcion (e, "Error al dividir por 0");
        }
    }
}

