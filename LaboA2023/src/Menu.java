import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<Plato> platos;
    private ArrayList<Pedido>pedidos;
    private ArrayList<Pedido>listaPedidos;

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
    public void agregarPlato(){
        System.out.println("que plato quiere agregar?");
        Scanner entrada = new Scanner(System.in);
        String nombre;
        nombre = entrada.nextLine();
        System.out.println("que precio tiene el plato que quiere agregar?");
        int precio;
        precio = entrada.nextInt();
        Plato p1 = new Plato(nombre, precio);
        platos.add(p1);



    }

    public void modificarPlato(){
        System.out.println("que plato quiere modificar?");
        Scanner entrada = new Scanner(System.in);
        String nombre;
        nombre = entrada.nextLine();
        for (Plato plato:platos) {
            if ( plato.getNombre().equals(nombre)){
                System.out.println("que nombre quieres ponerle?");
                String nombreNuevo;
                nombreNuevo = entrada.nextLine();
                plato.setNombre(nombreNuevo);
                System.out.println("que precio quieres ponerle?");
                int precioNuevo;
                precioNuevo = entrada.nextInt();
                plato.setPrecio(precioNuevo);
            }
        }
    }

    public void eliminarPlato(){

        System.out.println("que plato quiere eliminar?");
        Scanner entrada = new Scanner(System.in);
        String nombre;
        nombre = entrada.nextLine();
        for (Plato plato:platos) {
            if ( plato.getNombre().equals(nombre)) {
                platos.remove(plato);
            }

            }

    }

    public void agregarPedido(){
        System.out.println("que id tiene su pedido?");
        Scanner entrada = new Scanner(System.in);
        int id = entrada.nextInt();
        System.out.println("que fecha tiene su pedido?");
        int dia; dia = entrada.nextInt();
        int mes; mes = entrada.nextInt();
       int anio; anio = entrada.nextInt();
        Fecha f1 = new Fecha(dia,mes,anio);
        System.out.println("que plato quiere pedir?");
        String nombre; nombre = entrada.nextLine();
        int precio; precio = entrada.nextInt();
        Plato p1 = new Plato(nombre, precio);
        System.out.println("quien lo esta pidiendo?");
        String nombreP;
        nombreP = entrada.nextLine();
        int edad;
        edad = entrada.nextInt();
        String direccion;
        direccion = entrada.nextLine();
        Persona per1 = new Persona(nombreP,edad,direccion);
        System.out.println("hora de entrga?");
        int hora = entrada.nextInt();
        int minutos = entrada.nextInt();
        Tiempo t1 = new Tiempo(hora,minutos);
        boolean entrega = false;

        Pedido pedido1 = new Pedido (f1, p1, per1,t1,entrega);

        pedidos.add(pedido1);
        }



    public void modficarPedido(){
        System.out.println("que pedido quiere modificar?");
        Scanner entrada = new Scanner(System.in);
        String nombre; nombre = entrada.nextLine();
        int precio; precio = entrada.nextInt();
        Plato p1 = new Plato(nombre, precio);
        int dia; dia = entrada.nextInt();
        int mes; mes = entrada.nextInt();
        int anio; anio = entrada.nextInt();
        Fecha f1 = new Fecha(dia,mes,anio);
        for (Pedido pedido:pedidos) {
            if ( pedido.getPlato().equals(p1) && pedido.getFechaCreacion().equals(f1)) {
                System.out.println("cual es la nueva fecha de creacion?");
                int dia1; dia1 = entrada.nextInt();
                int mes2; mes2 = entrada.nextInt();
                int anio3; anio3 = entrada.nextInt();
                Fecha f2 = new Fecha(dia1,mes2,anio3);
                pedido.setFechaCreacion(f1);
                System.out.println("que plato quiere cambiar?");
                String nombre1; nombre1 = entrada.nextLine();
                int precio1; precio1 = entrada.nextInt();
                Plato p2 = new Plato(nombre1, precio1);
                pedido.setPlato(p1);
                System.out.println("quien lo esta pidiendo?");
                String nombreP;
                nombreP = entrada.nextLine();
                int edad;
                edad = entrada.nextInt();
                String direccion;
                direccion = entrada.nextLine();
                Persona per1 = new Persona(nombreP,edad,direccion);
                pedido.setPersonaPedido(per1);
                System.out.println("hora de entrga?");
                int hora = entrada.nextInt();
                int minutos = entrada.nextInt();
                Tiempo t1 = new Tiempo(hora,minutos);
                pedido.setHoraEntrega(t1);
                boolean entrega = false;

            }
        }


    }
    public void eliminarPedido(){

        System.out.println("que pedido quiere eliminar?");
        Scanner entrada = new Scanner(System.in);
        String nombre; nombre = entrada.nextLine();
        int precio; precio = entrada.nextInt();
        Plato p1 = new Plato(nombre, precio);
        int dia; dia = entrada.nextInt();
        int mes; mes = entrada.nextInt();
        int anio; anio = entrada.nextInt();
        Fecha f1 = new Fecha(dia,mes,anio);
        for (Pedido pedido:pedidos) {
            if (pedido.getPlato().equals(p1) && pedido.getFechaCreacion().equals(f1)) {
                pedidos.remove(pedido);

            }
        }

    }
    public void platosDelDia() {
        for (Pedido pedido : pedidos) {
            if (pedido.getFechaCreacion().equals(new Fecha())) {
                System.out.print(pedido.getPlato().getNombre());
                if (pedido.getPersonaPedido() instanceof Profesor) {
                    double precioFinal = pedido.calcularPrecio();
                    System.out.println(precioFinal );
                } else {
                    System.out.println(pedido.getPlato().getPrecio());
                }
            }
        }
    }



}
