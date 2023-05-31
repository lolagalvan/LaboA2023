package alarma;

import java.util.ArrayList;

public class Complejo {

    private ArrayList<Elemento> sensores;
    private int valormedio;
    private int valorumbral;

    public Complejo(ArrayList<Elemento> sensores, int valormedio, int valorumbral) {
        this.sensores=sensores;
        this.valormedio=valormedio;
        this.valorumbral=valorumbral;
    }

    public int valorMedio(){
        for (Elemento sensor:sensores) {
            valormedio= valormedio + sensor.getMedida();
        }
        valormedio = valormedio/ sensores.size();
        return valormedio;
    }

    public void verificarAlarmas(){
        if (valormedio>valorumbral){
            for (Elemento sensor:sensores) {
                sensor.alarma();
            }
        }
    }
}