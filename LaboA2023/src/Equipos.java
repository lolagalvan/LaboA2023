import java.util.ArrayList;

public class Equipos {

    private ArrayList<Jugador> jugadores;
    private String disponibilidadH;
    private String nombre;
    private String barrio;


    public Equipos (String nombre, ArrayList<Jugador> jugadores, String disponibilidadH,String barrio){
        this.nombre=nombre;
        this.jugadores=jugadores;
        this.disponibilidadH= disponibilidadH;
        this.barrio=barrio;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getDisponibilidadH() {
        return disponibilidadH;
    }

    public void setDisponibilidadH(String disponibilidadH) {
        this.disponibilidadH = disponibilidadH;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }



}
