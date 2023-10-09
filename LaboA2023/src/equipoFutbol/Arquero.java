package equipoFutbol;

import PASO.Provincia;
import Tiempo.Fecha;

import java.util.HashSet;

public class Arquero extends Jugador {
    private double atajadas;
    private int golesRecibidos;

    public Arquero(String nombre, int edad, String direccion, String apellido, int telefono, Fecha nacimiento, Posicion posicion, Provincia provincia, HashSet<Equipo2> equiposJugados, int numCamiseta, Equipo2 equipoActual ,double atajadas, int golesRecibidos) {
        super(nombre, edad, direccion, apellido, telefono, nacimiento, posicion, provincia, equiposJugados, numCamiseta,equipoActual);
        this.atajadas = atajadas;
        this.golesRecibidos = golesRecibidos;
    }

    public double getAtajadas() {
        return atajadas;
    }

    public void setAtajadas(double atajadas) {
        this.atajadas = atajadas;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public void verificarEquipo(Equipo2 equipo)throws YajugoEquipo{
        if (getEquiposJugados().contains(equipo)){
       throw new YajugoEquipo("ya jugo en este equipo, no se puede contratar");
        }
    }
    public void verificarAtajadas() throws AtajadasInsuficientes{
        if (!(atajadas >=60)){
            throw new AtajadasInsuficientes("atajadas insuficientes, no se puede contratar");
        }
    }

    public void verificarGoles() throws CantGolesSuperados{
        if((golesRecibidos>10)){
            throw new CantGolesSuperados("recibio mas goles de los esperados, no se puede contratar");
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
    public void contratar(Equipo2 equipo)  {
        try {
            verificarEquipo(equipo);
            verificarAtajadas();
            verificarGoles();
            System.out.println("El jugador: "+ getNombre() +" de la provincia: "+getProvincia()+ " que juega en la posicion: "+ getPosicion() +" se contrato en: "+ equipo.getNombre());
        } catch (YajugoEquipo e) {
            e.getMessage();
        } catch (CantGolesSuperados e) {
            e.getMessage();
        } catch (AtajadasInsuficientes e) {
            e.getMessage();
        }


    }

    @Override
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
