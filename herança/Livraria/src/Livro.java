public class Livro extends Publicacao {
    private String[] autores;

    public Livro(String nome, String assunto, String edicao, Editora editora, String[] autores) {
        super(nome, assunto, edicao, editora);
        this.autores = autores;
    }

    public String[] getAutores() {
        return autores;
    }
}
