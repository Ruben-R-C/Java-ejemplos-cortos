package org.ruben.java.usoReturn;


public class ReturnClausura {

    static boolean a = true;
    static boolean b = true;

    // uso return para falir de dos condicionales y un bucle
    //Entrar if a
    //Entrar For
    //Numero 0
    //Numero 1
    public static void main(String[] args) {

        if (a) {
            System.out.println("Entrar if a");

            if (b) {
                System.out.println("Entrar For");
                for (int i = 0; i < 5; i++) {
                    System.out.println("Numero " + i);
                    if (i == 1) {
                        return;
                    }
                }
                System.out.println("Salir For ");
            }
            System.out.println("Salir if b ");
        }

    }
}
