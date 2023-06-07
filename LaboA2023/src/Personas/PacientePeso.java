package Personas;

import Personas.Persona;
import Tiempo.Fecha;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class PacientePeso extends Persona {
    HashMap<LocalDate,Double> Altura;
    HashMap<LocalDate,Double> Peso;
    public PacientePeso(String nombre, int edad, String direccion, String apellido, int telefono, Fecha nacimiento, HashMap<LocalDate,Double> Altura,  HashMap<LocalDate,Double> Peso) {
        super(nombre, edad, direccion, apellido, telefono, nacimiento);
        this.Altura = Altura;
        this.Peso = Peso;
    }

    public HashMap<LocalDate, Double> getAltura() {
        return Altura;
    }
    public void setAltura(HashMap<LocalDate, Double> altura) {
        Altura = altura;
    }
    public HashMap<LocalDate, Double> getPeso() {
        return Peso;
    }
    public void setPeso(HashMap<LocalDate, Double> peso) {
        Peso = peso;
    }
    public void conocerPesoAltura(LocalDate fecha){
        System.out.println("dia: " + fecha + " peso: " + Peso.get(fecha) + " altura: " + Altura.get(fecha));
    }

    public void promedio(int anio){
        int contador=0;
        double sumaPeso=0;
        double sumaAltura=0;
        double porcentajeAltura = 0;
        double porcentajePeso = 0;

        for(Map.Entry<LocalDate, Double> peso:Peso.entrySet()){
            if(peso.getKey().getYear()==anio){
                contador++;
                sumaPeso+=peso.getValue();
            }
        }
        porcentajePeso=sumaPeso/contador;

        for(Map.Entry<LocalDate, Double> altura:Altura.entrySet()){
            if(altura.getKey().getYear()==anio){
                contador++;
                sumaAltura+=altura.getValue();
            }
        }
        porcentajeAltura= sumaAltura/contador;
        System.out.println("porcentaje peso : "+ porcentajePeso + "porcentaje altura : " + porcentajeAltura);

    }

    public double diferenciaAltura(int anioMenor, int anioMayor){
        double diferencia;
        double alturaMenor=0, alturaMayor=0;
        LocalDate fechaMenor=null, fechaMayor=null;
        for(Map.Entry<LocalDate, Double> altura:Altura.entrySet()){
            if(fechaMenor==null || (altura.getKey().getYear()==anioMenor) && (altura.getKey().compareTo(fechaMenor) == 1)){
                fechaMenor=altura.getKey();
                alturaMenor=altura.getValue();
            }
        }
        for(Map.Entry<LocalDate, Double> altura:Altura.entrySet()){
            if(fechaMayor==null || (altura.getKey().getYear()==anioMayor) && (altura.getKey().compareTo(fechaMayor) == 1)){
                fechaMayor=altura.getKey();
                alturaMayor=altura.getValue();
            }
        }
        return alturaMayor-alturaMenor;
    }
}
