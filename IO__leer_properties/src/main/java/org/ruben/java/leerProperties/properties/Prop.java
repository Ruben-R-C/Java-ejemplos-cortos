package org.ruben.java.leerProperties.properties;

import static org.ruben.java.leerProperties.properties.SingletonProperties.getRutaFicheroPropiedades;

import java.net.URL;

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

    public final static String  ARCHIVO_PROPIEDADES = "/ejemplo.properties";
    private static final URL RUTA_ARCHIVO_PROPERTIES = getRutaFicheroPropiedades(ARCHIVO_PROPIEDADES);

    private static String getValor(String clave){
        return SingletonProperties.getInstance(RUTA_ARCHIVO_PROPERTIES).getValor(clave);
    }
}
