public class Humo extends Elementos {


    public Humo(boolean estado, int medida, int umbral, int anio) {
        super(estado, medida, umbral, anio);
    }

    @Override
    public void alarma() {
        System.out.println("se llamo a los bomberos");
    }
}
