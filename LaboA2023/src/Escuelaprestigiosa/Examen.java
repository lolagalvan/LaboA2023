package Escuelaprestigiosa;

import java.time.LocalDate;

public abstract class Examen implements Aprobados {
    private LocalDate fecha;

    public Examen(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
