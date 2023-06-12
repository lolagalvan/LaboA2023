package sistemaLugares;

import java.util.HashSet;

public class Sistema {

    private HashSet<Lugares>lugares;

    public Sistema(HashSet<Lugares> lugares) {
        this.lugares = lugares;
    }

    public HashSet<Lugares> getLugares() {
        return lugares;
    }

    public void setLugares(HashSet<Lugares> lugares) {
        this.lugares = lugares;
    }

    public void agregarLugar(Lugares lugar){
        lugares.add(lugar);
    }

    public void eliminarLugar(Lugares lugar){
        lugares.remove(lugar);
    }

    public void modificarLugar(Lugares Nuevo, Lugares Viejo){
        lugares.remove(Viejo);
        lugares.add(Nuevo);
    }

    public int poblacionCodigo(int codigo){
        int poblacion = 0;
        for (Lugares lugar:lugares) {
            if (lugar.getCodigo()==codigo){
                poblacion=lugar.consultarPoblacion();
            }

        }
        return poblacion;
    }
    public void informacion(){
        System.out.println( paisConMasPoblacion().getNombre());
        System.out.println( paisConMenosPoblacion().getNombre());
        System.out.println( continenteConMaspoblacion().getNombre());
        System.out.println( continenteConMenosPoblacion().getNombre());
    }

    public Pais paisConMasPoblacion(){
        int mayor=0;
        Pais paisMayor=new Pais();
        for(Lugares lugar:lugares){
            if(lugar instanceof Pais && lugar.consultarPoblacion()>mayor){
                mayor= lugar.consultarPoblacion();
                paisMayor= (Pais)lugar;
            }
        }
        return paisMayor;
    }

    public Pais paisConMenosPoblacion(){
        int menor=0;
        Pais paisMenor=new Pais();
        for(Lugares lugar:lugares){
            if(lugar instanceof Pais && (lugar.consultarPoblacion()<menor || menor==0)){
                menor= lugar.consultarPoblacion();
                paisMenor= (Pais)lugar;
            }
        }
        return paisMenor;
    }
    public Continente continenteConMaspoblacion(){
        int mayor=0;
        Continente contMayor=new Continente();
        for(Lugares lugar:lugares){
            if(lugar instanceof Continente && lugar.consultarPoblacion()>mayor){
                mayor= lugar.consultarPoblacion();
                contMayor= (Continente)lugar;
            }
        }
        return contMayor;
    }
    public Continente continenteConMenosPoblacion(){
        int menor=0;
        Continente contMenor=new Continente();
        for(Lugares lugar:lugares){
            if(lugar instanceof Continente && (lugar.consultarPoblacion()<menor || menor==0)){
                menor= lugar.consultarPoblacion();
                contMenor= (Continente)lugar;
            }
        }
        return contMenor;
    }
}





