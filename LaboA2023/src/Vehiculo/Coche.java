package Vehiculo;

import Vehiculo.Vehiculos;

public class Coche extends Vehiculos {
    private int velocidad;
    private String patente;
    private boolean descapotable;


    public Coche(String marca, String modelo, String color, int ruedas, int año,
                 int velocidad,String patente,boolean descapotable) {
       super(marca, modelo, color, ruedas, año);
       this.velocidad=velocidad;
        this.patente=patente;
        this.descapotable = descapotable;

    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public void acelerar(){
        setVelocidad(this.velocidad + 1);

    }
    public void frenar(){
        setVelocidad(this.velocidad - 1);

    }
    public int getVelocidad() {
        return velocidad;
    }

    public void esDescapotable(){
        int Cantdescapotables = 0;
        int CantNodescapotables = 0;

        if (descapotable){
            Cantdescapotables ++;
            System.out.println("es descapotable");
        }
        else {
            System.out.println("no es descapotable");
        }
    }
}



