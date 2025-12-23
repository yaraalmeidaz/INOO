public class Publicacao {
    private String nome;
    private String assunto;
    private String edicao;
    private Editora editora;

    public Publicacao(String nome, String assunto, String edicao, Editora editora) {
        this.nome = nome;
        this.assunto = assunto;
        this.edicao = edicao;
        this.editora = editora;

        this.editora.incrementarPubs();
    }

    public String getNome() {
        return nome;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getEdicao() {
        return edicao;
    }

    public Editora getEditora() {
        return editora;
    }
}
