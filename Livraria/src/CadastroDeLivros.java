public class CadastroDeLivros {

    public static void main(String[] args) {

        Autor autorLivro = new Autor();
        autorLivro.email ="autor@email.com";
        autorLivro.nome = "João Ramalho";
        autorLivro.cpf = "123456789";

        Livro livro = new Livro();
        livro.titulo = "Introdução a POO";
        livro.descricao = "Aprendendo a programação orientada a objetos";
        livro.valor = 59.90;
        livro.isbn = "978-8588062894";
        livro.pagina = 314;
        livro.editora = "Saraiva";

        livro.autor = autorLivro;

        livro.mostrarDetalhes();

        Livro outroLivro = new Livro();
        outroLivro.titulo = "POO: Uma abordagem abrangente";
        outroLivro.descricao = "Outro livro que aborda POO";
        outroLivro.valor = 39.90;
        outroLivro.isbn = "123-765283748";


        outroLivro.mostrarDetalhes();
    }
}