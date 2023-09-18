package Bebidas;

import java.util.HashSet;

public class sistemaBebidas {
    HashSet<Lola>bebedores;
    HashSet<Bebida> bebidas;

    public sistemaBebidas(HashSet<Lola> bebedores, HashSet<Bebida> bebidas) {
        this.bebedores = bebedores;
        this.bebidas = bebidas;
    }

    public HashSet<Lola> getBebedores() {
        return bebedores;
    }

    public void setBebedores(HashSet<Lola> bebedores) {
        this.bebedores = bebedores;
    }

    public HashSet<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(HashSet<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public void mejorHidrtacion(){
        int mejor = 0;
        String nombre = " ";
        for (Lola bebedor: bebedores) {
            if ( mejor < bebedor.coeficienteHidratacion()){
                mejor = bebedor.coeficienteHidratacion();
                nombre = bebedor.getNombre();
            }
        }
        System.out.println("la persona con mejor hidtracion es:"+ " "+ nombre);
    }

    public void peorHidracion(){
        int peor = 0;
        String nombre = " ";
        for (Lola bebedor: bebedores){

        }
    }
}


