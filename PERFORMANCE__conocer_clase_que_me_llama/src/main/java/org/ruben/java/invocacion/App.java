
package org.ruben.java.invocacion;

import org.ruben.java.invocacion.trazar.Trazar;
import org.ruben.java.invocacion.trazar.Trazar1;
import org.ruben.java.invocacion.trazar.Trazar2;
import org.ruben.java.invocacion.trazar.Trazar3;
import org.ruben.java.invocacion.trazar.Trazar4;

public class App {

    public static void main(String[] args)  {      
        
        medirTiempo(new Trazar1());
        medirTiempo(new Trazar2()); 
        medirTiempo(new Trazar3());
        medirTiempo(new Trazar4()); 

    }


    private static void medirTiempo(Trazar trazar) {
        long startTime = System.nanoTime();
        String quienllama="";
        for (int i = 0; i < 1000000; i++) {
            quienllama = trazar.quienMeLLama();
            //otra.quienMeLLama(App.class);
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println(trazar.getClass()+"   "+quienllama+"  tiempo:"+elapsedTime/1000000+"ms");
    }










    
}
