package org.ruben.java.leerProperties.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


/*
 * Clase propiesties, es un singleton (safe-thead)
 * para poder leer el properties
 */
public class SingletonProperties {


    private Properties	_oProperties;

    public SingletonProperties(String archivo)  {
		try(FileInputStream fileProperties = new FileInputStream(archivo)){
			_oProperties = new Properties( System.getProperties() );
			_oProperties.load( fileProperties );
		}
        catch(IOException exp){
            System.out.println("Error al leer los archivos de properties");

        }
    }

    private static ThreadLocal<SingletonProperties> _threadLoca;

    public static SingletonProperties getInstance(String archivo)  {
        //crear un singleton protegido contra multihilo
        _threadLoca = ThreadLocal.withInitial(() -> new SingletonProperties(archivo));
        return _threadLoca.get();
    }

	public String getValor( String sClave )  {
		return _oProperties.getProperty( sClave );
	}





    
}


