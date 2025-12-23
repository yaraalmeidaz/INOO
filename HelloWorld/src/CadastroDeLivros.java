public class CadastroDeLivros {
    public static void main(String[]args){
        Livro livro = new Livro();
        livro.nome = "Introdução a POO";
        livro.descricao = "Aprendendo a programação orientada a objetos";
        livro.valor = 59.90;
        livro.isbn = "978-8588062894";

        System.out.println(livro.nome);
        System.out.println(livro.descricao);
        System.out.println(livro.valor);
        System.out.println(livro.isbn);


        Livro outroLivro = new Livro();
        outroLivro.nome = "POO: Uma abordagem abrangente";
        outroLivro.descricao = "Outro livro que aborda POO";
        outroLivro.valor = 39.90;
        outroLivro.isbn = "123-765283748";

        System.out.println(outroLivro.nome);
        System.out.println(outroLivro.descricao);
        System.out.println(outroLivro.valor);
        System.out.println(outroLivro.isbn);

    }

}
