package Biblioteca;

import Personas.Persona;
import Tiempo.Fecha;

import java.util.HashSet;

public class Usuarios1 extends Persona {
    private HashSet<LibrosElectronicos>liborosPrestados;
private Membresia tipoMembresia;

    public Usuarios1(String nombre, int edad, String direccion, String apellido, int telefono, Fecha nacimiento, HashSet<LibrosElectronicos> liborosPrestados, Membresia tipoMembresia) {
        super(nombre, edad, direccion, apellido, telefono, nacimiento);
        this.liborosPrestados = liborosPrestados;
        this.tipoMembresia = tipoMembresia;
    }

    public HashSet<LibrosElectronicos> getLiborosPrestados() {
        return liborosPrestados;
    }

    public void setLiborosPrestados(HashSet<LibrosElectronicos> liborosPrestados) {
        this.liborosPrestados = liborosPrestados;
    }

    public Membresia getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(Membresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }
}
