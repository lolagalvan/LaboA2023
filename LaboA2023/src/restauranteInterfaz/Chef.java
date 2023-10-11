package restauranteInterfaz;

import Personas.Persona;
import Tiempo.Fecha;

public class Chef extends Persona {
    private boolean experiencia;
    private Restaurante restauranteActual;

    public Chef(String nombre, int edad, String direccion, String apellido, int telefono, Fecha nacimiento, boolean experiencia, Restaurante restauranteActual) {
        super(nombre, edad, direccion, apellido, telefono, nacimiento);
        this.experiencia = experiencia;
        this.restauranteActual=restauranteActual;
    }

    public boolean isExperiencia() {
        return experiencia;
    }

    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    public Restaurante getRestauranteActual() {
        return restauranteActual;
    }

    public void setRestauranteActual(Restaurante restauranteActual) {
        this.restauranteActual = restauranteActual;
    }

    public void verificarEdad()throws EdadNoCorrespondiente{
        if (getEdad()<18){
            throw new EdadNoCorrespondiente("El chef: "+getNombre()+","+" es menor de 18" );
        }
    }
    public void verificarExperiencia()throws ExperienciaInsuficiente{
        if (experiencia==false){
            throw new ExperienciaInsuficiente("El chef: "+getNombre()+","+" no tiene experiencia" );
        }
    }



}
