public class Perfumaria extends Produto{
    private String marca;
    private String volume;
    private String publicoAlvo;

    public Perfumaria(String nome, double preco, int quantidade, String marca, String volume, String publicoAlvo) {
        super(nome, preco, quantidade);
        this.marca = marca;
        this.volume = volume;
        this.publicoAlvo = publicoAlvo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getPublicoAlvo() {
        return publicoAlvo;
    }

    public void setPublicoAlvo(String publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

    @Override
    public String toString() {
        return super.toString() + "| Marca: " + marca + "| Volume: " + volume + "| publico: " + publicoAlvo;
    }
}
