package equipoFutbol;

import java.util.HashSet;

public class Equipo2 {

    private String nombre;
    private HashSet<Jugador>jugadores;

    public Equipo2(String nombre, HashSet<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashSet<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
