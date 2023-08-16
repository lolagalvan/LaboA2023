package ABMmascotas;

public class Peces extends Mascota{
    private static int vidasIniciales=10;
    private int vidasActuales;

    public Peces() {
        this.vidasActuales = vidasIniciales;
    }

    public static int getVidasIniciales() {
        return vidasIniciales;
    }

    public static void setVidasIniciales(int vidasIniciales) {
        Peces.vidasIniciales = vidasIniciales;
    }

    public int getVidasActuales() {
        return vidasActuales;
    }

    public void setVidasActuales(int vidasActuales) {
        this.vidasActuales = vidasActuales;
    }

    @Override
    void saludar(boolean esDuenio) {
        if(esDuenio){
            vidasActuales--;
        }else{
            vidasActuales = 0;
        }
    }

    @Override
    void alimentar() {
        vidasActuales++;
    }


}
