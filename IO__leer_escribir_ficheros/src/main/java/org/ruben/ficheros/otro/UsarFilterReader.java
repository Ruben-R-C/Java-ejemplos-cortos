package org.ruben.ficheros.otro;

import java.io.ByteArrayInputStream;
import java.io.FilterReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

public class UsarFilterReader {
    public static void main(String[] args) throws IOException
    {
        Reader r = new StringReader("GeeksforGeeks");

        InputStream initialStream = new ByteArrayInputStream("With Java".getBytes());
        Reader targetReader = new InputStreamReader(initialStream);

        FilterReader fr = new FilterReader(r) 
        {
        };
        //
          
        //soporta mark and reset method 
        //Si hemos ledo los bytes y estamos al final de la posicion ya no se permiote marcar
        if(fr.markSupported())
        {
            //to mark the current position in the input stream
            //stream somehow saves all the bytes that were read after the mark()
            //and returns same bytes again when reset() method is called

            System.out.println("mark method is supported");
            fr.mark(100);
        }
          
        //illustrating skip() method
        fr.skip(5);
          
        //illustrating ready()
        if(fr.ready())
        {
            //illustrating read(char[] cbuff,int off,int len)
            char ch[] = new char[8];
            fr.read(ch);
            for (int i = 0; i < 8; i++) 
            {
                System.out.print(ch[i]);
            }
              
            //illustrating reset()
            fr.reset();
            for (int i = 0; i <5 ; i++)
            {
                //illustrating read()
                System.out.print((char)fr.read());
            }
        }
          
        //closing the stream
        fr.close();
    }
    
}
