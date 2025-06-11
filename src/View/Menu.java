package View;

import Control.ControleCompra;
import Model.Flor;
import Model.Produto;
import java.util.ArrayList;
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
                    break;
                default:
                    InputHelper.InputText("Opção inválida. Tente novamente.");
            }
        }

    }

    public static void menuVenda() {


    }

    private static void vendaFlorUnica() {

    }

    private static void vendaBuque() {

    }

    private static void vendaArranjo() {

    }

    private static void menuEscolhaExtras() {

    }


    private static void adicionarExtrasAoPedido(List<Object> itens) {

    }

    private static void escolherBebida(List<Object> itens) {

    }

    private static void escolherChocolate(List<Object> itens) {

    }

    private static void escolherFolhagem(List<Object> itens) {

    }

    private static void escolherPelucia(List<Object> itens) {

    }

    private static void mostrarRelatorioVenda() {

            }
}