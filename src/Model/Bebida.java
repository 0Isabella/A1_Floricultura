package Model;

public class Bebida extends Extras {
    private String nome;
    private String tipo;
    private float preco;
    private String descricao;

    public Bebida(String nome,String tipo,float preco,String descricao) {
        this.nome = nome;
        this.tipo=tipo;
        this.preco=preco;
        this.descricao=descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override

    public String toString(){
        return nome +" ("+ tipo+") "+ preco+" ("+descricao;
    }
}
