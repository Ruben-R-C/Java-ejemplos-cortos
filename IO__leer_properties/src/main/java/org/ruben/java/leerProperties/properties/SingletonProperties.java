package org.ruben.java.leerProperties.properties;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;


/*
 * Clase propiesties, es un singleton (safe-thead)
 * para poder leer el properties
 */
public class SingletonProperties {

    private Properties	_oProperties;
    
    public SingletonProperties(URL  archivo)  {
		try(InputStream input = archivo.openStream();){
			_oProperties = new Properties( System.getProperties() );
			_oProperties.load( input );
		}
        catch(IOException exp){
            throw new RuntimeException("Error al leer los archivos de properties "+archivo,exp);
        }
    }

    private static ThreadLocal<SingletonProperties> _threadLoca;

    public static SingletonProperties getInstance(URL archivo)  {
        //crear un singleton protegido contra multihilo
        _threadLoca = ThreadLocal.withInitial(() -> new SingletonProperties(archivo));
        return _threadLoca.get();
    }

	public String getValor( String sClave )  {
		return _oProperties.getProperty( sClave );
	}

    static URL getRutaFicheroPropiedades(String nombreArchivo) {
        return SingletonProperties.class.getResource(nombreArchivo);
    }


}


