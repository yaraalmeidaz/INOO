public class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("zzzzz");
    }
    public void subirEmArvore(){
        System.out.println("Subir em arvore");
    }
}