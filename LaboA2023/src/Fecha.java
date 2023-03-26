public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    
 
    void igualQue(Fecha fecha){
        valida();
        int anio1 = fecha.anio;
        int mes1  = fecha.mes;
        int dia1  = fecha.dia;
        if(anio == anio1 && mes == mes1 && dia == dia1) System.out.println("Las fechas son iguales");
        else System.out.println("Las fechas no son iguales");
    }
    void menorQue(Fecha fecha){
        valida();
        int anio1 = fecha.anio;
        int mes1  = fecha.mes;
        int dia1  = fecha.dia;
        if(anio < anio1)System.out.println("La fecha es menor");
        else if (anio1 == anio && mes < mes1) System.out.println("La fecha es menor");
        else if (anio1 == anio && mes == mes1 && dia < dia1) System.out.println("La fecha es menor");
        else System.out.println("La fecha no es menor");
    }
    void mayorQue(Fecha fecha){
        valida();
        int anio1 = fecha.anio;
        int mes1  = fecha.mes;
        int dia1  = fecha.dia;
        if(anio > anio1)System.out.println("La fecha es mayor");
        else if (anio1 == anio && mes > mes1) System.out.println("La fecha es mayor");
        else if (anio1 == anio && mes == mes1 && dia > dia1) System.out.println("La fecha es mayor");
        else System.out.println("La fecha no es mayor");
    }
}