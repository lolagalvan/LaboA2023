package ABMMascotas;

import ABMMascotas.Duenio;
import ABMMascotas.Mascota;
import ABMMascotas.Peces;

import java.util.HashSet;

public class SistemaMascotas {
    private HashSet<Mascota> mascotas;


    public SistemaMascotas(HashSet<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public HashSet<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(HashSet<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void agregarMascota(Mascota agregada){
        mascotas.add(agregada);
    }

    public void modificarMascota(Mascota vieja, Mascota nueva){
        mascotas.remove(vieja);
        mascotas.add(nueva);
    }


    public void eliminarMascotas(Mascota eliminada){
        mascotas.remove(eliminada);
    }

    public void saludo(String nombreMascota, Duenio duenio ){
        for (Mascota m:mascotas) {
            if (nombreMascota == m.getNombreMascota() ){
               if( duenio.getNombre()== m.getDuenio().getNombre()){
                m.saludar(true);}
               else {  m.saludar(false);}
            }


            if(m instanceof Peces && ((Peces) m).getVidas()==0){
                mascotas.remove(m);
            }
        }
    }



}
