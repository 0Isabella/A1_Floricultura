package Model;

import java.util.List;

public interface Chocolates {
    List<Chocolate> obterLista();
    void adicionarElemento(List<Integer> lista, Integer elemento);
}