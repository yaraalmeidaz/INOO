public class PessoaFisica extends Cliente {
    private String cpf;

    // Construtor da classe PessoaFisica, chama o construtor da classe Cliente para validar o nome
    public PessoaFisica(String nome, String cpf) {
        super(nome);  // O nome é validado aqui no construtor de Cliente
        this.cpf = cpf;
    }

    // Retorna o CPF como identificação
    @Override
    public String getIdentificacao() {
        return cpf;
    }

    // Retorna o tipo de cliente: "Pessoa Física"
    @Override
    public String getTipo() {
        return "Pessoa Física";
    }
}
