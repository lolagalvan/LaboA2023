package Escuelaprestigiosa;

import java.time.LocalDate;

public class ExamenEscrito extends  Examen {

    private int calificacion;

    private static int minutos = 90;

    public ExamenEscrito(LocalDate fecha,int calificacion){
        super(fecha);
    this.calificacion=calificacion;
}
    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    @Override
    public boolean cantAprobados() {
    return calificacion >=6;
    }
}
