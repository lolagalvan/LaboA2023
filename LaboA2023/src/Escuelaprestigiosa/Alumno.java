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

    public HashSet<Examen> getExamenesRealizados() {
        return examenesRealizados;
    }

    public void setExamenesRealizados(HashSet<Examen> examenesRealizados) {
        this.examenesRealizados = examenesRealizados;
    }

    public boolean aprobado(){
        boolean aprobado = true;
        for (Examen examen:examenesRealizados) {
            if (!examen.cantAprobados()){
                return aprobado = false;
            }
        }
        return aprobado;
    }
}
