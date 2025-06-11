package Model;

public class Pedido {
    private String data;
    private int valorTotal;
    private String statusDoPedido;

    public Pedido(String data, String lista, int valorTotal, String statusDoPedido) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.statusDoPedido = statusDoPedido;
    }

    public String getData() {
        return data;
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

    public void setValorTotal() {
        this.valorTotal = valorTotal;
    }

    public void setStatusDoPedido() {
        this.statusDoPedido = statusDoPedido;
    }
}
