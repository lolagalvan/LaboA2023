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
