package Model;

public class Funcionario {
    private String nome;
    private String cargo;
    private int idDeAcesso;

    public Funcionario(String nome, String cargo, int idDeAcesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.idDeAcesso = idDeAcesso;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdDeAcesso() {
        return idDeAcesso;
    }

    public void setNome() {
        this.nome = nome;
    }

    public void setCargo() {
        this.cargo = cargo;
    }

    public void setIdDeAcesso() {
        this.idDeAcesso = idDeAcesso;
    }
}