package ABMmascotas;

import ABMmascotas.Mascota;

public class Pajarito extends Mascota {
    private boolean cantor;
    private String tipo;
    private int alegria;

    public Pajarito(boolean cantor, String tipo,int alegria) {
        super();
        this.cantor = cantor;
        this.tipo = tipo;
        this.alegria = alegria;
    }

    public boolean isCantor() {
        return cantor;
    }

    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public String canto(String tipoCanto){
        if(cantor == true){
            tipo = tipoCanto;

        }
        return tipo;
    }

    @Override
    void saludar(boolean esDuenio) {
        if(esDuenio == true) {

            if (cantor == false) {
                System.out.println("pio");
            }else{
                System.out.println("canto diferente");
            }


        }
    }

    @Override
    void alimentar() {

    }
}
