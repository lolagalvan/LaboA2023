import java.util.ArrayList;

public class Complejo {

    private ArrayList<Elementos> sensores;
    private int valormedio;
    private int valorumbral;

    public Complejo(ArrayList<Elementos> sensores,int valormedio,int valorumbral) {
        this.sensores=sensores;
        this.valormedio=valormedio;
        this.valorumbral=valorumbral;
    }

    public int valorMedio(){
        for (Elementos sensor:sensores) {
            valormedio= valormedio + sensor.getMedida();
        }
        valormedio = valormedio/ sensores.size();
        return valormedio;
    }

    public void verificarAlarmas(){
        if (valormedio>valorumbral){
            for (Elementos sensor:sensores) {
                sensor.alarma();
            }
        }
    }
}
