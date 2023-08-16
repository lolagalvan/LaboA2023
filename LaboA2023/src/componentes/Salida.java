package componentes;

import componentes.Periferico;

public abstract class Salida extends Periferico {
    public Salida(String nombreFabricante, String modelo, int precio, int stock, String puertosValidos) {
        super(nombreFabricante, modelo, precio, stock, puertosValidos);
    }
}
