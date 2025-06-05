package Model;

public abstract class Flor {
    private String cor;
    private int precoUnidade;
    private enum tamanho{
        PEQUENO,
        MEDIO,
        GRANDE,
        CONJUNTO; //Como Flor de Cera e Hoya Bella
    }

    public Flor(String cor, int precoUnidade) {
        this.cor = cor;
        this.precoUnidade = precoUnidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPrecoUnidade() {
        return precoUnidade;
    }
    public void setPrecoUnidade(int precoUnidade) {
        this.precoUnidade = precoUnidade;
    }
}
