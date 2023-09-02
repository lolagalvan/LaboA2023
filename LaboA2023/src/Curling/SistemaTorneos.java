package Curling;

import Curling.Equipo;
import Curling.Partidos;

import java.util.ArrayList;

public class SistemaTorneos {
    private ArrayList<Partidos> listaDePartidos;
    private ArrayList<Equipo> listaDeEquipos;

    public SistemaTorneos(){
        listaDeEquipos=new ArrayList<Equipo>();
        listaDePartidos=new ArrayList<Partidos>();
    }
    public SistemaTorneos(ArrayList<Partidos> listaDePartidos, ArrayList<Equipo> listaDeEquipos) {
        this.listaDePartidos = listaDePartidos;
        this.listaDeEquipos = listaDeEquipos;
    }

    public ArrayList<Partidos> getListaDePartidos() {
        return listaDePartidos;
    }

    public void setListaDePartidos(ArrayList<Partidos> listaDePartidos) {
        this.listaDePartidos = listaDePartidos;
    }

    public ArrayList<Equipo> getListaDeEquipos() {
        return listaDeEquipos;
    }

    public void setListaDeEquipos(ArrayList<Equipo> listaDeEquipos) {
        this.listaDeEquipos = listaDeEquipos;
    }

    public Boolean validacionEquipo(Equipo nuevoEquipo){
        boolean puedeEntrar=true;
        for(Equipo equipo : listaDeEquipos){
            if(nuevoEquipo.getNombreEquipo().equals(equipo.getNombreEquipo())){
                puedeEntrar=false;
            }
        }
        return puedeEntrar;
    }
    public void agregarEquipo(Equipo nuevoEquipo){
        boolean puedeEntrar= validacionEquipo(nuevoEquipo);
        if (puedeEntrar) {
            listaDeEquipos.add(nuevoEquipo);
        } else {
            System.out.println("Ya hay un equipo con ese nombre");
        }
    }

    public void armarFixture(){
        for(int i=0;i<listaDeEquipos.size()-1;i++){
            for (int j=i++;j<listaDeEquipos.size();j++) {
                Partidos partido = new Partidos(listaDeEquipos.get(i), listaDeEquipos.get(j));
                listaDePartidos.add(partido);
            }
        }
    }
}

