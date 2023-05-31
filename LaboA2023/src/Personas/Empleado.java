package Personas;

import Tiempo.DiasHabiles;
import Tiempo.Fecha;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Empleado extends Persona {

    private HashSet<DiasHabiles>diasHabiles;
    private HashSet<LocalDateTime> registro;

    public Empleado(String nombre, int edad, String direccion, String apellido, int telefono,
                    Fecha nacimiento, HashSet<DiasHabiles>diasHabiles, HashSet<LocalDateTime>registro ) {
        super(nombre, edad, direccion,apellido,telefono,nacimiento);
        this.diasHabiles=diasHabiles;
        this.registro=registro;
    }

    public HashSet<DiasHabiles> getDiasHabiles() {
        return diasHabiles;
    }

    public void setDiasHabiles(HashSet<DiasHabiles> diasHabiles) {
        this.diasHabiles = diasHabiles;
    }

    public HashSet<LocalDateTime> getRegistro() {
        return registro;
    }

    public void setRegistro(HashSet<LocalDateTime> registro) {
        this.registro = registro;
    }

     public double asistencia(int mes){
        int diasQueFue = 0;
        double asistencia = 0;
         for (LocalDateTime dias:registro) {
             if (dias.getMonthValue()==mes){
                 diasQueFue ++;
             }
         }
         asistencia=(diasQueFue*100)/(diasHabiles.size()*4);
         return asistencia;
     }


}
