package equipoFutbol;

import java.util.ArrayList;
import java.util.HashMap;

public class Partido {
    private Equipo2 equipo1;
    private Equipo2 equipo2;
    private int golesAtajadosEquipo1;
    private int golesAtajadosEquipo2;
    private HashMap<Jugador,Integer>golesXjugador;
    private HashMap<Jugador,Integer>asistenciaXjugador;

    public Partido(Equipo2 equipo1, Equipo2 equipo2, int golesAtajadosEquipo1, int golesAtajadosEquipo2, HashMap<Jugador, Integer> golesXjugador, HashMap<Jugador, Integer> asistenciaXjugador) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesAtajadosEquipo1 = golesAtajadosEquipo1;
        this.golesAtajadosEquipo2 = golesAtajadosEquipo2;
        this.golesXjugador = golesXjugador;
        this.asistenciaXjugador = asistenciaXjugador;
    }

    public Equipo2 getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo2 equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo2 getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo2 equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGolesAtajadosEquipo1() {
        return golesAtajadosEquipo1;
    }

    public void setGolesAtajadosEquipo1(int golesAtajadosEquipo1) {
        this.golesAtajadosEquipo1 = golesAtajadosEquipo1;
    }

    public int getGolesAtajadosEquipo2() {
        return golesAtajadosEquipo2;
    }

    public void setGolesAtajadosEquipo2(int golesAtajadosEquipo2) {
        this.golesAtajadosEquipo2 = golesAtajadosEquipo2;
    }

    public HashMap<Jugador, Integer> getGolesXjugador() {
        return golesXjugador;
    }

    public void setGolesXjugador(HashMap<Jugador, Integer> golesXjugador) {
        this.golesXjugador = golesXjugador;
    }

    public HashMap<Jugador, Integer> getAsistenciaXjugador() {
        return asistenciaXjugador;
    }

    public void setAsistenciaXjugador(HashMap<Jugador, Integer> asistenciaXjugador) {
        this.asistenciaXjugador = asistenciaXjugador;
    }
}
