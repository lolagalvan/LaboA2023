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
        System.out.println("hora de entrga?");
        int hora = entrada.nextInt();
        int minutos = entrada.nextInt();
        Tiempo t1 = new Tiempo(hora,minutos);
        boolean entrega = false;

        pedidos.add(id,f1, p1, nombreP,t1,entrega);
        }



    public void modficarPedido(){
        System.out.println("que pedido quiere modificar?");
        Scanner entrada = new Scanner(System.in);
        int id;
        id = entrada.nextInt();
        for (Pedido pedido:pedidos) {
            if ( pedido.getIdPedido().equals(id)){
                System.out.println("cual es la nueva fecha de creacion?");
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



}
