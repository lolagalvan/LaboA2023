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
    public Familiar masCalorias (){
        int mayor = 0;
        Familiar gordito = new Familiar();

        for (Familiar integrante:familiares) {
            if (integrante.caloriastotales()>mayor){
                mayor = integrante.caloriastotales();
                gordito = integrante;

            }
        }
        return gordito;
    }

    public Familiar menosCalorias (){
        int menos = 0;
        Familiar flaco = new Familiar();


        for (Familiar integrante:familiares) {
            if (integrante.caloriastotales()<menos||menos ==0){
                menos = integrante.caloriastotales();
                flaco = integrante;

            }
        }
        return flaco;
    }
}
