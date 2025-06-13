package View;

import Control.ControleCompra;
import Model.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private static ControleCompra controleCompra = new ControleCompra();
    public static Produto produtos = new Produto() {};
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
        List<Object> itensVendaAtual = new ArrayList<>();
        double valorTotalAtual = 0.0;
        while (true) {
            InputHelper.InputText("-------------------------------------------------------------------");
            InputHelper.InputText("Menu de Venda");
            InputHelper.InputText("1- Escolha de Flor Única");
            InputHelper.InputText("2- Escolha de Buquê");
            InputHelper.InputText("3- Escolha de Arranjo");
            InputHelper.InputText("4- Escolha de Extras (Folhagem, Bebida, Chocolate, Ursinho, Cartão)");
            InputHelper.InputText("5- Finalizar Venda");
            InputHelper.InputText("0- Voltar ao Menu Principal");
            int opcao =  InputHelper.pegarNumeroInt("Escolha uma opção de venda: ");
            InputHelper.InputText("-------------------------------------------------------------------");
            switch (opcao) {
                case 1:
                    Flor florUnica = vendaFlorUnica();
                    if (florUnica != null) {
                        itensVendaAtual.add(florUnica);
                        valorTotalAtual += florUnica.getPrecoUnidade();
                        InputHelper.InputText("Flor única adicionada!");
                    }
                    InputHelper.InputText("-------------------------------------------------------------------");
                    break;
                case 2:
                    Buque novoBuque = vendaBuque();
                    if (novoBuque != null) {
                        itensVendaAtual.add(novoBuque);
                        valorTotalAtual += novoBuque.calcularPrecoTotal();
                        InputHelper.InputText("Buquê adicionado!");
                    }
                    InputHelper.InputText("-------------------------------------------------------------------");
                    break;
                case 3:
                    Arranjo novoArranjo = vendaArranjo();
                    if (novoArranjo != null) {
                        itensVendaAtual.add(novoArranjo);
                        valorTotalAtual += novoArranjo.calcularPrecoTotal();
                        InputHelper.InputText("Arranjo adicionado!");
                    }
                    InputHelper.InputText("-------------------------------------------------------------------");
                    break;
                case 4:
                    adicionarExtras(itensVendaAtual);
                    InputHelper.InputText("-------------------------------------------------------------------");
                    break;
                case 5:
                    if (!itensVendaAtual.isEmpty()) {
                        InputHelper.InputText("Total da venda: R$" + String.format("%.2f", valorTotalAtual));
                        boolean confirmar = InputHelper.pegarBoolean("Confirmar venda?");
                        if (confirmar) {
                            controleCompra.RegistarVenda(itensVendaAtual, valorTotalAtual);
                            InputHelper.InputText("Venda concluída! Gerando relatório...");
                            mostrarRelatorioVenda();
                            return;
                        } else {
                            InputHelper.InputText("Venda cancelada.");
                            return;
                        }
                    } else {
                        InputHelper.InputText("Nenhum item na venda para finalizar.");
                    }
                    InputHelper.InputText("-------------------------------------------------------------------");
                    break;
                case 0:
                    InputHelper.InputText("Venda cancelada. Retornando ao Menu Principal.");
                    return;
                default:
                    InputHelper.InputText("Opção inválida. Tente novamente.");
            }
        }
    }




    private static Flor vendaFlorUnica() {
        List<Model.Flor> listaDeFlores = produtos.obterListaFlores();
        InputHelper.InputText("-------------------------");
        InputHelper.InputText(" Escolha uma Flor Única");
        Buque.mostrarFlores(listaDeFlores);
        int escolha = InputHelper.pegarNumeroNaRange("Digite o número da flor: ", 1, listaDeFlores.size());
        Flor florEscolhida = listaDeFlores.get(escolha - 1);
        InputHelper.InputText("-------------------------");

        return florEscolhida;
    }

    private static Buque vendaBuque() {
        List<Flor> floresDoBuque = new ArrayList<>();

        while (true) {
            InputHelper.InputText("-------------------------");
            InputHelper.InputText("Montar Buquê");
            InputHelper.InputText("1- Adicionar Flor");
            InputHelper.InputText("2- Finalizar Buquê");
            int opcaoBuque = InputHelper.pegarNumeroInt("Escolha uma opção: ");
            InputHelper.InputText("-------------------------");


            if (opcaoBuque == 1) {
                List<Model.Flor> listaDeFlores = produtos.obterListaFlores();
                Buque.mostrarFlores(listaDeFlores);
                int escolhaFlor = InputHelper.pegarNumeroNaRange("Digite o número da flor para adicionar ao buquê: ", 1, listaDeFlores.size());
                floresDoBuque.add(listaDeFlores.get(escolhaFlor - 1));
                InputHelper.InputText("Flor adicionada ao buquê!");
            } else if (opcaoBuque == 2) {
                if (floresDoBuque.isEmpty()) {
                    InputHelper.InputText("O buquê precisa ter pelo menos uma flor!");
                    continue;
                }
                Buque novoBuque = new Buque(floresDoBuque, 75);
                InputHelper.InputText("Buquê montado. Preço total: R$" + novoBuque.calcularPrecoTotal());
                InputHelper.InputText("-------------------------");

                return novoBuque;
            } else {
                InputHelper.InputText("Opção inválida.");
            }
        }
    }


    private static Arranjo vendaArranjo() {
        List<Flor> floresDoArranjo = new ArrayList<>();

        Arranjo novoArranjo = new Arranjo(new ArrayList<>(), 120);

        while (true) {
            InputHelper.InputText("----------------------------------");
            InputHelper.InputText("Montar Arranjo");
            InputHelper.InputText("1- Adicionar Flor");
            InputHelper.InputText("2- Adicionar Vaso (R$200)");
            InputHelper.InputText("3- Adicionar Espuma Floral (R$100)");
            InputHelper.InputText("4- Finalizar Arranjo");
            int opcaoArranjo = InputHelper.pegarNumeroInt("Escolha uma opção: ");

            if (opcaoArranjo == 1) {
                List<Model.Flor> listaDeFlores = produtos.obterListaFlores();
                Buque.mostrarFlores(listaDeFlores);
                int escolhaFlor = InputHelper.pegarNumeroNaRange("Digite o número da flor para adicionar ao arranjo: ", 1, listaDeFlores.size());
                novoArranjo.adicionarFlor(listaDeFlores.get(escolhaFlor - 1));
                InputHelper.InputText("Flor adicionada ao arranjo!");
            } else if (opcaoArranjo == 2) {
                novoArranjo.setComVaso(true);
                InputHelper.InputText("Vaso adicionado!");

            } else if (opcaoArranjo == 3) {
                novoArranjo.setComVaso(true);
                InputHelper.InputText("Espuma Floral adicionada!");
            } else if (opcaoArranjo == 4) {
                if (novoArranjo.getFlores().isEmpty()) {
                    InputHelper.InputText("O arranjo precisa ter pelo menos uma flor!");
                    continue;
                }
                InputHelper.InputText("Arranjo montado. Preço total: R$" + novoArranjo.calcularPrecoTotal());

                InputHelper.InputText("----------------------------------");
                return novoArranjo;
            } else {
                InputHelper.InputText("Opção inválida.");
            }
        }
    }


    private static void adicionarExtras(List<Object> itens) {
        double valorExtras = 0.0;
        while (true) {
            InputHelper.InputText("-----------------------------");
            InputHelper.InputText("Adicionar Extras");
            InputHelper.InputText("1- Bebida");
            InputHelper.InputText("2- Chocolate");
            InputHelper.InputText("3- Folhagem");
            InputHelper.InputText("4- Ursinho (Pelúcia)");
            InputHelper.InputText("5- Cartão");
            InputHelper.InputText("0- Concluir adição de Extras");
            int opcao =  InputHelper.pegarNumeroInt("Escolha um extra para adicionar: ");
            InputHelper.InputText("-----------------------------");
            switch (opcao) {
                case 1:
                    Bebida bebida = escolherBebida();
                    if (bebida != null) {
                        itens.add(bebida);

                        valorExtras += bebida.getPreco();
                        InputHelper.InputText("Bebida adicionada!");
                    }
                    InputHelper.InputText("-----------------------------");
                    break;
                case 2:
                    Chocolate chocolate = escolherChocolate();
                    if (chocolate != null) {
                        itens.add(chocolate);
                        valorExtras += chocolate.getPreco();
                        InputHelper.InputText("Chocolate adicionado!");
                    }
                    InputHelper.InputText("-----------------------------");
                    break;
                case 3:
                    Folhagems folhagem = escolherFolhagem();
                    if (folhagem != null) {
                        itens.add(folhagem);
                        valorExtras += Double.parseDouble(folhagem.getPreco());
                        InputHelper.InputText("Folhagem adicionada!");
                    }
                    InputHelper.InputText("-----------------------------");
                    break;
                case 4:
                    Pelucia pelucia = escolherPelucia();
                    if (pelucia != null) {
                        itens.add(pelucia);
                        valorExtras += pelucia.getPreco();
                        InputHelper.InputText("Ursinho adicionado!");
                    }InputHelper.InputText("-----------------------------");
                    break;
                case 5:
                    Cartao cartao = escolherCartao();
                    if (cartao != null) {
                        itens.add(cartao);
                        InputHelper.InputText("Cartão adicionado!");
                    }
                    InputHelper.InputText("-----------------------------");
                    break;

                case 0:
                    InputHelper.InputText("Concluindo adição de extras.");
                    return;
                default:
                    InputHelper.InputText("Opção inválida. Tente novamente.");

            }}}
    private static Bebida escolherBebida() {
        List<Model.Bebida> listaDeBebidas = produtos.obterListab();
        InputHelper.InputText(" Escolha uma Bebida");
        for (int i = 0; i < listaDeBebidas.size(); i++) {
            InputHelper.InputText((i + 1) + "- " + listaDeBebidas.get(i).toString());
        }
        int escolha = InputHelper.pegarNumeroNaRange("Digite o número da bebida: ", 1, listaDeBebidas.size());
        return listaDeBebidas.get(escolha - 1);
    }

    private static Chocolate escolherChocolate() {
        List<Model.Chocolate> ListadeChocolates = produtos.obterListac();
        InputHelper.InputText(" Escolha um Chocolate");
        for (int i = 0; i < ListadeChocolates.size(); i++) {
            InputHelper.InputText((i + 1) + "- " + ListadeChocolates.get(i).getSabor() + " - R$" + ListadeChocolates.get(i).getPreco());
        }
        int escolha = InputHelper.pegarNumeroNaRange("Digite o número do chocolate: ", 1, ListadeChocolates.size());
        return ListadeChocolates.get(escolha - 1);
    }

    private static Folhagems escolherFolhagem() {
        List<Model.Folhagems> listaFolhagems = produtos.obterListaf();
        InputHelper.InputText("\n--- Escolha uma Folhagem ---");
        for (int i = 0; i < listaFolhagems.size(); i++) {
            InputHelper.InputText((i + 1) + "- " + listaFolhagems.get(i).getTipo() + " - R$" + listaFolhagems.get(i).getPreco());
        }
        int escolha = InputHelper.pegarNumeroNaRange("Digite o número da folhagem: ", 1, listaFolhagems.size());
        return listaFolhagems.get(escolha - 1);
    }

    private static Pelucia escolherPelucia() {
        List<Model.Pelucia> listaPelucias = produtos.obterListap();
        InputHelper.InputText("\n--- Escolha um Ursinho (Pelúcia) ---");
        for (int i = 0; i < listaPelucias.size(); i++) {
            InputHelper.InputText((i + 1) + "- " + listaPelucias.get(i).getNome() + " - R$" + listaPelucias.get(i).getPreco());
        }
        int escolha = InputHelper.pegarNumeroNaRange("Digite o número da pelúcia: ", 1, listaPelucias.size());
        return listaPelucias.get(escolha - 1);
    }

    private static Cartao escolherCartao() {
        // Criar um novo cartão sempre que solicitado
        return Cartao.criarCartao(); // Supondo que Cartao.criarCartao() retorna um novo objeto Cartao
    }


    public static void mostrarRelatorioVenda() {
        InputHelper.InputText("\n--- Relatório de Vendas ---");
        List<Model.Pedido> listaPedidos = controleCompra.getPedidos();

        if (listaPedidos.isEmpty()) {
            InputHelper.InputText("Nenhuma venda registrada ainda.");
            return;
        }

        for (int i = 0; i < listaPedidos.size(); i++) {
            Model.Pedido pedido = listaPedidos.get(i);
            InputHelper.InputText("\nPedido #" + (i + 1));
            InputHelper.InputText("Data: " + pedido.getData());
            InputHelper.InputText("Status: " + pedido.getStatusDoPedido());
            InputHelper.InputText("Valor Total: R$" + String.format("%.2f", pedido.getValorTotal()));
            InputHelper.InputText("Itens Vendidos:");
            for (Object item : pedido.getItensVendidos()) {
                if (item instanceof Flor) {
                    Flor flor = (Flor) item;
                    InputHelper.InputText("  - Flor: " + flor.getClass().getSimpleName() + " (R$" + flor.getPrecoUnidade() + ")");
                } else if (item instanceof Buque) {
                    Buque buque = (Buque) item;
                    InputHelper.InputText("  - Buquê (R$" + buque.calcularPrecoTotal() + ")");

                } else if (item instanceof Arranjo) {
                    Arranjo arranjo = (Arranjo) item;
                    InputHelper.InputText("  - Arranjo (R$" + arranjo.calcularPrecoTotal() + ")");

                } else if (item instanceof Bebida) {
                    Bebida bebida = (Bebida) item;
                    InputHelper.InputText("  - Bebida: " + bebida.getNome() + " (R$" + bebida.getPreco() + ")");
                } else if (item instanceof Chocolate) {
                    Chocolate chocolate = (Chocolate) item;
                    InputHelper.InputText("  - Chocolate: " + chocolate.getSabor() + " (R$" + chocolate.getPreco() + ")");
                } else if (item instanceof Pelucia) {
                    Pelucia pelucia = (Pelucia) item;
                    InputHelper.InputText("  - Pelúcia: " + pelucia.getNome() + " (R$" + pelucia.getPreco() + ")");
                } else if (item instanceof Cartao) {
                    Cartao cartao = (Cartao) item;
                    InputHelper.InputText("  - Cartão: Frase: \"" + cartao.getFrase() + "\" (Cor: " + cartao.getCorDoTexto() + ")");
                } else if (item instanceof Folhagems) {
                    Folhagems folhagem = (Folhagems) item;
                    InputHelper.InputText("  - Folhagem: " + folhagem.getTipo() + " (R$" + folhagem.getPreco() + ")");
                }
            }
            InputHelper.InputText("----------------------------");
        }
    }
}
