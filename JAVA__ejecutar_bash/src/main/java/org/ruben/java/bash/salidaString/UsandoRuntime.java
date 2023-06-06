package org.ruben.java.bash.salidaString;

import java.io.*;
import java.util.Arrays;

public class UsandoRuntime {
    public static void main(String args[]) {
        //ejecutarComando("java -version");
        ejecutarComando("dir .");
    }

    private static void ejecutarComando(String comando) {
        String osName = System.getProperty("os.name");
        if (!osName.toLowerCase().startsWith("windows")) {
            throw new RuntimeException("N");
        }

        try {
            String[] cmd = { "cmd.exe", "/C", comando };

            Runtime rt = Runtime.getRuntime();

            System.out.print("Ejecutando [");
            Arrays.stream(cmd).forEach(str -> System.out.print(str + " "));
            System.out.println("]");

            Process proc = rt.exec(cmd);
            // Salida error
            SalidaStream errorGobbler = new SalidaStream(proc.getErrorStream(), "ERROR");
            // Salida normal
            SalidaStream outputGobbler = new SalidaStream(proc.getInputStream(), "OUTPUT");

            // Iniciar
            errorGobbler.start();
            outputGobbler.start();

            // Distinto de cero es error
            int exitVal = proc.waitFor();
            System.out.println("ExitValue: " + exitVal);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    static class SalidaStream extends Thread {
        InputStream is;
        String type;

        SalidaStream(InputStream is, String type) {
            this.is = is;
            this.type = type;
        }

        public void run() {
            try {
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String line = null;
                while ((line = br.readLine()) != null)
                    System.out.println(type + ">" + line);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}