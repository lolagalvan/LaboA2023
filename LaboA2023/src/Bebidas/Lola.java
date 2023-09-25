package Bebidas;

import Personas.Persona;
import Tiempo.Fecha;

import java.util.HashMap;
import java.util.Map;

public class  Lola extends Persona {
HashMap<Bebida,Integer>consumo;
private int dni;

    public Lola(String nombre, int edad, String direccion, String apellido, int telefono, Fecha nacimiento, HashMap<Bebida, Integer> consumo,int dni) {
        super(nombre, edad, direccion, apellido, telefono, nacimiento);
        this.consumo = consumo;
        this.dni = dni;
    }



    public HashMap<Bebida, Integer> getConsumo() {
        return consumo;
    }

    public void setConsumo(HashMap<Bebida, Integer> consumo) {
        this.consumo = consumo;
    }

    public Lola(String nombre) {
        super(nombre);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


    public void tomarBebida(Bebida bebida, int cantidad){
        if (consumo.containsKey(bebida)){
            consumo.put(bebida,consumo.get(bebida)+cantidad);
        }
        else {
            consumo.put(bebida,cantidad);
        }
    }

    public int coeficienteHidratacion(){
    int coeficiente = 0;
    for (Map.Entry<Bebida,Integer> bebida: consumo.entrySet()) {
        coeficiente= coeficiente + (bebida.getValue() * (bebida.getKey().getCoefincientePositividad()-bebida.getKey().getCoeficienteNegativo()));
    }
    return coeficiente;
}


}
