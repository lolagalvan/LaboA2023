
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
    void valida(){
        if (mes == 1 || mes== 3||mes== 5||mes== 7||mes== 8||mes== 10||mes== 12) {
            if (dia < 1 || dia > 31) {
                dia = 1;
            }
        } else if (mes == 4 ||mes == 6 ||mes== 9||mes== 11 ) {
            if (dia < 1 || dia > 30) {
                dia = 1;
            }
        }else{
            if (dia < 1 || dia > 28) {
                dia = 1;
            }
        }
        if(mes<1 || mes>12){
            mes=1;
        }
        if (anio<1000 || anio>9999){
            anio=1900;
        }
    }
    void corta(){
        valida();
        System.out.println(dia + "-" + mes + "-" + anio);
    }


    void igualQue(Fecha fecha){
        valida();
        int anio1 = fecha.anio;
        int mes1  = fecha.mes;
        int dia1  = fecha.dia;
        if(anio == anio1 && mes == mes1 && dia == dia1) System.out.println(" Son iguales");
        else System.out.println("no son iguales");
    }
    void menorQue(Fecha fecha){
        valida();
        int anio1 = fecha.anio;
        int mes1  = fecha.mes;
        int dia1  = fecha.dia;
        if(anio < anio1)System.out.println(" es menor");
        else if (anio1 == anio && mes < mes1) System.out.println(" es menor");
        else if (anio1 == anio && mes == mes1 && dia < dia1) System.out.println("es menor");
        else System.out.println(" no es menor");
    }
    void mayorQue(Fecha fecha){
        valida();
        int anio1 = fecha.anio;
        int mes1  = fecha.mes;
        int dia1  = fecha.dia;
        if(anio > anio1)System.out.println("es mayor");
        else if (anio1 == anio && mes > mes1) System.out.println("es mayor");
        else if (anio1 == anio && mes == mes1 && dia > dia1) System.out.println(" es mayor");
        else System.out.println(" es mayor");
    }
}
















