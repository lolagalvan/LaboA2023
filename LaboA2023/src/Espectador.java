import Personas.Persona;

import java.util.HashSet;

public class Espectador extends Persona {
    private static int contador= 0;
    private  int idEspectador;
    private String mail;
    private HashSet<Funcion> funcionesVistas;

    public Espectador( String mail, HashSet<Funcion> funcionesVistas) {
        contador++;
        this.idEspectador = contador;
        this.mail = mail;
        this.funcionesVistas = funcionesVistas;
    }

    public Espectador( String mail) {
        contador=+1;
        this.idEspectador = contador;
        this.mail = mail;
        funcionesVistas = new HashSet<>();
    }

    public Espectador() {
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Espectador.contador = contador;
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

    public HashSet<Funcion> getFuncionesVistas() {
        return funcionesVistas;
    }

    public void setFuncionesVistas(HashSet<Funcion> funcionesVistas) {
        this.funcionesVistas = funcionesVistas;
    }
}
