package org.ruben.ficheros.leer;

public class leerBinarioPorLineas {
 
    
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
