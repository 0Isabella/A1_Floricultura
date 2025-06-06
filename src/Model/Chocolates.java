package Model;

import java.util.List;

public interface Chocolates {
    abstract List<Chocolate> obterListac();
    void adicionarElementoc(List<Integer> lista, Integer elemento);
}