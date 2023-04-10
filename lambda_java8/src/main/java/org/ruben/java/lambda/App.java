package org.ruben.java.lambda;

import org.ruben.java.lambda.domain.Imprimible;
import org.ruben.java.lambda.domain.Imprimible2;
import org.ruben.java.lambda.domain.Imprimible3;
import org.ruben.java.lambda.domain.Imprimible4;
import org.ruben.java.lambda.domain.Persona;

public class App {
    public static void main(String[] args) {
        Persona per = new Persona();
        per.imprimir(); //invocamos interface
        algoImprimir(per); //invocamos interface

        algoImprimir(   //lambda pasamos la implementacion directamente de la interface
            () -> {  
                System.out.println("Hola!");  
            }
        );
        //lambda quitamos los curly braces
        algoImprimir( () ->  System.out.println("Hola!!"));

        //sin parametros
        Imprimible imprimible = () -> System.out.println("Hola!!!");;
        algoImprimir(imprimible);

        //un parametro
        Imprimible2 imprimible2 = sufijo -> System.out.println("Hola!!!!"+sufijo);
        algoImprimir2(imprimible2);

        //dos parametros
        Imprimible3 imprimible3 = (prefijo,sufijo) -> System.out.println(prefijo+"Hola!!!!"+sufijo);
        algoImprimir3(imprimible3);

        //return method
        Imprimible4 imprimible4 = (prefijo,sufijo) -> { return prefijo+"Adios"+sufijo; };
        algoImprimir4(imprimible4);

        Imprimible4 imprimibl4 = (prefijo,sufijo) -> prefijo+"Adioss!"+sufijo;
        algoImprimir4(imprimibl4);



    }

    static void algoImprimir(Imprimible imprimible){
        imprimible.imprimir();
    }

    static void algoImprimir2(Imprimible2 imprimible){
        imprimible.imprimir("sufijo");
    }

    static void algoImprimir3(Imprimible3 imprimible){
        imprimible.imprimir("pre","suf");
    }

    static void algoImprimir4(Imprimible4 imprimible){
        System.out.println(imprimible.imprimir("pre","suf"));
    }
}
