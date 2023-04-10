package org.ruben.java.lambda.domain;

@FunctionalInterface //tenemos solamente un metodo abstracto para usarlo en expresiones lambda
                    //podemos tener otros metodos, metodos estaticos pero solamente uno abstractosgit
public interface Imprimible4 {

    String imprimir(String preffix,String suffix);
}
