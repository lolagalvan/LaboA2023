package Bebidas;

import Personas.Persona;

import java.util.HashMap;
import java.util.Map;

public class Lola extends Persona {
HashMap<Bebida,Integer>consumo;

public int coeficienteHidratacion(){
    int coeficiente = 0;
    for (Map.Entry<Bebida,Integer> bebida: consumo.entrySet()) {
        coeficiente= coeficiente + (bebida.getValue() * (bebida.getKey().getCoefincientePositividad()-bebida.getKey().getCoeficienteNegativo()));
    }
    return coeficiente;
}


}
