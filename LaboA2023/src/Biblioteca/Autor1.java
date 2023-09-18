package Biblioteca;

import Personas.Persona;
import Tiempo.Fecha;

public class Autor1 extends Persona {
    private String bibliografia;
    public Autor1(String nombre, int edad, String direccion, String apellido, int telefono, Fecha nacimiento,String bibliografia) {
        super(nombre, edad, direccion, apellido, telefono, nacimiento);
        this.bibliografia=bibliografia;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }
}
