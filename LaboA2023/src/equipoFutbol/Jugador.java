package equipoFutbol;

import PASO.Provincia;
import Personas.Persona;
import Tiempo.Fecha;

import java.util.HashSet;

public abstract class Jugador extends Persona implements Contrato {
    private Posicion posicion;
    private Provincia provincia;
    private HashSet<Equipo2>equiposJugados;
    private int numCamiseta;
    private Equipo2 equipoactual;

    public Jugador(String nombre, int edad, String direccion, String apellido, int telefono, Fecha nacimiento, Posicion posicion, Provincia provincia, HashSet<Equipo2> equiposJugados, int numCamiseta,Equipo2 equipoactual) {
        super(nombre, edad, direccion, apellido, telefono, nacimiento);
        this.posicion = posicion;
        this.provincia = provincia;
        this.equiposJugados = equiposJugados;
        this.numCamiseta = numCamiseta;
        this.equipoactual=equipoactual;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public HashSet<Equipo2> getEquiposJugados() {
        return equiposJugados;
    }

    public void setEquiposJugados(HashSet<Equipo2> equiposJugados) {
        this.equiposJugados = equiposJugados;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public Equipo2 getEquipoactual() {
        return equipoactual;
    }

    public void setEquipoactual(Equipo2 equipoactual) {
        this.equipoactual = equipoactual;
    }
}
