package Personas;

import Personas.Persona;

public class Jugador extends Persona {
    private int numero;
    private boolean capitan;

    public Jugador(){
        super();
        numero=8;
        capitan=false;
    }

    public Jugador(int numero, boolean capitan) {
        this.numero = numero;
        this.capitan = capitan;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean getCapitan() {
        return capitan;
    }

    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }
}
