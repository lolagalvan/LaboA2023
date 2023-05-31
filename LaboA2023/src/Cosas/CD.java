package Cosas;

import java.util.ArrayList;

public class CD {

       private ArrayList<Cancion> cancion;

       public CD(){
           cancion = new ArrayList<Cancion>();
       }

    public ArrayList<Cancion> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<Cancion> cancion) {
        this.cancion = cancion;
    }

    int numeroCanciones(){
           int i = 0;
        for (Cancion canciones : cancion) {
            i ++;
        }
        return i;
    }
    Cancion verCancion(int posicion) {
        return cancion.get(posicion);
    }

    void grabaCancion(int posicion, Cancion nuevaCancion) {
        cancion.set(posicion, nuevaCancion);
    }

    void agrega(Cancion cancion) {
        this.cancion.add(cancion);
    }

    void elimina(int posicion) {
        cancion.remove(posicion);
    }
}

