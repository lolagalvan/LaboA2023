package ABMmascotas;

import ABMmascotas.Mascota;

public class Perro extends Mascota {

    public Perro() {
        super();
    }

    @Override
    void saludar(boolean esDuenio) {
       if(esDuenio){ System.out.println("guau");
       }else {
           System.out.println("¡GUAU!");
       }

    }
}
