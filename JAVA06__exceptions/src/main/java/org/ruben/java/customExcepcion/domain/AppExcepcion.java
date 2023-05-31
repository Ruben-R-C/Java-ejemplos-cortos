package org.ruben.java.customExcepcion.domain;


public abstract class AppExcepcion extends Exception
{
	private String aplicacion,version, tipoError, descripcion;


    public AppExcepcion(String aplicacion, String versionApp, String[] description, Exception exception)
	{
		super(exception);
		cons( aplicacion, versionApp, getText(description), exception.toString());
	}

	private final void cons( String sAplicacion, String sVersionApp, String description, String tipoError)
	{
		this.aplicacion = sAplicacion;
		this.version = sVersionApp;
        this.descripcion = description;
		this.tipoError = tipoError;
	}


	public final String getMessage()
	{
		return toString();
	}

	@Override
	public final String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append(aplicacion);
        sb.append("_");
        sb.append(version);
		sb.append("] ");
		sb.append(descripcion);
        sb.append(" --- ");
        sb.append(tipoError);
        return sb.toString();
	}


	public final String getText(String[] descripcionTrozos)
	{
		StringBuffer sb = new StringBuffer();
		for (String trozo : descripcionTrozos) {
			sb.append(trozo);
			sb.append(" ");
		}
        return sb.toString();
	}
}

