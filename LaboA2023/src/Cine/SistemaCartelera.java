package Cine;

import Cine.Funcion;
import Cine.Pelicula;
import Cine.Sala;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class SistemaCartelera {

    private HashSet<Espectador> usuarios;
    public HashSet<Funcion> funcionesDisponibles;

    public SistemaCartelera(HashSet<Espectador> usuarios, HashSet<Funcion> funcionesDisponibles) {
        this.usuarios = usuarios;
        this.funcionesDisponibles = funcionesDisponibles;
    }

    public HashSet<Espectador> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashSet<Espectador> usuarios) {
        this.usuarios = usuarios;
    }

    public HashSet<Funcion> getFuncionesDisponibles() {
        return funcionesDisponibles;
    }

    public void setFuncionesDisponibles(HashSet<Funcion> funcionesDisponibles) {
        this.funcionesDisponibles = funcionesDisponibles;
    }

    public int cantDeUsuarios() {
        return usuarios.size();
    }

    public void agregarFunciones(Funcion nuevaFuncion){
        funcionesDisponibles.add(nuevaFuncion);
    }

    public HashSet<Funcion> funcionsParaVer() {
        HashSet<Funcion> aux = new HashSet<>();
        for (Funcion f : funcionesDisponibles) {
            if (f.getFechaYHora().isAfter(LocalDateTime.now()) && f.getCantCompras() < Sala.getButacas()) {
                aux.add(f);
            }
        }
        return aux;
    }

    public HashMap<Pelicula, Integer> peliMasVista() {
        HashMap<Pelicula, Integer> aux = new HashMap<>();
        for (Funcion f : funcionesDisponibles) {
            aux.put(f.getPelicula(), +f.getCantCompras());

        }
        return aux;
    }

    public Espectador UsuarioMenosCompro() {
        Espectador usuarioMenor = new Espectador();
        int usuario = -1;
        int cantFunciones = 0;
        for (Espectador e : usuarios) {
            cantFunciones = e.getFuncionesVistas().size();

            if (cantFunciones > usuario) {
                usuarioMenor = e;
            }


        }
        return usuarioMenor;

    }

}/*
 public static void main(String[] args) {
        HashSet<Cine.Espectador> usuarios = new HashSet<>();
        HashSet<Cine.Funcion> funcionesDisponibles = new HashSet<>();

        Cine.Pelicula p1= new Cine.Pelicula("Frozen",120,Cine.Biblioteca.Genero.COMEDIA);
        Cine.Pelicula p2= new Cine.Pelicula("Barbie",180,Cine.Biblioteca.Genero.DRAMA);
        Cine.Pelicula p3= new Cine.Pelicula("Spiderman",135,Cine.Biblioteca.Genero.ACCION);
        Cine.Pelicula p4= new Cine.Pelicula("Una Romantica",105,Cine.Biblioteca.Genero.ROMANCE);

        Cine.Sala s1 = new Cine.Sala(10);
        Cine.Sala s2 = new Cine.Sala(11);
        Cine.Sala s3 = new Cine.Sala(12);
        Cine.Sala s4 = new Cine.Sala(13);

        Cine.Funcion f1 = new Cine.Funcion(p1, LocalDateTime.of(2023,05,06,14,48,00),s1,23);
        Cine.Funcion f2 = new Cine.Funcion(p2, LocalDateTime.of(2023,05,24,17,15,00),s2,32);
        Cine.Funcion f3 = new Cine.Funcion(p3, LocalDateTime.of(2023,06,13,12,30,00),s4,25);
        Cine.Funcion f4 = new Cine.Funcion(p4, LocalDateTime.of(2023,07,18,8,45,00),s3,44);
        Cine.Funcion f5 = new Cine.Funcion(p1, LocalDateTime.of(2023,07,28,8,45,00),s2,40);

        Cine.Espectador u1= new Cine.Espectador("lolamariaga@gmail.com",new HashSet<>());
        Cine.Espectador u2= new Cine.Espectador("annamlikota@gmail.com",new HashSet<>());
        Cine.Espectador u3= new Cine.Espectador("cami@gmail.com",new HashSet<>());
        Cine.Espectador u4= new Cine.Espectador("juli@gmail.com",new HashSet<>());
        Cine.Espectador u5= new Cine.Espectador("mariana@gmail.com",new HashSet<>());
        Cine.Espectador u6= new Cine.Espectador("carolinazicker@gmail.com",new HashSet<>());

        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
        usuarios.add(u6);
        funcionesDisponibles.add(f1);
        funcionesDisponibles.add(f2);
        funcionesDisponibles.add(f3);
        funcionesDisponibles.add(f4);

        Cine.SistemaCartelera sc1= new Cine.SistemaCartelera(usuarios,funcionesDisponibles);

        System.out.println( "hay: "+Cine.Pelicula.cantPelis()+ " pelis");
        System.out.println("hay:"+sc1.cantDeUsuarios()+ " usuarios");
        sc1.agregarFunciones(f5);
        System.out.println("hay:"+sc1.funcionsParaVer()+" para ver");
        System.out.println(sc1.peliMasVista()+"es la peli mas vista");
        System.out.println(sc1.UsuarioMenosCompro()+"es el usuario con menos compras");

        HashSet<Cine.Funcion>funcionsParaVer = sc1.funcionsParaVer();

        for (Cine.Funcion f:funcionsParaVer) {
            System.out.println(f.getPelicula() + "esta disponibles");
        }



    }*/
