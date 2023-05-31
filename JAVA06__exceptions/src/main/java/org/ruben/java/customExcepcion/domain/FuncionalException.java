package org.ruben.java.customExcepcion.domain;

public class FuncionalException extends AppExcepcion
{


	public FuncionalException( Exception oEx, String... descripcion) {
        super("APP", "1.0.0", descripcion, oEx);
        //TODO Auto-generated constructor stub
    }

	public FuncionalException( String... descripcion) {
        super("APP", "1.0.0", descripcion, null);
        //TODO Auto-generated constructor stub
    }

}
