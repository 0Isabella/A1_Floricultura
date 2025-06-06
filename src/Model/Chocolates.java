package Model;

import java.util.List;

public interface Chocolates {
    List<Chocolate> obterListac();
    void adicionarElemento(List<Integer> lista, Integer elemento);
}