package Model;

import java.util.ArrayList;

public abstract class Produto implements Bebidas {

    public ArrayList<Bebida>ListadeBebidas;
    public Produto(){
        ListadeBebidas=new ArrayList<>();
        ListadeBebidas.add(new Bebida("Coca-cola","Refrigrente", 7.90F));
    }



}