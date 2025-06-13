package Model;

import java.util.ArrayList;
import java.util.List;

public class Arranjo extends Buque{
    private boolean comVaso;
    private boolean comEspumaFloral;
    private int precoBase;

    public Arranjo(List<Flor> flores, int precoBase) {
        super(flores, 120);
    }


    public void adicionarFlor(Flor flor) {
        getFlores().add(flor);
    }

    public void removerFlor(Flor flor) {
        getFlores().remove(flor);
    }


    public int calcularPrecoTotal() {
        int precoFlores = flores.stream().mapToInt(Flor::getPrecoUnidade).sum();
        int custoExtras = comVaso ? 200 : 0; // Custo do vaso
        custoExtras += comEspumaFloral ? 100 : 0; // Custo da espuma floral

        return precoBase + precoFlores + custoExtras;
    }



    public List<Flor> getFlores() {
        return new ArrayList<>(flores); // Retorna cópia para evitar modificações externas
    }

    public boolean isComVaso() {
        return comVaso;
    }

    public boolean isComEspumaFloral() {
        return comEspumaFloral;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public int getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(int precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public String toString() {
        return String.format("Arranjo: %s\nDescrição: %s\nPreço Total: R$%d\nFlores incluídas: %d\nInclui vaso: %s\nInclui espuma floral: %s",
                nome, descricao, calcularPrecoTotal(), flores.size(), comVaso ? "Sim" : "Não", comEspumaFloral ? "Sim" : "Não");
    }
}