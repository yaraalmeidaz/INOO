import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ClienteService {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    //formula pronta do cpf e cnpj
    public static boolean validarCPF(String cpf) {
        cpf = cpf.replaceAll("\\D", "");
        if (cpf.length() != 11) return false;
        if (cpf.matches("(\\d)\\1{10}")) return false;

        int soma = 0, peso = 10;
        for (int i = 0; i < 9; i++) soma += (cpf.charAt(i) - '0') * peso--;
        int resto = 11 - (soma % 11);
        int dv1 = (resto >= 10) ? 0 : resto;

        soma = 0; peso = 11;
        for (int i = 0; i < 10; i++) soma += (cpf.charAt(i) - '0') * peso--;
        resto = 11 - (soma % 11);
        int dv2 = (resto >= 10) ? 0 : resto;

        return dv1 == (cpf.charAt(9) - '0') && dv2 == (cpf.charAt(10) - '0');
    }

    // Validação de CNPJ (Movido de Main)
    public static boolean validarCNPJ(String cnpj) {
        cnpj = cnpj.replaceAll("\\D", "");
        if (cnpj.length() != 14) return false;

        int[] p1 = {5,4,3,2,9,8,7,6,5,4,3,2};
        int[] p2 = {6,5,4,3,2,9,8,7,6,5,4,3,2};

        int soma = 0;
        for (int i = 0; i < 12; i++) soma += (cnpj.charAt(i) - '0') * p1[i];
        int resto = soma % 11;
        int dv1 = (resto < 2) ? 0 : 11 - resto;

        soma = 0;
        for (int i = 0; i < 13; i++) soma += (cnpj.charAt(i) - '0') * p2[i];
        resto = soma % 11;
        int dv2 = (resto < 2) ? 0 : 11 - resto;

        return dv1 == (cnpj.charAt(12) - '0') && dv2 == (cnpj.charAt(13) - '0');
    }

    // Verifica se o CPF já existe
    // anyMath comparação
    // -> uma notação que representaão para ser "entãpo" faca tal coisa
    //instanceof o tipo de dados
    public boolean cpfExiste(String cpf) {
        return clientes.stream()
                .anyMatch(c -> c instanceof PessoaFisica && c.getIdentificacao().equals(cpf));
    }

    // Verifica se o CNPJ já existe
    public boolean cnpjExiste(String cnpj) {
        return clientes.stream()
                .anyMatch(c -> c instanceof PessoaJuridica && c.getIdentificacao().equals(cnpj));
    }

    // Cadastrar Pessoa Física
    // Nota: O nome vazio já é validado no construtor da classe Cliente (RuntimeException).
    public boolean cadastrarPF(String nome, String cpf) {
        // Validação de Duplicação
        if (cpfExiste(cpf)) return false;

        // Validação Oficial CPF é feita antes de chamar este método,
        // ou você pode fazê-la aqui também para garantir. Exemplo:
        // if (!validarCPF(cpf)) throw new IllegalArgumentException("CPF inválido!");

        clientes.add(new PessoaFisica(nome, cpf));
        return true;
    }

    // Cadastrar Pessoa Jurídica
    // Nota: A razão social vazia já é validada no construtor da classe Cliente (RuntimeException).
    public boolean cadastrarPJ(String razao, String cnpj) {
        // Validação de Duplicação
        if (cnpjExiste(cnpj)) return false;

        // Validação Oficial CNPJ
        // if (!validarCNPJ(cnpj)) throw new IllegalArgumentException("CNPJ inválido!");

        clientes.add(new PessoaJuridica(razao, cnpj));
        return true;
    }

    // Buscar cliente por documento
    //metodos nativos de jAVA filter
    //funcao findfirst() -- se tem retorna ou orelse null
    public Cliente buscarPorDocumento(String doc) {
        return clientes.stream()
                .filter(c -> c.getIdentificacao().equals(doc))
                .findFirst()
                .orElse(null);
    }

    // Ordenar lista de clientes por tipo e identificação
    public ArrayList<Cliente> listarOrdenado() {
        Collections.sort(clientes, new Comparator<Cliente>() {

            @Override
            public int compare(Cliente c1, Cliente c2) {
                // Primeiro, compara o tipo (PF ou PJ)
                int tipoComparacao = c1.getTipo().compareTo(c2.getTipo());
                if (tipoComparacao != 0) {
                    return tipoComparacao;
                }

                // Se os tipos forem iguais, compara o documento (CPF ou CNPJ)
                return c1.getIdentificacao().compareTo(c2.getIdentificacao());
            }
        });
        return clientes;
    }

    // Listar todos os clientes
    public ArrayList<Cliente> listar() {
        return clientes;
    }
}
