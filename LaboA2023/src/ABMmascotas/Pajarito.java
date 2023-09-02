package ABMMascotas;

import ABMMascotas.Mascota;

public class Pajarito extends Mascota {
    private boolean cantor;
    private String canto;
    private int alegria;


    public Pajarito(boolean cantor, String canto, int alegria) {
        super();
        this.cantor = cantor;
        this.canto = canto;
        alegria = this.alegria;

    }

    public boolean isCantor() {
        return cantor;
    }

    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }

    public String getCanto() {
        return canto;
    }

    public void setCanto(String canto) {
        this.canto = canto;
    }


    @Override
    public void alimentar() {
        alegria ++;

    }
    @Override
    public void saludar(boolean esDuenio) {
        for (int i = alegria; i <= alegria ; i++) {
            if (esDuenio) {
                if (cantor == false) {
                    System.out.println("pio");
                } else {
                    System.out.println(canto);
                }
            }
        }

    }

    @Override
    public TipoMascota devolverTipo() {
        return TipoMascota.PAJARITO;
    }
}
