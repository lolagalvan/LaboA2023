import Personas.Persona;
import Tiempo.Fecha;

public class Votante extends Persona {
    private boolean voto;
    private static String nacionalidad = "Argentino";

    public Votante(String nombre, int edad, String direccion, String apellido, int telefono, Fecha nacimiento, boolean voto) {
        super(nombre, edad, direccion, apellido, telefono, nacimiento);
        this.voto = voto;
    }

    public boolean isVoto() {
        return voto;
    }

    public void setVoto(boolean voto) {
        this.voto = voto;
    }

    public static String getNacionalidad() {
        return nacionalidad;
    }

    public static void setNacionalidad(String nacionalidad) {
        Votante.nacionalidad = nacionalidad;
    }
}
