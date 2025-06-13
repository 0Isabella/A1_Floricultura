package Model;

import java.util.ArrayList;
import java.util.List;

public abstract class Produto implements Bebidas ,Folhagem,Chocolates,Pelucias {

    public ArrayList<Bebida>ListadeBebidas;
    public ArrayList<Folhagems>ListadeFolhagem;
    public ArrayList<Chocolate> ListadeChocolates;
    public ArrayList<Pelucia> ListadePelucia;

    public static ArrayList<Flor> ListadeFlores;

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
        ListadeChocolates = new ArrayList<>();
        ListadeChocolates.add(new Chocolate("Bombons swiss luxury", "sortido", 175.90F, "lindt"));
        ListadeChocolates.add(new Chocolate("Coleção mil delícias", "trufas com chocolate amargo", 69.90F, "kopenhagen"));
        ListadeChocolates.add(new Chocolate("Caixa bombons sortidos angel coração", "Mil Folhas, Morango com Chocolate, Brigadeiro e Avelã com Leite.", 109.99F, "cacau show"));
        ListadeChocolates.add(new Chocolate("Chocolate vegano", "70% cacau", 117.90F, "nugali"));

        ListadePelucia = new ArrayList<>();
        ListadePelucia.add(new Pelucia("Urso", "balão coração", 99.90F));
        ListadePelucia.add(new Pelucia("Panda", "laço preto", 150.90F));
        ListadePelucia.add(new Pelucia("Coelho", "surpresa cenoura", 49.90F));
        ListadePelucia.add(new Pelucia("Stitch", "gigante", 199.90F));



        ListadeFlores = new ArrayList<>();
        ListadeFlores.add(new Amarillis());
        ListadeFlores.add(new CameliaJaponica());
        ListadeFlores.add(new CoracaoSangrento());
        ListadeFlores.add(new DaliaGalatica());
        ListadeFlores.add(new FlorDeCera());
        ListadeFlores.add(new FlorDeMaio());
        ListadeFlores.add(new FlorEsqueleto());
        ListadeFlores.add(new Hatiorarosea());
        ListadeFlores.add(new Lantana());
        ListadeFlores.add(new LirioAsiatico());
        ListadeFlores.add(new LirioDeAranhaVermelha());
        ListadeFlores.add(new LirioStargazer());
        ListadeFlores.add(new OrquideaFantasma());
        ListadeFlores.add(new OrquideaSapatinho());
        ListadeFlores.add(new OrquídeaGarçaBranca());
        ListadeFlores.add(new RosaJuliet());
        ListadeFlores.add(new TrobetasDosAnjos());


    }

    public void adicionarBebida(Bebida bebida) {
        ListadeBebidas.add(bebida);
    }

    public void adicionarFolhagem(Folhagems folhagem) {
        ListadeFolhagem.add(folhagem);
    }

    public void adicionarChocolate(Chocolate chocolate) {
        ListadeChocolates.add(chocolate);
    }

    public void adicionarPelucia(Pelucia pelucia) {
        ListadePelucia.add(pelucia);
    }

    @Override
    public List<Bebida> obterListab() {
        return ListadeBebidas;
    }

    @Override
    public List<Folhagems> obterListaf() {
        return ListadeFolhagem;
    }

    @Override
    public List<Chocolate> obterListac() {
        return ListadeChocolates;
    }

    @Override
    public List<Pelucia> obterListap() {
        return ListadePelucia;
    }




    public static List<Flor> obterListaFlores() {
        return ListadeFlores;
    }

}