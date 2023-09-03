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

}
 public static void main(String[] args) {
        HashSet<Espectador> usuarios = new HashSet<>();
        HashSet<Funcion> funcionesDisponibles = new HashSet<>();

        Pelicula p1= new Pelicula("Frozen",120,Genero.COMEDIA);
        Pelicula p2= new Pelicula("Barbie",180,Genero.DRAMA);
        Pelicula p3= new Pelicula("Spiderman",135,Genero.ACCION);
        Pelicula p4= new Pelicula("Una Romantica",105,Genero.ROMANCE);

        Sala s1 = new Sala(10);
        Sala s2 = new Sala(11);
        Sala s3 = new Sala(12);
        Sala s4 = new Sala(13);

        Funcion f1 = new Funcion(p1, LocalDateTime.of(2023,05,06,14,48,00),s1,23);
        Funcion f2 = new Funcion(p2, LocalDateTime.of(2023,05,24,17,15,00),s2,32);
        Funcion f3 = new Funcion(p3, LocalDateTime.of(2023,06,13,12,30,00),s4,25);
        Funcion f4 = new Funcion(p4, LocalDateTime.of(2023,07,18,8,45,00),s3,44);
        Funcion f5 = new Funcion(p1, LocalDateTime.of(2023,07,28,8,45,00),s2,40);

        Espectador u1= new Espectador("lolamariaga@gmail.com",new HashSet<>());
        Espectador u2= new Espectador("annamlikota@gmail.com",new HashSet<>());
        Espectador u3= new Espectador("cami@gmail.com",new HashSet<>());
        Espectador u4= new Espectador("juli@gmail.com",new HashSet<>());
        Espectador u5= new Espectador("mariana@gmail.com",new HashSet<>());
        Espectador u6= new Espectador("carolinazicker@gmail.com",new HashSet<>());

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

        SistemaCartelera sc1= new SistemaCartelera(usuarios,funcionesDisponibles);

        System.out.println( "hay: "+Pelicula.cantPelis()+ " pelis");
        System.out.println("hay:"+sc1.cantDeUsuarios()+ " usuarios");
        sc1.agregarFunciones(f5);
        System.out.println("hay:"+sc1.funcionsParaVer()+" para ver");
        System.out.println(sc1.peliMasVista()+"es la peli mas vista");
        System.out.println(sc1.UsuarioMenosCompro()+"es el usuario con menos compras");

        HashSet<Funcion>funcionsParaVer = sc1.funcionsParaVer();

        for (Funcion f:funcionsParaVer) {
            System.out.println(f.getPelicula() + "esta disponibles");
        }



    }
