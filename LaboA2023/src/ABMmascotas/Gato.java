package ABMmascotas;

public class Gato extends Mascota {

    public Gato() {
        super();
    }

    @Override
    void saludar(boolean esDuenio) {
        if(esDuenio) {
            System.out.println("miau");
        }else{
            System.out.println("¡MIAU!");
        }
    }
}
