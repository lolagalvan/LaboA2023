package Cosas;

import Cosas.Llamada;
import Personas.Empleado;

import java.util.ArrayList;

public class Sistema {
private ArrayList<Llamada>llamadas;
private ArrayList <Empleado>empleados;

    public Sistema(ArrayList<Llamada>llamadas) {
        this.llamadas=llamadas;
    }

    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public  void realizarLlamada(Llamada llamada){
        llamadas.add(llamada);
    }

    public void llamadasEmpleados(){
        for (Empleado empleado:empleados) {
            for (Llamada llamada:llamadas) {
                if(  llamada.getEmpleadoOrigen().equals(empleado)){
                    System.out.println(llamada);
                }
            }
        }
    }

    public void rankingEmpleados (){
        int duracionLlamada = 0 ;
        int Top1= 0;
        int Top2= 0;
        int Top3= 0;
        for (Empleado empleado: empleados) {

        }

    }
}


