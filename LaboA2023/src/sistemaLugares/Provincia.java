package sistemaLugares;

import lugares.Coordenadas;

import java.util.HashSet;

public class Provincia extends Lugares {

    private HashSet<Ciudad>ciudades;
    public Provincia(String nombre, int codigo, HashSet<Coordenadas> listaCoordenadas,HashSet<Ciudad>ciudades) {
        super(nombre, codigo, listaCoordenadas);
        this.ciudades=ciudades;
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public int consultarPoblacion() {
        int poblacion=0;
        for(Ciudad ciudad:ciudades){
            poblacion= poblacion + ciudad.consultarPoblacion();
        }
        return poblacion;
    }
}
