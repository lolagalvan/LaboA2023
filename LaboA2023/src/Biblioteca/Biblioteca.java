package Biblioteca;

import Tiempo.Fecha;

import java.util.HashSet;

public class Biblioteca {


    public static void main(String[] args) {
        Autor1 a1 = new Autor1("anna",17,"ceretti","mlikota",11234567,new Fecha(),"tengo muchos libros");
        Autor1 a2 = new Autor1("juli",20,"culllen","montenegro",11234689,new Fecha(),"escribo mucho");

        LibrosElectronicos l1 = new LibrosElectronicos("harry potter","harry.pdf",a1,Genero.AVENTURA);
        LibrosElectronicos l2 = new LibrosElectronicos("star wars","star.pdf",a2,Genero.CIENCIAFICCION);
        LibrosElectronicos l3 = new LibrosElectronicos("juan","juan.pdf",a1,Genero.JUVENIL);

        HashSet<LibrosElectronicos>h1= new HashSet<>();
        h1.add(l1);
        h1.add(l2);
        HashSet<LibrosElectronicos>h2 = new HashSet<>();
        h2.add(l2);
        h2.add(l3);
        h2.add(l1);

        Usuarios1 u1 = new Usuarios1("pepe",23,"pepelandia","lolanga",352472865,new Fecha(),h1,Membresia.BRONCE);
        Usuarios1 u2 = new Usuarios1("lola",23,"lolandia","lols",352472860,new Fecha(),h2,Membresia.BRONCE);

        HashSet<Usuarios1>hu1 = new HashSet<>();
        hu1.add(u1);
        hu1.add(u2);
        HashSet<LibrosElectronicos>libros = new HashSet<>();
        libros.add(l1);
        libros.add(l2);
        libros.add(l3);

        SistemaBiblioteca s1 = new SistemaBiblioteca(libros,hu1);

        s1.controlarprestamo(u1,"harry potter");


    }
}
