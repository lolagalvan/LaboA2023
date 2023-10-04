package equipoFutbol;

import PASO.Provincia;
import Tiempo.Fecha;

import java.util.HashSet;

public class JugadoresCampo extends Jugador implements Estadisticas{

    private double goles;
    private int cantAsistencias;

    public JugadoresCampo(String nombre, int edad, String direccion, String apellido, int telefono, Fecha nacimiento, Posicion posicion, Provincia provincia, HashSet<Equipo2> equiposJugados, int numCamiseta,Equipo2 equipoActual, double goles, int cantAsistencias) {
        super(nombre, edad, direccion, apellido, telefono, nacimiento, posicion, provincia, equiposJugados, numCamiseta,equipoActual);
        this.goles = goles;
        this.cantAsistencias = cantAsistencias;
    }

    public double getGoles() {
        return goles;
    }

    public void setGoles(double goles) {
        this.goles = goles;
    }

    public int getCantAsistencias() {
        return cantAsistencias;
    }

    public void setCantAsistencias(int cantAsistencias) {
        this.cantAsistencias = cantAsistencias;
    }
    public void verificarEquipo(Equipo2 equipo)throws YajugoEquipo{
        if (getEquiposJugados().contains(equipo)){
            throw new YajugoEquipo("ya jugo en este equipo, no se puede contratar");
        }
    }

    public void verificarGoles() throws GolesConvertidos{
        if(goles<30){
            throw new GolesConvertidos("no supera la cantidad de goles convertidos, no se puede cotratar");
        }
    }

    public void verificarAsistencias() throws AsistenciasSuficientes{
        if(cantAsistencias<10){
            throw new AsistenciasSuficientes("no supera la cantidad de asistencias no se puede cotratar");
        }
    }
    public void verificarEquipoActual(Equipo2 equipo)throws NoEsEquipoActual{
        if (!getEquipoactual().equals(equipo)){
            throw new NoEsEquipoActual("no esta jugando en este quipo, no se puede renovar contrato");
        }
    }

    public void verificarEdad()throws NoTieneLaEdad{
        if (getEdad()>35){
            throw new NoTieneLaEdad("es mayor de 35 años, no se puede renovar contrato");
        }
    }


    @Override
    public void contratar(Equipo2 equipo) {
        try{
            verificarEquipo(equipo);
            verificarGoles();
            verificarAsistencias();
            System.out.println("El jugador: "+ getNombre() +" de la provincia: "+getProvincia()+ " que juega en la posicion: "+ getPosicion() +" se contrato en: "+ equipo.getNombre());
        } catch (YajugoEquipo e) {
            e.getMessage();
        } catch (GolesConvertidos e) {
            e.getMessage();
        } catch (AsistenciasSuficientes e) {
            e.getMessage();
        }
    }

    public void renovar(Equipo2 equipo) {
        try {
            verificarEquipoActual(equipo);
            verificarEdad();
            System.out.println("El jugador: " + getNombre() + " de la provincia: " + getProvincia() + " que juega en la posicion: " + getPosicion() + " se renovo en: " + equipo.getNombre());
        } catch (NoEsEquipoActual e) {
            e.getMessage();
        } catch (NoTieneLaEdad e) {
            e.getMessage();
        }
    }
}