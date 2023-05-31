package org.ruben.java.customExcepcion;

import org.ruben.java.customExcepcion.domain.FuncionalException;

public class CustomException {

    public static void main(String[] args) {

        try {
            lanzoErrorFuncional();
            lanzoErrorFuncional2();
        } catch (FuncionalException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            //System.out.println(e.toString());
        }

    }

    private static void lanzoErrorFuncional() throws FuncionalException {
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            throw new FuncionalException(e, "Error al dividir por 0");
        }

    }


    private static void lanzoErrorFuncional2() throws FuncionalException {
        
            throw new FuncionalException("Error al dividir por 0");
        

    }
}
