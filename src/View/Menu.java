package View;

import Control.ControleCompra;
import Model.Produto;

import java.util.List;

public class Menu {

    private static ControleCompra controleCompra = new ControleCompra();
    private static Produto produtos = new Produto() {};
    public static void MenuPrincipal() {
        while (true) {
            InputHelper.InputText("----------------");
            InputHelper.InputText("1-Venda");
            InputHelper.InputText("2-Relatório de Venda");
            InputHelper.InputText("0-Sair");
            int opcao = InputHelper.pegarNumeroInt("Escolha uma opção: ");
            InputHelper.InputText("----------------");

            switch (opcao) {
                case 1:
                    menuVenda();
                    break;
                case 2:
                    mostrarRelatorioVenda();
                    break;
                case 0:
                    InputHelper.InputText("Saindo... Até a próxima flor! ");
                    return;
                default:
                    InputHelper.InputText("Opção inválida. Tente novamente.");
            }
        }

    }
    public static void menuVenda() {
        while (true) {
            InputHelper.InputText("----------------");
            InputHelper.InputText("Menu de Venda");
            InputHelper.InputText("1- Escolha de Flor Única");
            InputHelper.InputText("2- Escolha de Buquê");
            InputHelper.InputText("3- Escolha de Arranjo");
            InputHelper.InputText("4- Escolha de Extras (Folhagem, Bebida, Chocolate, Ursinho, Cartão)");
            InputHelper.InputText("0- Voltar ao Menu Principal");
            int opcao =  InputHelper.pegarNumeroInt("Escolha uma opção de venda: ");

            switch (opcao) {
                case 1:
                    vendaFlorUnica();
                    break;
                case 2:
                    vendaBuque();
                    break;
                case 3:
                    vendaArranjo();
                    break;
                case 4:
                    menuEscolhaExtras();
                    break;
                case 0:
                    InputHelper.InputText("Voltando ao Menu Principal.");
                    return;
                default:
                    InputHelper.InputText("Opção inválida. Tente novamente.");



            }}}
    private static void vendaFlorUnica() {


    }

    private static void vendaBuque() {

    }

    private static void vendaArranjo() {

    }

    private static void menuEscolhaExtras(){


    }

    private static void adicionarExtrasAoPedido(List<Object> itens) {
        while (true) {
            InputHelper.InputText("\n--- Adicionar Extras ---");
            InputHelper.InputText("1- Bebida");
            InputHelper.InputText("2- Chocolate");
            InputHelper.InputText("3- Folhagem");
            InputHelper.InputText("4- Ursinho (Pelúcia)");
            InputHelper.InputText("5- Cartão");
            InputHelper.InputText("0- Concluir adição de Extras");
            int opcao =  InputHelper.pegarNumeroInt("Escolha um extra para adicionar: ");

            switch (opcao) {
                case 1:

                    escolherBebida(itens);
                    break;
                case 2:
                    escolherChocolate(itens);
                    break;
                case 3:
                    escolherFolhagem(itens);
                    break;
                case 4:
                    escolherPelucia(itens);
                    break;
                case 5:

                    break;

                case 0:
                    InputHelper.InputText("Concluindo adição de extras.");
                    return;
                default:
                    InputHelper.InputText("Opção inválida. Tente novamente.");

            }}}
    private static void escolherBebida(List<Object> itens) {
        List<Model.Bebida> listaBebidas = produtos.obterListab();
        InputHelper.InputText(" Escolha uma Bebida");
        for (int i = 0; i < listaBebidas.size(); i++) {
            InputHelper.InputText((i + 1) + "- " + listaBebidas.get(i).toString());
        }
        int escolha = InputHelper.pegarNumeroNaRange("Digite o número da bebida: ", 1, listaBebidas.size());
        itens.add(listaBebidas.get(escolha - 1));
        InputHelper.InputText("Bebida adicionada!");
    }
    private static void escolherChocolate(List<Object> itens) {
        List<Model.Chocolate> ListadeChocolates = produtos.obterListac();
        InputHelper.InputText(" Escolha um Chocolate");
        for (int i = 0; i < ListadeChocolates.size(); i++) {
            InputHelper.InputText((i + 1) + "- " + ListadeChocolates.get(i).toString());
        }
        int escolha = InputHelper.pegarNumeroNaRange("Digite o número da bebida: ", 1, ListadeChocolates.size());
        itens.add(ListadeChocolates.get(escolha - 1));
        InputHelper.InputText("Bebida adicionada!");
    }

    private static void escolherFolhagem(List<Object> itens) {
        List<Model.Folhagems> listaFolhagems = produtos.obterListaf();
        InputHelper.InputText("\n--- Escolha uma Folhagem ---");
        for (int i = 0; i < listaFolhagems.size(); i++) {
            InputHelper.InputText((i + 1) + "- " + listaFolhagems.get(i).getTipo() + " - R$" + listaFolhagems.get(i).getPreco());
        }
        int escolha = InputHelper.pegarNumeroNaRange("Digite o número da folhagem: ", 1, listaFolhagems.size());
        itens.add(listaFolhagems.get(escolha - 1));
        InputHelper.InputText("Folhagem adicionada!");
    }

    private static void escolherPelucia(List<Object> itens) {
        List<Model.Pelucia> listaPelucias = produtos.obterListap();
        InputHelper.InputText("\n--- Escolha um Ursinho (Pelúcia) ---");
        for (int i = 0; i < listaPelucias.size(); i++) {
            InputHelper.InputText((i + 1) + "- " + listaPelucias.get(i).getNome() + " - R$" + listaPelucias.get(i).getPreco());
        }
        int escolha = InputHelper.pegarNumeroNaRange("Digite o número do ursinho: ", 1, listaPelucias.size());
        itens.add(listaPelucias.get(escolha - 1));
        InputHelper.InputText("Ursinho adicionado!");
    }
    private static void mostrarRelatorioVenda() {

    }
}





