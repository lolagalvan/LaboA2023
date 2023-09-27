package Escuelaprestigiosa;

import java.time.LocalDate;

public class ExamenOral extends Examen implements  Aprobados{
    private NivelSatisfaccion nivel;

    public ExamenOral(LocalDate fecha, NivelSatisfaccion nivel) {
        super(fecha);
        this.nivel=nivel;
    }

    public NivelSatisfaccion getNivel() {
        return nivel;
    }

    public void setNivel(NivelSatisfaccion nivel) {
        this.nivel = nivel;
    }

    @Override
    public int cantAprobados() {
        return 0;
    }
}
