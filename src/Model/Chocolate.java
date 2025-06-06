package Model;

public class Chocolate {
    public String sabor;
    public float preco;
    public String marca;

    public Chocolate(String nome, String tipo, float preco, String marca) {
        this.sabor = sabor;
        this.preco = preco;
        this.marca = marca;
    }

    public String getSabor() {
        return sabor;
    }

    public float getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
