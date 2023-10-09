package restauranteInterfaz;

import Tiempo.Fecha;

public class MainRestaurante {
    public static void main(String[] args) {
        Chef c1 = new Chef("lola",17,"barzana","galvan",123456,new Fecha(),true);
        Chef c2 = new Chef("anna",20,"ceretti","mlikota",8990675,new Fecha(),false);
    }
}
