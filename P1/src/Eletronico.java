public class Eletronico extends Produto{
    private String marca;
    private String voltagem;

    public Eletronico(String nome, double preco, int quantidade, String marca, String voltagem) {
        super(nome, preco, quantidade);
        this.marca = marca;
        this.voltagem = voltagem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return super.toString() + " | Marca: " + marca + " | Voltagem: " + voltagem;
    }
}
