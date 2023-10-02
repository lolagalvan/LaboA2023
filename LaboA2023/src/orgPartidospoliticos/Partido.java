package orgPartidospoliticos;

import java.util.HashSet;

public class Partido {
    private String nombre;
    private String direccionOficinaCentral;
    private int cantAfiliados;
    private HashSet<Mensaje> mensajeros;

    public Partido(String nombre, String direccionOficinaCentral, int cantAfiliados, HashSet<Mensaje> mensajeros) {
        this.nombre = nombre;
        this.direccionOficinaCentral = direccionOficinaCentral;
        this.cantAfiliados = cantAfiliados;
        this.mensajeros = mensajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionOficinaCentral() {
        return direccionOficinaCentral;
    }

    public void setDireccionOficinaCentral(String direccionOficinaCentral) {
        this.direccionOficinaCentral = direccionOficinaCentral;
    }

    public int getCantAfiliados() {
        return cantAfiliados;
    }

    public void setCantAfiliados(int cantAfiliados) {
        this.cantAfiliados = cantAfiliados;
    }

    public HashSet<Mensaje> getEnviadoresMensajes() {
        return mensajeros;
    }

    public void setEnviadoresMensajes(HashSet<Mensaje> enviadoresMensajes) {
        this.mensajeros = enviadoresMensajes;
    }

    public void hacerPolitica(Partido partido){
        for(Mensaje mensajero : mensajeros){
            mensajero.mensajeApoyo(partido);
        }
    }
}

