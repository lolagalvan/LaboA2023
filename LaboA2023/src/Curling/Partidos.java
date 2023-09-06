package Curling;

import Personas.Equipo;
import Personas.Jugador;
import Tiempo.Semana;
import Enums.Turnos;

import java.util.ArrayList;

public class Partidos {
    private Equipo equipo1;
    private Equipo equipo2;
    private Semana dia;
    private Turnos hora;


    public Partidos(Equipo equipo1, Equipo equipo2, Semana dia, Turnos hora) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.dia = dia;
        this.hora = hora;
    }

    public Partidos() {
        equipo1 = new Equipo();
        equipo2 = new Equipo("Jelly","Villa Devoto", new ArrayList<Jugador>(), 3, Turnos.MANIANA,new ArrayList<Boolean>() );
        dia = Semana.LUNES;
        hora = Turnos.MANIANA;
    }


    public Partidos(Equipo equipo1, Equipo equipo2){
        if(equipo1.getHoraDisponible().equals(equipo2.getHoraDisponible())){
            for(int i=0; i<6; i++) {
                if (equipo1.getDiaDisponible().get(i) ==equipo2.getDiaDisponible().get(i)){
                    switch (i){
                        case 1:
                            dia = Semana.LUNES;
                            break;

                        case 2:
                            dia = Semana.MARTES;
                            break;

                        case 3:
                            dia = Semana.MIERCOLES;
                            break;

                        case 4:
                            dia = Semana.JUEVES;
                            break;

                        case 5:
                            dia = Semana.VIERNES;
                            break;
                        default:
                            dia = Semana.SABADO;
                            break;
                    }
                }else{ dia = Semana.SABADO; }
            }
            if(equipo1.getHoraDisponible().equals(Turnos.MANIANA)){
                hora = Turnos.MANIANA;
            } else if (equipo1.getHoraDisponible().equals(Turnos.TARDE)) {
                hora = Turnos.TARDE;
            } else if(equipo1.getHoraDisponible().equals(Turnos.NOCHE)) {
                hora = Turnos.NOCHE;
            }
        }
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

    public Semana getDia() {
        return dia;
    }

    public void setDia(Semana dia) {
        this.dia = dia;
    }

    public Turnos getHora() {
        return hora;
    }

    public void setHora(Turnos hora) {
        this.hora = hora;
    }
}
