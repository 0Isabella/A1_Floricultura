package Model;

public class Chocolate {
    private String sabor;
    private String tipo;
    private float preco;
    private String marca;

    public Chocolate(String sabor, String tipo, float preco, String marca) {
        this.sabor = sabor;
        this.tipo = tipo;
        this.preco = preco;
        this.marca = marca;
    }

    public String getSabor() {
        return sabor;
    }

    public String getTipo() {
        return tipo;
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

    public  void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
