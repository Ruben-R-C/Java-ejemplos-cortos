package org.ruben.java.leerProperties.properties;

public enum Prop implements getValueInteface{
    NUMERO_DE_HILOS {
        @Override
        public String get() {
            return getValor("numero_de_hilos");
        }
    },
    DIRECTORIO_DE_LECTURA {
        @Override
        public String get() {
            return getValor("directorio_de_lectura");
        }
    };

    private static String getValor(String clave){
        return SingletonProperties.getInstance(ARCHIVO_PROPERTIES).getValor(clave);

    }


    private static final String ARCHIVO_PROPERTIES = "src/main/resources/ejemplo.properties";
	
}