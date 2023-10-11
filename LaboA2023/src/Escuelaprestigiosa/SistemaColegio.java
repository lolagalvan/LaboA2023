/*package Escuelaprestigiosa;

import java.util.HashSet;

public class SistemaColegio {

    HashSet<Alumno>alumnos;

    public SistemaColegio(HashSet<Alumno> alumnos) {
        this.alumnos = alumnos;

    }

    public HashSet<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(HashSet<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public int cantAprobados(){
        int contador=0;
        for(Alumno alumno:alumnos){
            for(Examen examen:alumno.getExamenesRealizados()){
                if(examen.cantAprobados()){
                    contador++;
                }
            }
        }
        return contador;
    }





}
*/