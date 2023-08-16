package sistemaLugares;

import lugares.Coordenadas;

import java.util.HashSet;

public class Barrio extends Lugares {

    private int poblacion;
    public Barrio(String nombre, int codigo, HashSet<Coordenadas> listaCoordenadas,int poblacion) {
        super(nombre, codigo, listaCoordenadas);
        this.poblacion=poblacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public int consultarPoblacion() {
        return 0;
    }
}
