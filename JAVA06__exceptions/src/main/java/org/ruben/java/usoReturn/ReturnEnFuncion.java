package org.ruben.java.usoReturn;

public class ReturnEnFuncion {

    static boolean a = true;
    static boolean b = true;


    //Entrar hacerAlgo
    //Entrar if a
    //Entrar For
    //Numero 0
    //Numero 1
    //Salir hacerAlgo
    public static void main(String[] args) {
        System.out.println("Entrar hacerAlgo");
        hacerAlgo();
        System.out.println("Salir hacerAlgo");
    }

    private static void hacerAlgo() {
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
