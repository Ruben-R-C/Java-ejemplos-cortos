package org.ruben.java.lambda.domain;

public class Persona implements Imprimible {
    public String nombre;
    public int edad;

    public Persona(){}

    @Override
    public void imprimir() {
        System.out.println("Hola, soy una persona");
    }
    
}
