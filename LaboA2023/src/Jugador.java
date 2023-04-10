public class Jugador {

    private String nombre;
    private Fecha nacimiento;
    private int numCamiseta;

    private boolean capitan;




    public Jugador(){
        nombre="pepe";
        numCamiseta=1;
        capitan=false;
        nacimiento = new Fecha();
    }
    public Jugador(String nombre, int numCamiseta, Fecha nacimiento,boolean capitan){
        this.nombre=nombre;
        this.numCamiseta=numCamiseta;
        capitan=false;
        this.nacimiento= nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public boolean isCapitan() {
        return capitan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }
}

