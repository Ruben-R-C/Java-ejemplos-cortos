package org.ruben.ficheros.leer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeerBinarioPorLineas {
 
    
    public static List<String> leeFicheroPorLineas(String nombrearchivo) {
        List<String> result;
        try (Stream<String> lines = Files.lines(Paths.get(nombrearchivo))) {
            result = lines.collect(Collectors.toList());
        } catch ( IOException exp ) {
			throw new RuntimeException("Error al leer el archivo: "+nombrearchivo, exp);
		}
        return result;

    }
}
