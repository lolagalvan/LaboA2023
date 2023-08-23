package ABMmascotas;

public class Gato extends Mascota {
    private int alegriaGato;
    public Gato(int alegriaGato) {
        super();
        this.alegriaGato = alegriaGato;

    }

    public int getAlegriaGato() {
        return alegriaGato;
    }

    public void setAlegriaGato(int alegriaGato) {
        this.alegriaGato = alegriaGato;
    }

    @Override
    void saludar(boolean esDuenio) {

        if(alegriaGato >= 1){
            alegriaGato =-1;
            for (int i = 0; i == alegriaGato; i++) {
                if(esDuenio) {
                    System.out.println("miau");
                }else{
                    System.out.println("¡MIAU!");
                }

            }
        }
    }

    @Override
    void alimentar() {
        alegriaGato += 1;

    }
}
