package org.ruben.java.anonymousInnerClass;

import org.ruben.java.anonymousInnerClass.domain.Persona;

public class App {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.saludar();

        //crear una clase anomima es 
        //como crear una subclase
        Persona persona2 = new Persona(){
            public void hola(){
                System.out.println("Holita");
            }

            @Override
            public void saludar(){
                System.out.println("Saludo");
            }
        };
        persona2.saludar();


        //podemos crear una clase anonimas de una interfaz
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("anonymous runnable");
            }
            
        };

        runnable.run();

    }


}
