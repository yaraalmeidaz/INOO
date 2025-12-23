public class EnsinoBasico extends Funcionario {
    private String escolaBasico;

    public EnsinoBasico(String nome, int codigo, String escolaBasico) {
        super(nome, codigo);
        this.escolaBasico = escolaBasico;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.1; // +10%
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Ensino básico: " + escolaBasico);
    }
}
