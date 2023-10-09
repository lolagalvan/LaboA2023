package restauranteInterfaz;

import Personas.Persona;
import Tiempo.Fecha;

public class Chef extends Persona {
    private boolean experiencia;

    public Chef(String nombre, int edad, String direccion, String apellido, int telefono, Fecha nacimiento, boolean experiencia) {
        super(nombre, edad, direccion, apellido, telefono, nacimiento);
        this.experiencia = experiencia;
    }

    public boolean isExperiencia() {
        return experiencia;
    }

    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    public void verificarEdad()throws EdadNoCorrespondiente{
        if (getEdad()<18){
            throw new EdadNoCorrespondiente("es menor de 18" );
        }
    }
    public void verificarExperiencia()throws ExperienciaInsuficiente{
        if (experiencia==false){
            throw new ExperienciaInsuficiente("no tiene experiencia" );
        }
    }



}
