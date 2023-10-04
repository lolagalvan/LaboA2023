package equipoFutbol;

import java.util.ArrayList;
import java.util.HashMap;

public class Partido {
    private Equipo2 equipo1;
    private Equipo2 equipo2;
    private HashMap<Jugador, ArrayList<Integer>>estadisticas;
    private int golesEquipo1;
    private int golesEquipo2;

    public Partido(Equipo2 equipo1, Equipo2 equipo2, HashMap<Jugador, ArrayList<Integer>> estadisticas, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.estadisticas = estadisticas;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
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

    public HashMap<Jugador, ArrayList<Integer>> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(HashMap<Jugador, ArrayList<Integer>> estadisticas) {
        this.estadisticas = estadisticas;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }
}
