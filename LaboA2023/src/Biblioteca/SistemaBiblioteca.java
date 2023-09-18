package Biblioteca;

import java.util.HashSet;

public class SistemaBiblioteca {
    private HashSet<LibrosElectronicos>libros;
    private HashSet<Usuarios1> usuarios;




    public SistemaBiblioteca(HashSet<LibrosElectronicos> libros, HashSet<Usuarios1> usuarios) {
        this.libros = libros;
        this.usuarios = usuarios;
    }

    public HashSet<LibrosElectronicos> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<LibrosElectronicos> libros) {
        this.libros = libros;
    }

    public void altaLibro(LibrosElectronicos libro){
        libros.add(libro);
    }

    public void eliminarLibro(LibrosElectronicos libro){
        libros.remove(libro);
    }

    public void modificarLibro(LibrosElectronicos libroNuevo, LibrosElectronicos libroViejo){
        libros.remove(libroViejo);
        libros.add(libroNuevo);
    }

    public void controlarprestamo(Usuarios1 usuario, String nombreLibro){
        LibrosElectronicos libroAux =null;
        for (LibrosElectronicos libro:libros){
            if(libro.getNombre().equals(nombreLibro)){
                libroAux=libro;
            }
        }
        if (libroAux!=null){
            try{
                if(libroAux.getCantActualDescargas()+1< LibrosElectronicos.getCantDescargas()){
                    if (usuario.getLiborosPrestados().size()<usuario.getTipoMembresia().getCantidad()){
                        usuario.getLiborosPrestados().add(libroAux);
                        libroAux.setCantActualDescargas(libroAux.getCantActualDescargas()+1);
                    }
                    else {
                        throw new MebresiaException("Su membresia no le permite sacar mas libros");
                    }

                }
                else {
                    throw new LimiteDePrestamosAlcanzadoException("Se alcanzo el limite de  descargas");
                }

            } catch (LimiteDePrestamosAlcanzadoException e) {
                System.out.println(e);
            } catch (MebresiaException e) {
                System.out.println(e);
            }

        }
        else {
            System.out.println("El libro no existe");
        }
    }

}
