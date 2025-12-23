public abstract class Funcionario {
    private String nome;
    private int codigo;
    protected double salarioBase = 1000;

    public Funcionario(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() { return nome; }
    public int getCodigo() { return codigo; }

    // Cada subclasse implementa seu cálculo de salário
    public abstract double calcularSalario();

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Salário: " + calcularSalario());
    }
}
