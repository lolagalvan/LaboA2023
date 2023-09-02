package ABMMascotas;

import ABMMascotas.Duenio;
import ABMMascotas.Mascota;

public class Perro extends Mascota {

    private int alegria;

    public Perro(String nombreMascota, Duenio duenio, int alegria) {
        super(nombreMascota, duenio);
        alegria = this.alegria;
    }



    @Override
    public void alimentar() {
        alegria ++;

    }
    @Override
    public void saludar(boolean esDuenio) {
        for (int i = alegria; i <= alegria ; i++) {
            if (esDuenio) {
                System.out.println("guau");

            } else {
                System.out.println("GUAU!");
            }
        }
    }

    @Override
    public TipoMascota devolverTipo() {
        return TipoMascota.PERRO;
    }


}
