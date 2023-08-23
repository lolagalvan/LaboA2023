package ABMmascotas;

import ABMmascotas.Mascota;

public class Pajarito extends Mascota {
    private boolean cantor;
    private String tipoPajarito;
    private int alegriaPajarito;

    public Pajarito(boolean cantor, String tipoPajarito,int alegriaPajarito) {
        super();
        this.cantor = cantor;
        this.tipoPajarito = tipoPajarito;
        this.alegriaPajarito = alegriaPajarito;
    }

    public boolean isCantor() {
        return cantor;
    }

    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }

    public String getTipoPajarito() {
        return tipoPajarito;
    }

    public void setTipoPajarito(String tipoPajarito) {
        this.tipoPajarito = tipoPajarito;
    }

    public int getAlegriaPajarito() {
        return alegriaPajarito;
    }

    public void setAlegriaPajarito(int alegriaPajarito) {
        this.alegriaPajarito = alegriaPajarito;
    }

    public String canto(String tipoCanto){
        if(cantor == true){
            tipoPajarito = tipoCanto;

        }
        return tipoPajarito;
    }

    @Override
    void saludar(boolean esDuenio) {
        if(alegriaPajarito >= 1) {
            alegriaPajarito = -1;
            for (int i = 0; i == alegriaPajarito; i++) {
                if (esDuenio == true) {

                    if (cantor == false) {
                        System.out.println("pio");
                    } else {
                        System.out.println("canto diferente");
                    }


                }
            }
        }
    }

    @Override
    void alimentar() {
        alegriaPajarito +=1;


    }


}
