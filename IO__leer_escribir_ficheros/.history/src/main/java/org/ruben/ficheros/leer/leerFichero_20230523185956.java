package org.ruben.ficheros.leer;

public class leerFichero {
        /**
	 * Leemos un fichero y devolvemos un String con el contenido.
	 * El encoding puede ser por ejemplo "ISO-8859-1" o "UTF-8"
     */
    public static String leerFichero( String rutaNombreFichero, String encoding ) {
		File file = new File(rutaNombreFichero);
		try(InputStream oIs = new FileInputStream(file))  {
			byte[] abBuffer = new byte[oIs.available()];
			oIs.read( abBuffer, 0, oIs.available() );
			return new String( abBuffer, encoding );
		} catch ( IOException exp ) {
			throw new RuntimeException("Error al leer los archivo: "+rutaNombreFichero, exp);
		}
	}
}
