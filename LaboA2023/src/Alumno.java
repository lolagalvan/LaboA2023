import java.util.ArrayList;

public class Alumno extends Persona {

    private String apellido;
    private Fecha nacimiento;
    private ArrayList<Materia> materias;

    private String division;

    public Alumno(String nombre) {
        super(nombre);
    }

    /*public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }*/


    public void agrgearMatreia(Materia materia){
        materias.add(materia);
    }

    public void menorNota(){
        int menor = 10;
for (Materia materia: materias)
        for (float nota: materia.getNotas()) {
            if (nota<menor){
                menor = (int) nota;
            }
        }

    }

    public void mayorNota(){
        int mayor = 0;
        for (Materia materia: materias)
            for (float nota: materia.getNotas()) {
            if (nota>mayor){
                mayor = (int) nota;
            }
        }

    }

    public double promedioAlumno(){
        double suma=0;
        double promedio= 0;
        for (Materia materia: materias) {
                suma= suma + materia.promedioNotas();
            }
        promedio= suma/ materias.size();
        return promedio;

    }

}
