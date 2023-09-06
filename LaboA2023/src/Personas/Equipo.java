package Personas;

import Personas.Jugador;
import Enums.Turnos;

import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String barrioProcedencia;
    private ArrayList<Jugador> jugadores;
    private int numCapitan;
    private ArrayList<Boolean> diaDisponible;
    private Turnos horaDisponible;
    private static int cantJugadores=10;

    public Equipo(){
        nombreEquipo="Staylor";
        barrioProcedencia="Villa Pueyrredon";
        jugadores=new ArrayList<Jugador>(cantJugadores);
        numCapitan=1;
        horaDisponible= Turnos.MANIANA;
        diaDisponible=new ArrayList<Boolean>(6);
    }

    public Equipo(String nombreEquipo, String barrioProcedencia, ArrayList<Jugador> integrantes, int numCapitan, Turnos horaDisponible, ArrayList<Boolean> diaDisponible) {
        this.nombreEquipo = nombreEquipo;
        this.barrioProcedencia = barrioProcedencia;
        this.jugadores = integrantes;
        this.numCapitan = numCapitan;
        this.horaDisponible = horaDisponible;
        this.diaDisponible = diaDisponible;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getBarrioProcedencia() {
        return barrioProcedencia;
    }

    public void setBarrioProcedencia(String barrioProcedencia) {
        this.barrioProcedencia = barrioProcedencia;
    }

    public ArrayList<Jugador> getIntegrantes() {
        return jugadores;
    }

    public void setIntegrantes(ArrayList<Jugador> integrantes) {
        this.jugadores = integrantes;
    }

    public int getNumCapitan() {
        return numCapitan;
    }

    public void setNumCapitan(int numCapitan) {
        this.numCapitan = numCapitan;
    }

    public ArrayList<Boolean> getDiaDisponible() {
        return diaDisponible;
    }

    public void setDiaDisponible(ArrayList<Boolean> diaDisponible) {
        this.diaDisponible = diaDisponible;
    }

    public Turnos getHoraDisponible() {
        return horaDisponible;
    }

    public void setHoraDisponible(Turnos horaDisponible) {
        this.horaDisponible = horaDisponible;
    }

    public Boolean validacionNumeroJugador(Jugador nuevoJugador){
        boolean puedeEntrar=true;
        for(Jugador jugador : jugadores){
            if(jugador.getNumero()==nuevoJugador.getNumero()){
                puedeEntrar=false;
            }
        }
        return puedeEntrar;
    }
    public void agregarJugador(Jugador nuevoJugador){
        boolean validar= validacionNumeroJugador(nuevoJugador);
        if (validar) {
            jugadores.add(nuevoJugador);
            if(nuevoJugador.getNumero()==numCapitan){
                nuevoJugador.setCapitan(true);
            }
        } else {
            System.out.println("Ya hay un jugador con este numero");
        }
    }
}
