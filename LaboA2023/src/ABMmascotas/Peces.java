package ABMmascotas;

public class Peces extends Mascota {
    private int vidas;
    private static int vidasInicales = 10;

    public Peces() {
        this.vidas = vidasInicales;
    }


    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public static int getVidasInicales() {
        return vidasInicales;
    }

    public static void setVidasInicales(int vidasInicales) {
        Peces.vidasInicales = vidasInicales;
    }
    @Override
    public void saludar(boolean esDuenio) {
        if (esDuenio) {
            vidas--;

        } else {
            vidas = 0;

        }
    }

    @Override
    public void alimentar() {
        vidas++;
    }

    @Override
    public TipoMascota devolverTipo() {
        return TipoMascota.PEZ;
    }


}
