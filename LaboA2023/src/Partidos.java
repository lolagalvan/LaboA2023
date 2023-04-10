import java.util.ArrayList;

public class Partidos {

    private Equipos equipo1;
    private Equipos equipo2;
    private String horario;
    private Fecha fecha;


    public Partidos (String horario, Equipos equipo1,  Equipos equipo2 ,Fecha fecha ){
        this.horario=horario;
        this.equipo1=equipo1;
        this.equipo2= equipo2;
        this.fecha=fecha;
    }

    public Equipos getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipos equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipos getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipos equipo2) {
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

