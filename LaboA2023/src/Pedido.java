import java.sql.Time;

public class Pedido {

    private int idPedido;
    private Fecha fechaCreacion;

    private Plato plato;
    private Persona personaPedido;
    private Tiempo horaEntrega;

    private boolean entregado;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
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

}
