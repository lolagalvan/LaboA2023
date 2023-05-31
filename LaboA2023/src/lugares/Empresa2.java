package lugares;

import Personas.Empleado;

import java.util.HashSet;

public class Empresa2 {
    private HashSet<Empleado>empleados;

    public Empresa2(HashSet<Empleado>empleados) {
        this.empleados=empleados;
    }

    public HashSet<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<Empleado> empleados) {
        this.empleados = empleados;
    }

    public int extraerEmpleados(int mes) {
        int asistencia = 0;
        for (Empleado empleado : empleados) {
            if (empleado.asistencia(mes) > 80) {
                asistencia++;
            }
        }
        return asistencia;
    }
}
