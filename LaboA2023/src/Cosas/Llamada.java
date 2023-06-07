package Cosas;

import Personas.Empleado;
import Tiempo.Tiempo;
import Tiempo.Fecha;

import java.util.ArrayList;
import java.util.HashSet;

public class Llamada {
    private HashSet<Empleado> empleados;

    private String empleadoOrigen;
    private String EmpleadoDestino;
    private Fecha fechaLlamada;
    private Tiempo duracion;


    public Llamada(HashSet<Empleado>empleados,String empleadoOrigen,String empleadoDestino,Fecha fechaLlamada,Tiempo duracion) {
        this.empleados=empleados;
        this.empleadoOrigen=empleadoOrigen;
        this.EmpleadoDestino=empleadoDestino;
        this.fechaLlamada = fechaLlamada;
        this.duracion=duracion;
    }

    public HashSet<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getEmpleadoOrigen() {
        return empleadoOrigen;
    }

    public void setEmpleadoOrigen(String empleadoOrigen) {
        this.empleadoOrigen = empleadoOrigen;
    }

    public String getEmpleadoDestino() {
        return EmpleadoDestino;
    }

    public void setEmpleadoDestino(String empleadoDestino) {
        EmpleadoDestino = empleadoDestino;
    }

    public Fecha getFechaLlamada() {
        return fechaLlamada;
    }

    public void setFechaLlamada(Fecha fechaLlamada) {
        this.fechaLlamada = fechaLlamada;
    }

    public Tiempo getDuracion() {
        return duracion;
    }

    public void setDuracion(Tiempo duracion) {
        this.duracion = duracion;
    }
}
