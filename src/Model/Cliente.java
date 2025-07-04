package Model;

public class Cliente {
    private String nome;
    private String endereco;
    private int telefone;

    public Cliente(String nome, String endereco, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return endereco;
    }

    public int getPreco() {
        return telefone;
    }

    public void setNome() {
        this.nome = nome;
    }

    public void setEndereco() {
        this.endereco = endereco;
    }

    public void setTelefone() {
        this.telefone = telefone;
    }
}
