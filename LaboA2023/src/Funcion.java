import java.time.LocalDateTime;
import java.time.LocalTime;

public class Funcion {
    private Pelicula pelicula;
    private LocalDateTime fechaHora;
    private Sala sala;
    private int cantEspectadores;

    public Funcion(Pelicula pelicula, LocalDateTime fechaHora, Sala sala, int cantEspectadores) {
        this.pelicula = pelicula;
        this.fechaHora = fechaHora;
        this.sala = sala;
        this.cantEspectadores = cantEspectadores;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getCantEspectadores() {
        return cantEspectadores;
    }

    public void setCantEspectadores(int cantEspectadores) {
        this.cantEspectadores = cantEspectadores;
    }
}
