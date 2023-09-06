package ABMmascotas;

public class Gato extends Mascota {

    private int alegria;

    public Gato( int alegria) {

        this.alegria = alegria;
    }



    @Override
    public void alimentar() {
        alegria ++;

    }
    @Override
    public void saludar(boolean esDuenio) {

        for (int i = alegria; i <= alegria ; i++){
            if (esDuenio) {
                System.out.println("miau");
            } else {
                System.out.println("MIAU!");
            }
        }

    }


    @Override
    public TipoMascota devolverTipo() {
        return TipoMascota.GATO;
    }

}
