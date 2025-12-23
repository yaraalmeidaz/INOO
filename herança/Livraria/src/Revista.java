public class Revista extends Publicacao {
    private String periodicidade;

    public Revista(String nome, String assunto, String edicao, Editora editora, String periodicidade) {
        super(nome, assunto, edicao, editora);
        this.periodicidade = periodicidade;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }
}
