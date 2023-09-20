package Bebidas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class sistemaBebidas {
    private HashMap<Integer, Lola>bebedores;
    private HashMap<Bebida, Integer> Bebidas;

    public sistemaBebidas(HashMap<Integer, Lola> bebedores, HashMap<Bebida, Integer> bebidas) {
        this.bebedores = bebedores;
        Bebidas = bebidas;
    }

    public HashMap<Integer, Lola> getBebedores() {
        return bebedores;
    }

    public void setBebedores(HashMap<Integer, Lola> bebedores) {
        this.bebedores = bebedores;
    }

    public HashMap<Bebida, Integer> getBebidas() {
        return Bebidas;
    }

    public void setBebidas(HashMap<Bebida, Integer> bebidas) {
        Bebidas = bebidas;
    }

    public void coeficienteXpersona(){
        boolean vuelta=false;
        int cMayor=0;
        int cMenor=0;
        Lola Mayor=null;
        Lola Menor=null;
        try {
            if (bebedores.size()==0){
                throw new noHayUsuarios("No existen usuarios en el sistema");
            }
            for (Map.Entry<Integer, Lola> usuario : bebedores.entrySet()) {
                int coefAux = usuario.getValue().coeficienteHidratacion();
                if (!vuelta) {
                    cMayor = coefAux;
                    Mayor = usuario.getValue();
                    cMenor = coefAux;
                    Menor = usuario.getValue();
                    vuelta = true;
                }
                if (cMayor < coefAux) {
                    cMayor = coefAux;
                    Mayor = usuario.getValue();
                }
                if (cMenor > coefAux) {
                    cMenor = coefAux;
                    Menor = usuario.getValue();
                }
            }
            System.out.println(Mayor.getNombre() +);
            System.out.println(Menor.getNombre() );
        } catch (noHayUsuarios e) {
            System.out.println(e);
        }

    }
    public void agregarUsuario(String nombre, int dni) {
        try {
            if (bebedores.containsKey(dni)) {
                throw new dniYaExiste("El dni ingresado ya existe en el sistema");
            } else {
                Lola u1 = new Lola(nombre);

            }
        } catch (dniYaExiste e) {
            System.out.println(e);
        }
    }


    public void tomarBebida(int dni, Bebida bebida, int cantidad){
        if (Bebidas.containsKey(bebida)) {
            try {
                if (Bebidas.get(bebida) >= cantidad) {
                    bebedores.get(dni).tomarBebida(bebida, cantidad);
                    Bebidas.put(bebida, Bebidas.get(bebida) - cantidad);
                } else {
                    throw new cantidadNoDisponible("No hay stock");
                }
            } catch (cantidadNoDisponible e) {
                System.out.println(e);
            }
        }
        else {
            System.out.println("La bebida no existe");
        }
    }



}


