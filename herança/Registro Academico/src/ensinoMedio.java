public class EnsinoMedio extends EnsinoBasico {
    private String escolaMedio;

    public EnsinoMedio(String nome, int codigo, String escolaBasico, String escolaMedio) {
        super(nome, codigo, escolaBasico);
        this.escolaMedio = escolaMedio;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.6; // 10% básico + 50% médio
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Ensino médio: " + escolaMedio);
    }
}
