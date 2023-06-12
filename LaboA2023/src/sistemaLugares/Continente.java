package sistemaLugares;

import lugares.Coordenadas;

import java.util.HashSet;

public class Continente extends Lugares {

    HashSet<Pais>paises;
    public Continente(String nombre, int codigo, HashSet<Coordenadas> listaCoordenadas,HashSet<Pais>paises) {
        super(nombre, codigo, listaCoordenadas);
        this.paises=paises;
    }
    public Continente() {
    super();
        paises = new HashSet<>();
    }

    public HashSet<Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<Pais> paises) {
        this.paises = paises;
    }

    public int consultarPoblacion() {
        int poblacion=0;
        for(Pais pais:paises){
            poblacion= poblacion + pais.consultarPoblacion();
        }
        return poblacion;
    }
}
