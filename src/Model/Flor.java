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

    private String descricao;

    public Flor(String cor, int precoUnidade, String descricao) {
        this.cor = cor;
        this.precoUnidade = precoUnidade;
        this.descricao = descricao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
