package Model;

import java.util.List;

public interface Folhagem {
    abstract List<Folhagem> obterListaf();
    void adicionarElementof(List<Integer> lista, Integer elemento);
}
