
package org.ruben.java.inputStream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.apache.commons.io.IOUtils;


public class App {

    public static void main(String[] args) throws IOException {
        System.out.println("Inicio");
        leerArchivosURL();
        //podemos leer varias veces, moviendo el cursor al principio
        leerVariasVecesConCursor();
        //Leer varias veces InputStream con IOUtils de Apache Commons 
        copiarInputStreamConApacheCommon();
        System.out.println("Fin");

    }



    private static void copiarInputStreamConApacheCommon() throws IOException {
            //Input solo se consume una vez, pasandolo a array de bits
            InputStream original=IOUtils.toInputStream("Hola");
            byte[] bytes = IOUtils.toByteArray(original);
            original.close();

            //A partir de array de bits, genero los  inputStream
            InputStream is1 = new ByteArrayInputStream(bytes);
            String imprimir1 = new String(IOUtils.toByteArray(is1));
            System.out.println("Copia1: "+imprimir1);

            InputStream is2 = new ByteArrayInputStream(bytes);
            String imprimir2 = new String(IOUtils.toByteArray(is2));
            System.out.println("Copia1: "+imprimir2);

            is1.close();
            is2.close();           
    }




    private static void leerArchivosURL() throws IOException {
        //funciona con el espacio en la ruta
        InputStream oFisURL = new FileInputStream( "M:/ruta/hola mundo/a.xml" );

        //leer archivo de una url
        URL url = new URL( "file:///M:/ruta/hola%20mundo/a.xml" );
        InputStream oInputStream = url.openStream();
    }




    private static void leerVariasVecesConCursor() throws IOException {
        File initialFile = new File("src/main/resources/hola.txt");
        InputStream bis = new BufferedInputStream(new FileInputStream(initialFile));
        
        //marcamos el principio
        bis.mark(0);
        System.out.println("Char : "+(char)bis.read());
        System.out.println("Char : "+(char)bis.read());
        System.out.println("Char : "+(char)bis.read());
        System.out.println("Char : "+(char)bis.read());	
        //reiniciamos al principio
        bis.reset(); 
        System.out.println("Char : "+(char)bis.read());
        System.out.println("Char : "+(char)bis.read());
        System.out.println("Char : "+(char)bis.read());
        System.out.println("Char : "+(char)bis.read());
        bis.close(); 
    }





    
}
