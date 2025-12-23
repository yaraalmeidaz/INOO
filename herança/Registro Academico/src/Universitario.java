public class Universitario extends EnsinoMedio {
    private String universidade;

    public Universitario(String nome, int codigo, String escolaBasico, String escolaMedio, String universidade) {
        super(nome, codigo, escolaBasico, escolaMedio);
        this.universidade = universidade;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 2.6; // 10% básico + 50% médio + 100% universidade
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Universidade: " + universidade);
    }
}
