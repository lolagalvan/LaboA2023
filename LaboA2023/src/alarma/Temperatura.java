package alarma;

public class Temperatura extends Elemento {


    public Temperatura(boolean estado, int medida, int umbral, int anio) {
        super(estado, medida, umbral, anio);
    }

    @Override
    public void alarma() {
        System.out.println("¡Cuidado! La temperatura sube");
    }

}