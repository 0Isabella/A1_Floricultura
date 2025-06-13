
package Model;

import View.InputHelper;

import java.util.List;
import java.util.ArrayList;

public class Buque {
    private List<Flor> flores;
    private int precoBase;

    public Buque(List<Flor> flores, int precoBase) {
        this.flores = new ArrayList<>(flores);
        this.precoBase = 75;
    }
    public List<Flor> getFlores() {
        return flores;
    }

    public static void mostrarFlores(List<Flor> flores){
        InputHelper.InputText("|1 Amarilis - R$100");
        InputHelper.InputText("|2 Camélia Japônica - R$63.90");
        InputHelper.InputText("|3 Coração Sangrento - R$100");
        InputHelper.InputText("|4 Dália Galática - R$30");
        InputHelper.InputText("|5 Flor de Cera- R$35");
        InputHelper.InputText("|6 Flor de Maio - R$35");
        InputHelper.InputText("|7 Flor Esqueleto - R$50");
        InputHelper.InputText("|8 Hatiorarosea - R$80");
        InputHelper.InputText("|9 Lantana - R$25");
        InputHelper.InputText("|10 Lírio Asiático - R$65");
        InputHelper.InputText("|11 Lírio de Aranha Vermelha - R$45");
        InputHelper.InputText("|12 Lírio Stargazer - R$70");
        InputHelper.InputText("|13 Orquídea Fantasma - R$150");
        InputHelper.InputText("|14 Orquídea Sapatinho - R$100");
        InputHelper.InputText("|15 Orquídea Garça Branca - R$200");
        InputHelper.InputText("|16 RosaJuliet - 700R$");
        InputHelper.InputText("|17 Trobetas dos Anjos - R$43");
    }

    public void adicionarFlor(Flor flor) {
        getFlores().add(flor);
    }

    public void removerFlor(Flor flor) {
        getFlores().remove(flor);
    }
    public int calcularPrecoTotal() {
        int precoFlores = flores.stream().mapToInt(Flor::getPrecoUnidade).sum();
        return precoBase + precoFlores;
    }
}
