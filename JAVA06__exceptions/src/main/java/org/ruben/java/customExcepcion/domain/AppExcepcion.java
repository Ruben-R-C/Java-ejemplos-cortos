package org.ruben.java.customExcepcion.domain;


public abstract class AppExcepcion extends Exception
{
	private String _sAplicacion,_sVersionApp, descripcion;


    public AppExcepcion(String sAplicacion, String sVersionApp, Exception oEx)
	{
		super(oEx);
		cons( sAplicacion, sVersionApp, oEx.toString());
	}

	private final void cons( String sAplicacion, String sVersionApp, String descripcion)
	{
		_sAplicacion = sAplicacion;
		_sVersionApp = sVersionApp;
        this.descripcion = descripcion;

	}


	public final String getMessage()
	{
		return toString();
	}
	public final String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append(_sAplicacion);
        sb.append("_");
        sb.append(_sVersionApp);
		sb.append("] ");
        sb.append(descripcion);
        return sb.toString();
	}
}

