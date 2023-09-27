package Escuelaprestigiosa;

import java.time.LocalDate;

public class ExamenEscrito extends  Examen implements Aprobados{

    private int calificacion;

    private int minutos;

    public ExamenEscrito(LocalDate fecha,int calificacion, int minutos){
        super(fecha);
    this.calificacion=calificacion;
    this.minutos=minutos;
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
    public int cantAprobados() {
        return 0;
    }
}
