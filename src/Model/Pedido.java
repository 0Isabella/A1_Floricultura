package Model;

public class Pedido {
    public String data;
    public String lista;
    public int valorTotal;
    public String statusDoPedido;

    public Pedido(String data, String lista, int valorTotal, String statusDoPedido) {
        this.data = data;
        this.lista = lista;
        this.valorTotal = valorTotal;
        this.statusDoPedido = statusDoPedido;
    }

    public String getData() {
        return data;
    }

    public String getLista() {
        return lista;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public String getStatusDoPedido() {
        return statusDoPedido;
    }

    public void setData() {
        this.data = data;
    }

    public void setLista() {
        this.lista = lista;
    }

    public void setValorTotal() {
        this.valorTotal = valorTotal;
    }

    public void setStatusDoPedido() {
        this.statusDoPedido = statusDoPedido;
    }
}
