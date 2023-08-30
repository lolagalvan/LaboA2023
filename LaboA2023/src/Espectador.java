import Personas.Persona;

import java.util.HashSet;

public class Espectador extends Persona {
    private int idEspectador;
    private String mail;
    private HashSet<Funcion>funciones;

    public Espectador(int idEspectador, String mail, HashSet<Funcion> funciones) {
        this.idEspectador = idEspectador;
        this.mail = mail;
        this.funciones = funciones;
    }

    public int getIdEspectador() {
        return idEspectador;
    }

    public void setIdEspectador(int idEspectador) {
        this.idEspectador = idEspectador;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(HashSet<Funcion> funciones) {
        this.funciones = funciones;
    }
}
