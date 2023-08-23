package ABMmascotas;

import ABMmascotas.Mascota;

import java.util.HashSet;

public class MenuMascotas {
    private HashSet<Mascota> mascotas;


    public MenuMascotas(HashSet<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public MenuMascotas() {
    }

    public HashSet<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(HashSet<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void altaMascotas(Mascota mascota){
        mascotas.add(mascota);

    }

    public void bajaMascotas(Mascota mascota){
        mascotas.remove(mascota);

    }
    public void modificarMascotas(Mascota mascotaVieja, Mascota mascotaNueva){
        mascotas. add(mascotaNueva);
        mascotas.remove(mascotaVieja);

    }

    public void saludar(boolean Duenio){
        for (Mascota m: mascotas){
            m.saludar(Duenio);

        }

    }
    public void verificarVidas(){
        for (Mascota m: mascotas) {
            if(m instanceof Peces){
                if(((Peces) m).getVidasActuales()==0){
                    mascotas.remove(m);
                }
            }

        }
    }



}
