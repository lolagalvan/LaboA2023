package lugares;

import Personas.Equipo;

import java.util.ArrayList;

public class Torneo {

    private ArrayList<Equipo> equipos;
    private ArrayList<Partidos> partidos;


    public Torneo(ArrayList<Equipo> equipos, ArrayList<Partidos> partidos) {
        this.equipos= equipos;
        this.partidos= partidos;

    }
}
