package ABMmascotas;

import ABMmascotas.Mascota;

public class Perro extends Mascota {
        private int alegriaPerro;

    public Perro(int alegriaPerro) {
        super();
        this.alegriaPerro = alegriaPerro;
    }

    public int getAlegriaPerro() {
        return alegriaPerro;
    }

    public void setAlegriaPerro(int alegriaPerro) {
        this.alegriaPerro = alegriaPerro;
    }

    @Override
    void saludar(boolean esDuenio) {


       if(alegriaPerro >= 1){
           alegriaPerro =-1;
            for (int i = 0; i == alegriaPerro; i++) {
                if(esDuenio){ System.out.println("guau");
                }else {
                    System.out.println("¡GUAU!");
                }

            }
       }
    }

    @Override
    void alimentar() {
        alegriaPerro +=1;

    }
}
