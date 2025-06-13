package Model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String data;
    private double valorTotal;
    private String statusDoPedido;
    private List<Object> itensVendidos;

    public Pedido(String data, double valorTotal, String statusDoPedido) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.statusDoPedido = statusDoPedido;
        this.itensVendidos = new ArrayList<>();
    }

    public String getData() {
        return data;
    }

    public double getValorTotal() {
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



    public void setItensVendidos(List<Object> itensVendidos) {
        this.itensVendidos = itensVendidos;
    }
    public List<Object> getItensVendidos() {
        return itensVendidos;
    }
}
