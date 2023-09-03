public class Sala {
    private int numero;
    private static int butacas = 45;

    public Sala(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int getButacas() {
        return butacas;
    }

    public static void setButacas(int butacas) {
        Sala.butacas = butacas;
    }
}
