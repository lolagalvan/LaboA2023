package Intercambio;

import java.time.LocalDate;
import java.util.HashSet;

public class MainIntercambio {
    public static void main(String[] args) {
        HashSet<Prestable>prestables = new HashSet<>();

        Remera r1 = new Remera("violeta",Material.ALGODON,"nike","bien", 70.5F,68.5F,67.9F);
        Remera r2 = new Remera("blanca",Material.SEDA,"gucci","manchado", 79.5F,78.5F,77.9F);

        Pantalon p1 = new Pantalon("azul",Material.POLIESTER,"marca de pants","bien", 79.5F,68.5F,90.9F);
        Pantalon p2 = new Pantalon("negro",Material.ALGODON,"marca2","roto", 69.5F,58.5F,89.9F);

        Revista rv1 = new Revista(234,"gente",2022,LocalDate.of(2022,05,06));
        Revista rv2 = new Revista(134,"caras",2021,LocalDate.of(2021,02,21));

        Libro l1 = new Libro(789,"Harry Potter",2020,200,5);
        Libro l2 = new Libro(101,"Las ventajas de ser invisible",2018,120,6);


        prestables.add(r1);
        prestables.add(p1);
        prestables.add(p2);
        prestables.add(rv1);
        prestables.add(rv2);
        prestables.add(l1);


        Sistema s1 = new Sistema(prestables);
        s1.agregarElemento(l2);
        s1.agregarElemento(r2);

    }
}
