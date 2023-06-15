package org.ruben.java.customExcepcion;

import org.ruben.java.customExcepcion.domain.CodigoError;
import org.ruben.java.customExcepcion.domain.MyException;

public class CodeException {

    public static void main(String[] args) throws MyException   {
            

        throw new MyException("Descripcion",CodigoError.ARGUMENTOS_INICIO_INVALIDOS);
    }


}

