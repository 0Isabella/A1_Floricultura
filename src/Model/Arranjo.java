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

}