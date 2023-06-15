package org.ruben.java.customExcepcion.domain;


public class AppExcepcion extends Exception
{
	private static final AppVersion APP_VERSION;
	private String tipoError, descripcion;


    public AppExcepcion(Exception exception, String... description)
	{
		super(exception);
		cons( getText(description), exception.toString());
	}

	static {
		APP_VERSION = AppVersion.extraerAplicacionVersion();                         
	}

	private final void cons( String description, String tipoError)
	{
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
		//sb.append(System.lineSeparator());
		sb.append(APP_VERSION);
		sb.append(" ");
		sb.append(descripcion);
		sb.append(" [");
        sb.append(tipoError);
		sb.append("] ");
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

