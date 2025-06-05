package Model;

public class Folhagems {
    private String Tipo;
    private String Preco;

    public Folhagems(String tipo, float preco) {
        this.Tipo = tipo;
        this.Preco = String.valueOf(preco);
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getPreco() {
        return Preco;
    }

    public void setPreco(String preco) {
        Preco = preco;
    }
    @Override

    public String toString(){
        return Tipo+" :"+Preco;
    }
}
