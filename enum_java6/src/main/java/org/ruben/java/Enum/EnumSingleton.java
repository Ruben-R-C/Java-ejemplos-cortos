package org.ruben.java.Enum;

import org.ruben.java.Enum.dominio.SingletonEnum;

public class EnumSingleton {

    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;

        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }
}


