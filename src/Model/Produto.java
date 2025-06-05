package Model;

import java.util.ArrayList;

public abstract class Produto implements Bebidas {

    public ArrayList<Bebida>ListadeBebidas;
    public ArrayList<Folhagems>ListadeFolhagem;
    public Produto(){
        ListadeBebidas=new ArrayList<>();
        ListadeBebidas.add(new Bebida("Mauby Fizz","Refrigrente", 53.64F,"é feita a partir da casca da árvore mabí, fervida com ervas e especiarias"));
        ListadeBebidas.add(new Bebida("Yubari King","suco de melão", 153.56f,"Este melão é conhecido por sua doçura excepcional e textura suculenta. É cultivado em condições rigorosas e colhido manualmente, o que contribui para seu alto preço."));
        ListadeBebidas.add(new Bebida("Vinho Italiano Batasiolo Barolo Docg","vinho tinto",430.00f,"esse vinho traz a tipicidade do Barolo, um nobre tinto que destaca a uva Nebbiolo"));
        ListadeBebidas.add(new Bebida(" Bling H2O","água",73.00F," A garrafa em vidro fosco reciclável com tampa de rolha era decorada manualmente com cristais austríacos Swarovski que formavam a palavra BLING"));
        ListadeFolhagem=new ArrayList<>();
        ListadeFolhagem.add(new Folhagems("Folhagem Tuia",20.00F));
        ListadeFolhagem.add(new Folhagems("Folhagem Alecrim",20.00F));
        ListadeFolhagem.add(new Folhagems("Folhagem Moluccella",20.00F));
        ListadeFolhagem.add(new Folhagems("Gipsófilas",20.00F));

    }





}