package Model;

import View.InputHelper;

public class Cartao extends Extras {
    private String frase;
    private String corDoTexto;

    public Cartao() {
        this.frase = solicitarFrase(); //Para pedir quando um novo cartão for criado :D
        this.corDoTexto = solicitarCor();
    }

    /*public Cartao(String frase, String corDoTexto) {
        this.frase = frase;
        this.corDoTexto = corDoTexto;
    }*/

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getCorDoTexto() {
        return corDoTexto;
    }

    public void setCorDoTexto(String corDoTexto) {
        this.corDoTexto = corDoTexto;
    }


    private static String solicitarFrase() {
        InputHelper.InputText("------------------------------------------");
        InputHelper.InputText("| Digite a frase que quer escrever: |");
        String frase = InputHelper.lerString("  -> ");
        InputHelper.InputText("------------------------------------------");
        return frase;
    }

    private static String solicitarCor() {
        InputHelper.InputText("------------------------------------------");
        InputHelper.InputText("| Qual cor de texto deseja?");
        InputHelper.InputText("| Opções: \u001B[31mVermelho\u001B[0m, " + "\u001B[32mverde\u001B[0m, " +
                "\u001B[33mamarelo\u001B[0m, " + "\u001B[34mazul\u001B[0m, " + "\u001B[35mroxo\u001B[0m, " +
                "\u001B[36mciano\u001B[0m, " + "\u001B[37mbranco\u001B[0m, " + "normal"); //Só deixei separado para ser mais fácil de ler dps
        String opcao = InputHelper.lerString("| Opção: ").trim().toLowerCase();
        if (!opcao.matches("vermelho|verde|amarelo|azul|roxo|ciano|branco|normal")){
            opcao = "normal";
        }
        return opcao;
    }

    private static String aplicarCor(String frase, String corDoTexto) {
        switch (corDoTexto) {
            case "vermelho":
                return "\u001B[31m" + frase + "\u001B[0m";
            case "verde":
                return "\u001B[32m" + frase + "\u001B[0m";
            case "amarelo":
                return "\u001B[33m" + frase + "\u001B[0m";
            case "azul":
                return "\u001B[34m" + frase + "\u001B[0m";
            case "roxo":
                return "\u001B[35m" + frase + "\u001B[0m";
            case "ciano":
                return "\u001B[36m" + frase + "\u001B[0m";
            case "branco":
                return "\u001B[37m" + frase + "\u001B[0m";
            default:
                return frase;
        }
    }

    public static void imprimirCartao(Cartao cartao) {
        String textoColorido = aplicarCor(cartao.frase, cartao.corDoTexto);
        InputHelper.InputText("------------------------------------------");
        System.out.println("| Cartão: " + textoColorido);
        InputHelper.InputText("------------------------------------------");
    }

    public static Cartao criarCartao() {
        return new Cartao();
    }

    public static void visualizarCartoes() {
        if (listaExtras.isEmpty()) {
            System.out.println("Nenhum cartão criado ainda!");
            return;
        }
        for (Extras extra : listaExtras) {
            if (extra instanceof Cartao) {
                imprimirCartao((Cartao) extra);
            }
        }
    }
}