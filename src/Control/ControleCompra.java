package Control;
import Model.Pedido;
import View.InputHelper;


import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate; // Para usar datas


public class ControleCompra {
    private ArrayList<Pedido> pedido;


    public ControleCompra() {
        this.pedido = new ArrayList<>();
    }
    public void RegistarVenda(List<Object> itensVendidos, double ValorTotal){
        String dataAtual = LocalDate.now().toString();
        Pedido novoPedido = new Pedido(dataAtual, ValorTotal, "Concluído");
        novoPedido.setItensVendidos(itensVendidos);
        this.pedido.add(novoPedido);
        InputHelper.InputText("Venda registrada com sucesso!");
    }
    public List<Pedido> getPedidos() {
        return pedido;
    }
}
