package componentes;

import componentes.Periferico;

public abstract class Entrada extends Periferico {
    private String conector;

    public Entrada(String nombreFabricante, String modelo, int precio, int stock,String puertosValidos, String conector) {
        super(nombreFabricante, modelo, precio, stock, puertosValidos);
        this.conector = conector;
    }

    public String getConector() {
        return conector;
    }

    public void setConector(String conector) {
        this.conector = conector;
    }
}
