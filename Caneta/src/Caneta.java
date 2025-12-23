public class Caneta {
    String cor;
    int carga; // quantidade de tinta
    boolean tampa;
    String tipo;

    // Método para escrever uma palavra
    void escrever(String palavra) {
        if(carga >= palavra.length()) {
            System.out.println(palavra);
            carga -= palavra.length(); // cada letra gasta 1 unidade
        } else {
            System.out.println("Não há tinta suficiente!");
        }
    }

    void mostrarDetalhes() {
        System.out.println("Cor: " + cor);
        System.out.println("Tipo: " + tipo);
        System.out.println("Carga: " + carga);
        System.out.println("Tampa fechada? " + (tampa ? "Sim" : "Não"));
        System.out.println("--");
    }
}
