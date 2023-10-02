package orgPartidospoliticos;

import Enums.Colores;

public class PalomaMensajera extends Ave implements Mensaje{
    private Boolean conoceMapa;

    public PalomaMensajera(String nombre, String especie, Colores color, Boolean conoceMapa) {
        super(nombre, especie, color);
        this.conoceMapa = conoceMapa;
    }

    public Boolean getConoceMapa() {
        return conoceMapa;
    }

    public void setConoceMapa(Boolean conoceMapa) {
        this.conoceMapa = conoceMapa;
    }


    @Override
    public void mensajeApoyo(Partido partido) {
        if(conoceMapa){
            System.out.println("voten por "+partido.getNombre());
        } else {
            System.out.println("No puede volar");
        }
    }
}

