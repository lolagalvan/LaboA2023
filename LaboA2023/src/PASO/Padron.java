package PASO;

import java.util.HashMap;
import java.util.HashSet;

public class Padron {

    private HashSet<Votantes> votantes;
    private HashSet<PartidosPoliticos> partidos;


    public Padron(HashSet<Votantes> votantes, HashSet<PartidosPoliticos> partidos) {
        this.votantes = votantes;
        this.partidos = partidos;
    }

    public Padron() {
    }

    public HashSet<Votantes> getVotantes() {
        return votantes;
    }

    public void setVotantes(HashSet<Votantes> votantes) {
        this.votantes = votantes;
    }

    public HashSet<PartidosPoliticos> getPartidos() {
        return partidos;
    }

    public void setPartidos(HashSet<PartidosPoliticos> partidos) {
        this.partidos = partidos;
    }



    public int contarVotos(){
        int cantDeVotos = 0;
        int porcentajePoblacion = 0;
        for (PartidosPoliticos p: partidos){
            cantDeVotos = p.getCandidato().votosTotales();
            System.out.println("El candidato: "+ p.getCandidato().getNombre() +""+"tiene" + cantDeVotos);

            porcentajePoblacion = votantes.size()/100*cantDeVotos;

        }
        return porcentajePoblacion;
    }

    public void candidatoGanador(){
        Candidato ganador = null;
        int MayorVotos = 0;
        int cantVotosTotales;
        

        for (PartidosPoliticos p:partidos) {
            if(p.getCandidato().votosTotales()>MayorVotos ){
                ganador = p.getCandidato();
            }

        }
        System.out.println("el candidato ganador es: " + ganador);
    }

    public int porcentajeNoVotaron(){
        int NoVotaron= 0;

        for (Votantes v: votantes){
            if(v.isVoto() == false){
                NoVotaron++;

            }
        }
        return votantes.size()/100*NoVotaron;
    }
    public void emitirVoto(Votantes votador, Candidato votado){
        if(votador.isVoto() == false){
            votador.setVoto(true);

            for (PartidosPoliticos p: partidos) {

                if (p.getCandidato().getVotosProvincia().containsKey(votador.getProvincia())) {
                    p.getCandidato().getVotosProvincia().put(votador.getProvincia(), +1);
                } else {
                    votado.getVotosProvincia().put(votador.getProvincia(), 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        HashSet<Votantes>votantes1 = new HashSet<>();
        HashSet<PartidosPoliticos>partidos1 = new HashSet<>();

        Votantes v1= new Votantes(true, Provincia.CATAMARCA);
        Votantes v2= new Votantes(true, Provincia.BUENOSAIRES);
        Votantes v3= new Votantes(false, Provincia.ENTRERIOS);
        Votantes v4= new Votantes(true, Provincia.BUENOSAIRES);
        Votantes v5= new Votantes(false, Provincia.CHACO);
        Votantes v6= new Votantes(false, Provincia.CATAMARCA);
        Votantes v7= new Votantes(true, Provincia.CATAMARCA);

        Candidato c1= new Candidato("Lola",34,"Bacon 4863","Galvan",54321768,"Argentina", PartidosPoliticos.FRENTEDECONSTITUYENTES,new HashMap<>(),new HashMap<>());
        Candidato c2= new Candidato("Anna",37,"Ceretti 2686","Mlikota",58547290,"Argentina", PartidosPoliticos.JUNTOSPORELPOLI,new HashMap<>(),new HashMap<>());
        Candidato c3= new Candidato("Julieta",40,"Constituyentes 4563","Montenegro",54739254,"Argentina", PartidosPoliticos.UNIONPORLADOCENCIA,new HashMap<>(),new HashMap<>());
        Candidato c4= new Candidato("Camila",44,"Griveo 5673","Ibarrola",14634578,"Argentina", PartidosPoliticos.ELPOLIAVANZA,new HashMap<>(),new HashMap<>());


        votantes1.add(v1);
        votantes1.add(v2);
        votantes1.add(v3);
        votantes1.add(v4);
        votantes1.add(v5);
        votantes1.add(v6);
        votantes1.add(v7);

        partidos1.add(PartidosPoliticos.ELPOLIAVANZA);
        partidos1.add(PartidosPoliticos.JUNTOSPORELPOLI);
        partidos1.add(PartidosPoliticos.FRENTEDECONSTITUYENTES);
        partidos1.add(PartidosPoliticos.UNIONPORLADOCENCIA);

        Padron p1 = new Padron(votantes1,partidos1);

        p1.emitirVoto(v1,c2);
        p1.emitirVoto(v2,c2);
        p1.emitirVoto(v7,c3);

        c2.votosTotales();
        p1.contarVotos();
        p1.candidatoGanador();
        p1.porcentajeNoVotaron();
    }
}
