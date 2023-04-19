import java.sql.Time;

public class Pedido {


    private Fecha fechaCreacion;

    private Plato plato;
    private Persona personaPedido;
    private Tiempo horaEntrega;

    private boolean entregado;

    public Pedido(Fecha fechaCreacion, Plato plato,Persona personaPedido, Tiempo horaEntrega, boolean entregado) {
        this.fechaCreacion = fechaCreacion;
        this.plato = plato;
        this.personaPedido = personaPedido;
        this.horaEntrega = horaEntrega;
        this.entregado = entregado;
    }

    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Persona getPersonaPedido() {
        return personaPedido;
    }

    public void setPersonaPedido(Persona personaPedido) {
        this.personaPedido = personaPedido;
    }

    public Tiempo getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(Tiempo horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public double calcularPrecio(){
        double porDescuento = ((Profesor) personaPedido).getDescuento();
        int precio = plato.getPrecio();
        double precioFinal;
        precioFinal = precio - ((precio * porDescuento)/100);
        return precioFinal;

    }

}
