package org.ruben.java.bash.variablesDeEntorno;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class AddVariableSO {
    public static void main(String[] args) throws IOException {
        aniadirNuevoVariableDeEntorno();
    }

    private static void aniadirNuevoVariableDeEntorno() throws IOException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ProcessBuilder processBuilder = new ProcessBuilder();
        Map<String, String> environment = processBuilder.environment();
        //añadimosvariable de entorno usando processBuilder
        environment.put("SALUDO", "Hola Mundo");
        processBuilder.command("cmd.exe", "/c", "echo %SALUDO%");
        Process process = processBuilder.start();
        SalidaStream streamSalida = new SalidaStream(process.getInputStream(), System.out::println);
        executorService.submit(streamSalida);
        executorService.shutdown();
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
