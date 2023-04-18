package org.ruben.ficheros.ficheros;


public class Fichero {
    private String nombre;
    private String ruta;


    Fichero(String nombreFichero, String ruta){
        this.nombre = nombreFichero;
        this.ruta = ruta;
        
    }

    public String getNombreConRuta(){
        return this.ruta+"/"+this.nombre;
    }



    



}
