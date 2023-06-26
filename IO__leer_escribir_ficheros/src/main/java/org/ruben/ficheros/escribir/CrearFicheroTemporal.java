package org.ruben.ficheros.escribir;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearFicheroTemporal {
    public static void main(String[] args) {
        crearficherotemporal();
        crearficherotemporalConRuta();
    }


    public static void crearficherotemporal() {
        try {
            // Genera el fichero temporal es un texto aleatori con prefijos y sufijos
            // Si el sufijo es null, le pone “.tmp”.
            File tempFile = File.createTempFile("mificherotemporal", null); // mificherotemporal8803114360681798207.tmp

            // Permite que el fichero se borre al salir del programa
            tempFile.deleteOnExit();

            BufferedWriter out = new BufferedWriter(new FileWriter(tempFile));

            out.write("Esto es un fichero temporal");
            out.close();

            mostrarRuta(tempFile);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void crearficherotemporalConRuta() {
        try {
            File tempFile = File.createTempFile("pruebaRUben",
                    ".txt",
                    new File("C:/Users/Ruben/Desktop"));
            tempFile.deleteOnExit();
            mostrarRuta(tempFile);

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private static void mostrarRuta(File tempFile) {
        // check if the file is created
        if (tempFile.exists()) {
            System.out.println("Fichero creado: "
                    + tempFile.getAbsolutePath());
        } else {
            System.out.println("No se ha podido crear: "
                    + tempFile.getAbsolutePath());
        }
    }

}
