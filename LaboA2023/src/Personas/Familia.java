package Personas;

import java.util.HashSet;

public class Familia {
    private HashSet<Familiar>familiares;

    public Familia(HashSet<Familiar> familiares) {
        this.familiares = familiares;
    }

    public HashSet<Familiar> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(HashSet<Familiar> familiares) {
        this.familiares = familiares;
    }

    public int promedioCalorias (){
   int cantTotal = 0;
        for (Familiar integrante:familiares) {
            cantTotal= cantTotal + integrante.caloriastotales();

        }
        return cantTotal/ familiares.size();
    }
    public int masCalorias (){
        int mayor = 0;

        for (Familiar integrante:familiares) {
            if (integrante.caloriastotales()>mayor){
                mayor = integrante.caloriastotales();

            }
        }
        return mayor;
    }

    public int menosCalorias (){
        int menos = 0;

        for (Familiar integrante:familiares) {
            if (integrante.caloriastotales()<menos){
                menos = integrante.caloriastotales();

            }
        }
        return menos;
    }
}
