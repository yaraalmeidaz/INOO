public class Livro {
    String titulo;
    String descricao;
    double valor;
    String isbn;
    Autor autor;
    double pagina;
    String editora;
    boolean possuiAutor(){
        if(autor != null){
            return true;
        }else{
            return false;
        }
    }

    void mostrarDetalhes(){
        //this amarra o codigo
        System.out.println(this.titulo);
        System.out.println(this.descricao);
        System.out.println(this.valor);
        System.out.println(this.isbn);
        if(possuiAutor()){
            autor.mostrarDetalhes();
        }
        System.out.println("--");
    }
}