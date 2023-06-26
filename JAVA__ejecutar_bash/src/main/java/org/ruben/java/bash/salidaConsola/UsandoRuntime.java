package org.ruben.java.bash.salidaConsola;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class UsandoRuntime {
        public static void main(String[] args) {
                mostrarDirectoriosConsola("\"C:/Users/Ruben/Desktop/\"");
        }

        private static void mostrarDirectoriosConsola(String homeDirectory) {
                System.out.println("os.name -> " + System.getProperty("os.name"));

                boolean isWindows = System.getProperty("os.name")
                                .toLowerCase().startsWith("windows");

                System.out.println("isWindows -> " + isWindows);

                Process process;
                int exitCode = -1;
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                try {

                        if (isWindows) {
                                process = Runtime.getRuntime().exec(String.format("cmd.exe /c dir %s", homeDirectory));
                        } else {
                                process = Runtime.getRuntime().exec(String.format("/bin/sh -c ls %s", homeDirectory));
                        }
                        SalidaStream streamGobbler = new SalidaStream(process.getInputStream(), System.out::println);
                        executorService.submit(streamGobbler);
                        exitCode = process.waitFor();

                } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                } finally {
                        executorService.shutdown();

                }

                // Diferente de cero, implica error en la shell
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
