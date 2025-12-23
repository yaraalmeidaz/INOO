// Classe Livro
public class Livro {
    String titulo;
    String autor;
    String editora;
    int paginas;
    boolean emprestado; // indica se o livro está emprestado

    // Retorna o título
    String getTitulo() {
        return titulo;
    }

    // Retorna a editora
    String getEditora() {
        return editora;
    }

    // Verifica se o livro está emprestado
    boolean estaEmprestado() {
        return emprestado;
    }

    // Método para mostrar detalhes
    void mostrarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Páginas: " + paginas);
        System.out.println("Emprestado? " + (emprestado ? "Sim" : "Não"));
        System.out.println("--");
    }
}

