package Escuelaprestigiosa;

import Personas.Persona;
import Tiempo.Fecha;

import java.util.HashSet;

public class Alumno extends Persona {
    private HashSet<Examen>examenesRealizados;


    public Alumno(String nombre, int edad, String direccion, String apellido, int telefono, Fecha nacimiento, HashSet<Examen> examenesRealizados) {
        super(nombre, edad, direccion, apellido, telefono, nacimiento);
        this.examenesRealizados = examenesRealizados;
    }
}
