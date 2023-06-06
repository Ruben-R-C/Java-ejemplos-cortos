package org.ruben.java.bash.variablesDeEntorno;

import java.io.IOException;
import java.util.Map;

public class MostrarVariablesSO {
    public static void main(String[] args) throws IOException {
        verVariablesDeEntorno();
    }

    private static void verVariablesDeEntorno() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        Map<String, String> environment = processBuilder.environment();
        environment.forEach((key, value) -> System.out.println(key + value));
    }
}
