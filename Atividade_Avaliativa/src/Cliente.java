public abstract class Cliente {
    private String nome;
    private int totalCompras;

    public Cliente(String nome) {
        if (nome == null || nome.trim().isEmpty()) {  // Verifica se o nome é vazio ou nulo
            throw new IllegalArgumentException("O nome não pode ser vazio!"); // Lança exceção caso o nome seja inválido
        }
        this.nome = nome;
        this.totalCompras = 0;
    }

    public String getNome() { return nome; }
    public int getTotalCompras() { return totalCompras; }
    public void incrementarCompras() { totalCompras++; }

    public abstract String getIdentificacao(); // CPF ou CNPJ
    public abstract String getTipo();// PF ou PJ
}
