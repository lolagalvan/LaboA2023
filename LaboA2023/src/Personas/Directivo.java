package Personas;

import Personas.Empleado;

public class Directivo extends Empleado {
    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Directivo"+ ' ' + getNombre() + "->" +
                getClass().getCanonicalName();
    }
}
