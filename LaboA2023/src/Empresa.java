import java.util.ArrayList;

public class Empresa {
    private ArrayList<Vehiculos> vehiculos;


    public ArrayList<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void Cantvehiculos(){
        int cantAutos = 0;
        int canCamionetas = 0;

        for (Vehiculos vehiculo:vehiculos) {
            if(vehiculo.getClass().getCanonicalName().equals("Coche")){
                cantAutos ++;
            }
            else if (vehiculo.getClass().getCanonicalName().equals("Camionetas")) {
                canCamionetas ++;

            }
            if (cantAutos>canCamionetas){
                System.out.println("hay mas autos");
            }
            else {
                System.out.println("hay mas camionetas");
            }

        }
    }

    public void porcentajeAutos() {
        int cantDescapotable = 0;
        int cantTotal = 0;
        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo instanceof Coche) {
                cantTotal++;
                if (((Coche) vehiculo).isDescapotable()) {
                    cantDescapotable++;
                }
            }
        }
        int porcentaje = (cantDescapotable * 100) / cantTotal;
    }
