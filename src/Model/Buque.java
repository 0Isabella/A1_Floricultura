
package Model;

import View.InputHelper;

import java.util.List;

public class Buque {
    private List<Flor> flores;
    private int precoBase;

    public Buque(List<Flor> flores, int precoBase) {
        this.flores = flores;
        this.precoBase = 75;
    }
    public List<Flor> getFlores() {
        return flores;
    }

    public static void mostrarFlores(List<Flor> flores){
        InputHelper.InputText("| Amarilis - R$100");
        InputHelper.InputText("| Camélia Japônica - R$63.90");
        InputHelper.InputText("| Coração Sangrento - R$100");
        InputHelper.InputText("| Dália Galática - R$30");
        InputHelper.InputText("| Flor de Cera- R$35");
        InputHelper.InputText("| Flor de Maio - R$35");
        InputHelper.InputText("| Flor Esqueleto - R$50");
        InputHelper.InputText("| Hatiorarosea - R$80");
        InputHelper.InputText("| Lantana - R$25");
        InputHelper.InputText("| Lírio Asiático - R$65");
        InputHelper.InputText("| Lírio de Aranha Vermelha - R$45");
        InputHelper.InputText("| Lírio Stargazer - R$70");
        InputHelper.InputText("| Orquídea Fantasma - R$150");
        InputHelper.InputText("| Orquídea Sapatinho - R$100");
        InputHelper.InputText("| Orquídea Garça Branca - R$200");
        InputHelper.InputText("| RosaJuliet - 700R$");
        InputHelper.InputText("| Trobetas dos Anjos - R$43");
    }

    public void adicionarFlor(Flor flor) {
        getFlores().add(flor);
    }

    public void removerFlor(Flor flor) {
        getFlores().remove(flor);
    }
}
