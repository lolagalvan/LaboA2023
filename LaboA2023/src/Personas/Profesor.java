package Personas;

import Personas.Persona;

public class Profesor extends Persona {

    private String apellido;
    private int descuento;




    public Profesor(String nombre, String apellido) {
        super(nombre);
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
