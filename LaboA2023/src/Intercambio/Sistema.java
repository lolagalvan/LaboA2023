package Intercambio;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Prestable>prestados;


    public Sistema(HashSet<Prestable> prestados) {
        this.prestados = prestados;
    }

    public HashSet<Prestable> getPrestados() {
        return prestados;
    }

    public void setPrestados(HashSet<Prestable> prestados) {
        this.prestados = prestados;
    }

    public void agregarElemento(Prestable elemento){
        if(elemento.agregarElemento() == true){
            prestados.add(elemento);
        }
    }
}
