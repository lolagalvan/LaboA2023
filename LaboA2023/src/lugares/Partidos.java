package lugares;

import Personas.Equipo;
import Tiempo.Fecha;

import java.util.ArrayList;

public class Partidos {

    private Equipo equipo1;
    private Equipo equipo2;
    private String horario;
    private Fecha fecha;


    public Partidos (String horario, Equipo equipo1, Equipo equipo2 , Fecha fecha ){
        this.horario=horario;
        this.equipo1=equipo1;
        this.equipo2= equipo2;
        this.fecha=fecha;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

}

