package Personas;

import Personas.Persona;
import Tiempo.Fecha;
import buffet.Plato;

import java.util.ArrayList;

public class Familiar extends Persona {

    private ArrayList<Plato>platos;


    public Familiar(String nombre, int edad, String direccion, String apellido, int telefono, Fecha nacimiento,ArrayList<Plato>platos) {
        super(nombre, edad, direccion, apellido, telefono, nacimiento);
        this.platos = platos;
    }

    public Familiar(){
        super("anna", 17, "ceretti 2685", "Mlikota", 115930898,new Fecha());
        platos= new ArrayList<>();

    }
    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public int caloriastotales (){
        int cantTotal = 0;
        for (Plato calorias:platos) {
            cantTotal += calorias.getCantCalorias();
        }
        return cantTotal;
    }
}
