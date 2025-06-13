package Model;

import View.InputHelper;

import java.util.ArrayList;
public abstract class Extras {

    static ArrayList<Extras> listaExtras = new ArrayList<Extras>();

    public static void mostrarItensExtrasDaCompra() {
        InputHelper.InputText("------------------------------------------");
        if (listaExtras.isEmpty()) {
            System.out.println("| Nenhum item extra cadastrado.");
        } else {
            System.out.println("| Lista de itens extras:");
            for (int i = 0; i < listaExtras.size(); i++) {
                if (listaExtras.get(i) instanceof Cartao){
                    Cartao cartao = (Cartao) listaExtras.get(i);
                    InputHelper.InputText("| " + (i + 1) + " - Cartão (Cor: " + cartao.getCorDoTexto() + ")");
                }
                if (listaExtras.get(i) instanceof Bebida){
                    Bebida bebida = (Bebida) listaExtras.get(i);
                    InputHelper.InputText("| " + (i + 1) + " - Bebida (Nome: " + bebida.getNome() + ")");
                }
                if (listaExtras.get(i) instanceof Chocolate){
                    Chocolate chocolate = (Chocolate) listaExtras.get(i);
                    InputHelper.InputText("| " + (i + 1) + " - Chocolate (Sabor: " + chocolate.getSabor() + ")");
                }
                if (listaExtras.get(i) instanceof Pelucia){
                    Pelucia pelucia = (Pelucia) listaExtras.get(i);
                    InputHelper.InputText("| " + (i + 1) + " - Pelúcia (Nome: " + pelucia.getNome() + ")");
                }
            }
        }
    }

    public static void escolherItem() {
        if (listaExtras.isEmpty()) {
            System.out.println("| Nenhum item extra disponível para escolher.");
            return;
        }

        mostrarItensExtrasDaCompra();

        int escolha = InputHelper.pegarNumeroInt("| Digite o número do item que deseja escolher: ") - 1;

        if (escolha >= 0 && escolha < listaExtras.size()) {
            Extras itemEscolhido = listaExtras.get(escolha);
            System.out.println("| Você escolheu: ");

            if (itemEscolhido instanceof Cartao) {
                Cartao cartao = (Cartao) itemEscolhido;
                System.out.println("| Cartão - Cor do Texto: " + cartao.getCorDoTexto());
            } else if (itemEscolhido instanceof Bebida) {
                Bebida bebida = (Bebida) itemEscolhido;
                System.out.println("| Bebida - Nome: " + bebida.getNome());
            } else if (itemEscolhido instanceof Chocolate) {
                Chocolate chocolate = (Chocolate) itemEscolhido;
                System.out.println("| Chocolate - Sabor: " + chocolate.getSabor());
            } else if (itemEscolhido instanceof Pelucia) {
                Pelucia pelucia = (Pelucia) itemEscolhido;
                System.out.println("| Pelúcia - Nome: " + pelucia.getNome());
            } else {
                System.out.println("| Tipo de item desconhecido.");
            }

        } else {
            System.out.println("| Escolha inválida. Tente novamente.");
        }
    }
}
