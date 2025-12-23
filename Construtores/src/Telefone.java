public class Telefone {
    private int codigoPais;
    private int codigoArea;
    private String numero;

    // 3 construtor: inicializa só o número, usando padrões (55 e 16)
    public Telefone(String numero) {
        this.codigoPais = 55;
        this.codigoArea = 16;
        this.numero = numero;
    }

    //  2 construtor: inicializa código de área e número, país padrão (55)
    public Telefone(int codigoArea, String numero) {
        this.codigoPais = 55;
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    //  1 construtor: inicializa todos os campos
    public Telefone(int codigoPais, int codigoArea, String numero) {
        this.codigoPais = codigoPais;
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    public String getNumeroCompleto(){
        return "+" + codigoPais + " (" + codigoArea + ") " + numero;
    }

    public void mostrarDados() {
        System.out.println("Número completo: " + getNumeroCompleto());
    }
}
