package org.ruben.java.customExcepcion.domain;

public class AppVersion 
{
private final String nombreApp;
private final String version;


    public AppVersion(String nombreApp, String version) {
    this.nombreApp = nombreApp;
    this.version = version;
}

    static AppVersion extraerAplicacionVersion() {
        //logica de extraer nombre app y version 
		return new AppVersion("App", "1.0.0");
	}

    @Override
    public String toString() {
        return "("+nombreApp + "_" + version + ")";
    }


}
