public class Telefone {
    private int codigoPais;
    private int codigoArea;
    private String numero;

    // a) inicializa todos os campos
    public Telefone(int codigoPais, int codigoArea, String numero) {
        this.codigoPais = codigoPais;
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    // b) inicializa área e número, deixa país = 55
    public Telefone(int codigoArea, String numero) {
        this.codigoPais = 55;
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    // c) inicializa só número, deixa país = 55 e área = 16
    public Telefone(String numero) {
        this.codigoPais = 55;
        this.codigoArea = 16;
        this.numero = numero;
    }

    public String getNumeroCompleto() {
        return "+" + codigoPais + " (" + codigoArea + ") " + numero;
    }
}
