public class Contato{
    private String nome;
    private String sobrenome;
    private Telefone telefone; //com os dados do Telefone

    //1º) Nome, sobrenome e número do telefone
    public Contato(String nome, String sobrenome, String numero){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = new Telefone(numero);
    }

    // 2) Nome, sobrenome, área e número
    public Contato(String nome, String sobrenome, int codigoArea, String numero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = new Telefone(codigoArea, numero);
    }

    // 3) Nome, sobrenome, país, área e número
    public Contato(String nome, String sobrenome, int codigoPais, int codigoArea, String numero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = new Telefone(codigoPais, codigoArea, numero);
    }

    // 4) Nome, sobrenome e objeto Telefone já pronto
    public Contato(String nome, String sobrenome, Telefone telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    public void mostrarContato() {
        System.out.println(nome + " " + sobrenome + " - " + telefone.getNumeroCompleto());
    }
}
