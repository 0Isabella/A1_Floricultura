package Model;

import java.util.List;

public interface Folhagem {
    abstract List<Folhagem> obterListaf();
    void adicionarElemento(List<Integer> lista, Integer elemento);
}
