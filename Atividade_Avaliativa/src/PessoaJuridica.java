public class PessoaJuridica extends Cliente {
    private String cnpj;

    // Construtor da classe PessoaJuridica, chama o construtor da classe Cliente para validar o nome (razão social)
    public PessoaJuridica(String razaoSocial, String cnpj) {
        super(razaoSocial);  // O nome (razão social) é validado aqui no construtor de Cliente
        this.cnpj = cnpj;
    }

    // Retorna o CNPJ como identificação
    @Override
    public String getIdentificacao() {
        return cnpj;
    }

    // Retorna o tipo de cliente: "Pessoa Jurídica"
    @Override
    public String getTipo() {
        return "Pessoa Jurídica";
    }
}
