package PASO;

import Personas.Persona;

public class Votantes extends Persona {
    private boolean voto;
    private static String nacionalidad = "Argentina";
    private Provincia provincia;




    public Votantes(boolean voto, Provincia provincia) {
        this.voto = voto;
        this.provincia = provincia;
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
        Votantes.nacionalidad = nacionalidad;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

}
