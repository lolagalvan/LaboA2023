public class Periferico extends Componentes  {
    private  String puertosValidos;

    public Periferico(String nombreFabricante, String modelo, int precio, int stock, String puertosValidos) {
        super(nombreFabricante, modelo, precio, stock);
        this.puertosValidos = this.puertosValidos;
    }

    public String getPuertosValidos() {
        return puertosValidos;
    }

    public void setPuertosValidos(String puertosValidos) {
        this.puertosValidos = puertosValidos;
    }
}
