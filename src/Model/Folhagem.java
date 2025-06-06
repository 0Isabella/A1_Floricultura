package Model;

import java.util.List;

public interface Folhagem {
    abstract List<Bebida> obterLista();
    void adicionarElemento(List<Integer> lista, Integer elemento);
}
