package Model;

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
        for (int i = 0; i < flores.size(); i++) {
            Flor flor = flores.get(i);
            System.out.printf("%d - %s | Cor: %s | Preço: R$%d | Tamanho: %s%n",
                    i + 1,
                    flor.getClass().getSimpleName(),
                    flor.getCor(),
                    flor.getPrecoUnidade(),
                    flor.getTamanho());
        }
    }

    public void setFlores(List<Flor> flores) {
        //flores.add(new FlorEsqueleto(FlorEsqueleto));
    }

    public void adicionarFlor(Flor flor) {
        getFlores().add(flor);
    }

    public void removerFlor(Flor flor) {
        getFlores().remove(flor);
    }
}
