package org.ruben.java.bash.salidaConsola;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class UsandoProcessBuilder {



    public static void main(String[] args) {
        // ProcessBuilder es preferible sobre Runtime
        mostrarDirectoriosConsola();
    }

    private static void mostrarDirectoriosConsola() {


        boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (isWindows) {
            //
            processBuilder.command("cmd.exe", "/c", "dir");
        } else {
            processBuilder.command("sh", "-c", "ls");
        }
        processBuilder.directory(new File(System.getProperty("user.home")));
        Process process;
        int exitCode = -1;

        try {
            process = processBuilder.start();
            //Salida normal -> Pasamos metodo por referencia.
            SalidaStream streamSalida = new SalidaStream(process.getInputStream(), System.out::println);
            //Salida errores.
            SalidaStream streamError = new SalidaStream(process.getErrorStream(), System.err::println);
            executorService.submit(streamError);
            executorService.submit(streamSalida);

            exitCode = process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        System.out.println("----------------------------");
        System.out.println("os.name -> " + System.getProperty("os.name"));
        System.out.println("isWindows -> " + isWindows);
        System.out.println("ExitValue: " + exitCode);
    }

    private static class SalidaStream implements Runnable {
        private InputStream inputStream;
        private Consumer<String> consumer;

        public SalidaStream(InputStream inputStream, Consumer<String> consumer) {
            this.inputStream = inputStream;
            this.consumer = consumer;
        }

        @Override
        public void run() {
            new BufferedReader(new InputStreamReader(inputStream)).lines()
                    .forEach(consumer);
        }
    }

}
