package Model;

import java.util.List;

public interface Folhagem {
    List<Folhagems> obterLista();
    void adicionarElemento(List<Integer> lista, Integer elemento);
}
