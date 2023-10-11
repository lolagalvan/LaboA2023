package restauranteInterfaz;

import Tiempo.Fecha;

import java.util.HashSet;

public class MainRestaurante {
    public static void main(String[] args) {
        Chef c1 = new Chef("Lola",17,"barzana","galvan",123456,new Fecha(),true,new Restaurante(new HashSet<>(),new HashSet<>(),"la farola"));
        Chef c2 = new Chef("Anna",20,"ceretti","mlikota",89906090,new Fecha(),false,new Restaurante(new HashSet<>(),new HashSet<>(),"kiddo"));
        Chef c3 = new Chef("Chiara",21,"cere","mili",89906787,new Fecha(),true,new Restaurante(new HashSet<>(),new HashSet<>(),"the embesrs"));
        Chef c4 = new Chef("Bianca",24,"ce","mli",899999,new Fecha(),true,new Restaurante(new HashSet<>(),new HashSet<>(),"urbano"));
        Chef c5 = new Chef("Julieta",23,"algun lugar","montenegro",889999,new Fecha(),true,new Restaurante(new HashSet<>(),new HashSet<>(),"taylors version"));

        Plato p1 = new Plato("fideos","fideos con salsa",3000,TipoPlato.PLATO_PRINCIPAL,c4);
        Plato p2 = new Plato("carne","carne asada",5000,TipoPlato.PLATO_PRINCIPAL,c3);
        Plato p3 = new Plato("milanesa","milanesa con pure",3000,TipoPlato.PLATO_PRINCIPAL,c1);
        Plato p4 = new Plato("helado","helado de chocolate con dulce de leche",3000,TipoPlato.POSTRE,c5);
        Plato p5 = new Plato("provoleta","provoleta con verdeo",1500,TipoPlato.ENTRADA,c2);

        HashSet<Chef>ch1 = new HashSet<>();
        ch1.add(c3);
        ch1.add(c4);
        HashSet<Plato>menu = new HashSet<>();
        menu.add(p1);
        menu.add(p2);

        Restaurante r1 = new Restaurante(menu,ch1,"The eras");

        r1.agregarChef(c1);//error edad
        r1.agregarChef(c2);//error experiencia
        r1.agregarChef(c5);

        r1.agregarPlato(p3);//error no exite el chef
        r1.agregarPlato(p4);
        r1.agregarPlato(p1);//erro ya existe en el menu
    }
}
