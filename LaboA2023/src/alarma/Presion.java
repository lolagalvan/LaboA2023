package alarma;

public class Presion extends Elemento {


    public Presion(boolean estado, int medida, int umbral, int anio) {
        super(estado, medida, umbral, anio);
    }

    @Override
    public void alarma() {
        System.out.println("¡Sensor de presión activado");
    }

}