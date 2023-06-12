package sistemaLugares;

import lugares.Coordenadas;

import java.util.HashSet;

public class Pais extends Lugares {

    private HashSet<Provincia>provincias;
    public Pais(String nombre, int codigo, HashSet<Coordenadas> listaCoordenadas,HashSet<Provincia>provincias) {
        super(nombre, codigo, listaCoordenadas);
        this.provincias=provincias;
    }

    public Pais(){
        super();
        provincias=new HashSet<>();
    }

    public HashSet<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashSet<Provincia> provincias) {
        this.provincias = provincias;
    }

    public int consultarPoblacion() {
        int poblacion=0;
        for(Provincia provincia:provincias){
            poblacion= poblacion + provincia.consultarPoblacion();
        }
        return poblacion;
    }
}
