import java.time.LocalDateTime;

public class Funcion {
    private Pelicula pelicula;
    private LocalDateTime fechaYHora;
    private Sala sala;
    private int cantCompras ;

    public Funcion(Pelicula pelicula, LocalDateTime fechaYHora, Sala sala, int cantCompras) {
        this.pelicula = pelicula;
        this.fechaYHora = fechaYHora;
        this.sala = sala;
        this.cantCompras = cantCompras;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getCantCompras() {
        return cantCompras;
    }

    public void setCantCompras(int cantCompras) {
        this.cantCompras = cantCompras;
    }
}
