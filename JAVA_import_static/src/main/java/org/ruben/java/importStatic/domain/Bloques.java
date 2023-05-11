package org.ruben.java.importStatic.domain;

public class Bloques {

    static{
        System.out.println("Static");
    }

    {
        System.out.println("Non-static block");
    }

}