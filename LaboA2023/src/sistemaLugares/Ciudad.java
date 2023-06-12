package sistemaLugares;

import lugares.Coordenadas;

import java.util.HashSet;

public class Ciudad extends Lugares {

    private HashSet<Barrio>barrios;


    public Ciudad(String nombre, int codigo, HashSet<Coordenadas> listaCoordenadas,  HashSet<Barrio>barrios) {
        super(nombre, codigo, listaCoordenadas);
        this.barrios=barrios;
    }

    public HashSet<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }

    public int consultarPoblacion() {
        int poblacion=0;
        for(Barrio barrio:barrios){
            poblacion= poblacion + barrio.consultarPoblacion();
        }
        return poblacion;
    }
}
