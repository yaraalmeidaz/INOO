import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Livro livro = new Livro();

        System.out.print("Digite o título do livro: ");
        livro.titulo = sc.nextLine();

        System.out.print("Digite o autor: ");
        livro.autor = sc.nextLine();

        System.out.print("Digite a editora: ");
        livro.editora = sc.nextLine();

        System.out.print("Digite o número de páginas: ");
        livro.paginas = sc.nextInt();

        System.out.print("O livro está emprestado? (true/false): ");
        livro.emprestado = sc.nextBoolean();

        livro.mostrarDetalhes();

        sc.close();
    }
}
/*
 Classe principal para testar
 /*
public class CadastroDeLivros {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Introdução a POO";
        livro1.autor = "João Ramalho";
        livro1.editora = "Editora ABC";
        livro1.paginas = 200;
        livro1.emprestado = false;

        Livro livro2 = new Livro();
        livro2.titulo = "POO Avançado";
        livro2.autor = "Maria Silva";
        livro2.editora = "Editora XYZ";
        livro2.paginas = 350;
        livro2.emprestado = true;

        livro1.mostrarDetalhes();
        livro2.mostrarDetalhes();
    }
}*/