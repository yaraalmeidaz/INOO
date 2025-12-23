import java.util.*;//aaray e comparate to
import java.time.LocalDate; //date

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ProdutoService produtoService = new ProdutoService();
    static ClienteService clienteService = new ClienteService();
    static VendaService vendaService = new VendaService();

    // ======================================================
    //   MENU PRINCIPAL
    // ======================================================
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Produtos");
            System.out.println("2. Clientes");
            System.out.println("3. Vendas");
            System.out.println("4. Encerrar");
            System.out.print("Escolha: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> menuProdutos();
                case 2 -> menuClientes();
                case 3 -> menuVendas();
                case 4 -> { System.out.println("Encerrando..."); return; }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    // ======================================================
    //   MENU DE PRODUTOS
    // ======================================================
    public static void menuProdutos() {
        System.out.println("\n===== PRODUTOS =====");
        System.out.println("1. Incluir Produto");
        System.out.println("2. Excluir Produto");
        System.out.println("3. Listar Produtos");
        System.out.println("4. Buscar Produto");
        System.out.println("5. Atualizar Estoque");
        System.out.println("6. Calcular Valor Total do Estoque");
        System.out.println("7. Relatório de Estoque Baixo");
        System.out.println("0. Voltar");
        System.out.print("Escolha: ");
        int op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1 -> {
                System.out.println("\n===== Incluir Produto =====");

                //nome: não pode ser vazio e nem numero
                String nome;

                while (true) {
                    System.out.print("Nome: ");
                    nome = sc.nextLine().trim(); // Lê o nome e remove espaços extras

                    if (nome.isEmpty()) {
                        System.out.println("O nome não pode ser vazio!");
                    } else if (nome.matches(".*\\d.*")) {
                        System.out.println("O nome do produto não deve conter números!"); // Nova validação
                    } else {
                        break; // Sai do loop se o nome for válido
                    }
                }

                int qtd;
                // Lendo e Validando Quantidade (deve ser inteiro)
                while (true) {
                    System.out.print("Quantidade: ");
                    if (sc.hasNextInt()) {
                        qtd = sc.nextInt();
                        sc.nextLine(); // Limpa o buffer
                        if (qtd < 0) {
                            System.out.println("A quantidade inicial deve ser positiva!");
                        } else {
                            break; // Sai do loop se for um inteiro positivo
                        }
                    } else {
                        System.out.println("Digite um valor válido para a Quantidade (número inteiro)!");
                        sc.nextLine(); // Consome a entrada inválida para evitar loop infinito
                    }
                }

                double preco;
                // 3. Lendo e Validando Preço (deve ser double)
                while (true) {
                    System.out.print("Preço: ");
                    if (sc.hasNextDouble()) {
                        preco = sc.nextDouble();
                        sc.nextLine(); // Limpa o buffer
                        if (preco < 0) {
                            System.out.println("O preço deve ser positivo!");
                        } else {
                            break; // Sai do loop se for um double positivo
                        }
                    } else {
                        System.out.println("Digite um valor válido para o Preço (número decimal)!");
                        sc.nextLine(); // Consome a entrada inválida
                    }
                }
                Produto p = produtoService.incluirProduto(nome, qtd, preco);
                if (p == null) {
                    // Mensagem de erro mais específica, conforme solicitado:
                    System.out.println("Esse produto já foi cadastrado!");
                } else {
                    System.out.println("Cadastrado! ID: " + p.getId());
                }
            }

            case 2 -> {
                System.out.println("\n===== Excluir Produto =====");
                System.out.print("ID: ");
                int id = sc.nextInt();
                boolean ok = produtoService.excluirProduto(id);
                System.out.println(ok ? "Excluído!" : "Não foi possível excluir.");
            }

            case 3 -> {
                ArrayList<Produto> listaProdutos = produtoService.listar();//obtém a lista

                System.out.println("\n===== Lista de Produtos =====");

                if (listaProdutos.isEmpty()) { // Verifica se a lista está vazia
                    System.out.println("Nenhum produto cadastrado no estoque.");
                    return;
                }

                for (Produto p : produtoService.listar()) {
                    System.out.println("ID: " + p.getId() + " | " + p.getNome() +
                            " | Estoque: " + p.getQuantidade() +
                            (p.getQuantidade() == 0 ? " (Sem estoque)" : "") +
                            " | R$" + p.getPreco());
                }
            }

            case 4 -> {
                System.out.println("\n===== Busque Produto =====");
                System.out.print("Nome ou parte do nome: ");
                String nome = sc.nextLine();
                var achados = produtoService.buscarPorNome(nome);
                if (achados.isEmpty()) System.out.println("Nenhum encontrado.");
                else achados.forEach(p -> System.out.println(p.getId() + " - " + p.getNome()));
            }

            case 5 -> atualizarEstoque();
            case 6 -> calcularValorTotalEstoque();
            case 7 -> relatorioEstoqueBaixo();
            case 0 -> {
                System.out.println("Retornando ao menu inicial...");
                return;
            }
        }
    }

    // ======================================================
    //   MENU DE CLIENTES
    // ======================================================
    public static void menuClientes() {
        System.out.println("\n===== CLIENTES =====");
        System.out.println("1. Cadastrar Pessoa Física");
        System.out.println("2. Cadastrar Pessoa Jurídica");
        System.out.println("3. Listar Clientes");
        System.out.println("0. Voltar");
        System.out.print("Escolha: ");
        int op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1 -> { // Cadastrar Pessoa Física
                System.out.println("\n===== Cadastro de Pessoa Física =====");
                String nome;
                //valida se o nome tem numero
                while(true){
                    System.out.print("Nome: ");
                    nome = sc.nextLine().trim(); // Lê o nome e remove espaços extras

                    if (nome.isEmpty()) {
                        System.out.println("O nome não pode ser vazio!");
                    } else if (nome.matches(".*\\d.*")) {
                        System.out.println("O nome do cliente não deve conter números!"); // Nova validação
                    } else {
                        break; // Sai do loop se o nome for válido
                    }
                }

                // O requisito é apenas que o nome NÃO seja vazio (já validado no construtor de Cliente)
                // A verificação incorreta de números foi removida.

                System.out.print("CPF: ");
                String cpf = sc.nextLine().replaceAll("[^0-9]", ""); // Remove caracteres não numéricos

                // 1. Validação do CPF (regras oficiais)
                if (!ClienteService.validarCPF(cpf)) {
                    System.out.println("CPF inválido! (Não atende às regras oficiais).");
                    return;
                }

                // 2. cadastro
                // try é onde fica o codigo q pode gerar o erro
                //catch se capture o erro envia uma mensagem p cpdigo n quebrzr
                //try: Contém o código que pode gerar uma exceção.
                //catch: Se um erro ocorrer no try, a execução é desviada para o catch correspondente, que lida com o erro.
                //finally (opcional): Código que sempre será executado, ocorrendo erro ou não, útil para liberar recursos.
                try {
                    if (!clienteService.cadastrarPF(nome, cpf))
                        System.out.println("CPF já cadastrado!");
                    else
                        System.out.println("Cliente PF cadastrado!");
                } catch (IllegalArgumentException e) {
                    // Captura a exceção de nome vazio do construtor de Cliente
                    System.out.println("Falha no cadastro: " + e.getMessage());
                }
            }

            case 2 -> { // Cadastrar Pessoa Jurídica
                System.out.println("\n===== Cadastro de Pessoa Jurídica =====");
                String razao;
                //verfica nome
                while(true){
                    System.out.print("Razão social: ");
                    razao = sc.nextLine().trim(); //le e remove os espaços extras

                    if (razao.isEmpty()) {
                        System.out.println("O nome não pode ser vazio!");
                    } else if (razao.matches(".*\\d.*")) {
                        System.out.println("O nome da razão não deve conter números!"); //validação
                    } else {
                        break; // Sai do loop se o nome for válido
                    }
                }

                // O requisito é apenas que a Razão Social NÃO seja vazia (já validado no construtor de Cliente)
                // A verificação incorreta de números foi removida.

                System.out.print("CNPJ: ");
                String cnpj = sc.nextLine().replaceAll("[^0-9]", ""); // Remove caracteres não numéricos

                // 1. Validação do CNPJ (regras oficiais)
                if (!ClienteService.validarCNPJ(cnpj)) {
                    System.out.println("CNPJ inválido! (Não atende às regras oficiais).");
                    return;
                }

                // 2. Validação de Duplicação e cadastro
                //try é onde fica o codigo q pode gerar o erro
                //catch se capture o erro envia uma mensagem p cpdigo n quebrzr
                try {
                    if (!clienteService.cadastrarPJ(razao, cnpj))
                        System.out.println("CNPJ já cadastrado!");
                    else
                        System.out.println("Cliente PJ cadastrado!");
                } catch (IllegalArgumentException e) {
                    // Captura a exceção de razão social vazia do construtor de Cliente
                    System.out.println("Falha no cadastro: " + e.getMessage());
                }
            }
            case 3 -> { // Listar Clientes
                ArrayList<Cliente> listaClientes = clienteService.listarOrdenado();

                System.out.println("\n===== Lista de Clientes =====");

                if (listaClientes.isEmpty()) {
                    // Mensagem a ser exibida se não houver NENHUM cliente cadastrado.
                    System.out.println("Nenhum cliente cadastrado. Comece registrando uma Pessoa Física ou Jurídica!");
                } else {
                    // Itera e exibe a lista, incluindo o total de compras (que pode ser zero)
                    for (Cliente c : listaClientes) {
                        System.out.println(c.getTipo() + " | " + c.getNome() +
                                " | Documento: " + c.getIdentificacao() +
                                " | Compras: " + c.getTotalCompras());
                    }
                }
            }
            case 0 -> {
                System.out.println("Retornando ao menu inicial...");
                return;
            }
        }
    }

    // ======================================================
    //   MENU DE VENDAS
    // ======================================================
    public static void menuVendas() {
        System.out.println("\n===== VENDAS =====");
        System.out.println("1. Registrar Venda");
        System.out.println("2. Listar Vendas");
        System.out.println("0. Voltar");
        System.out.print("Escolha: ");
        int op = sc.nextInt();
        sc.nextLine();  // Limpa o buffer de entrada

        switch (op) {
            case 1 -> {
                System.out.println("\n===== Realize sua venda =====");
                // Código para registrar uma venda
                System.out.print("CPF/CNPJ do cliente: ");
                String doc = sc.nextLine();

                // Limpa CPF/CNPJ
                doc = doc.replaceAll("[^0-9]", "");

                Cliente cliente = clienteService.buscarPorDocumento(doc);

                if (cliente == null) {
                    System.out.println("Cliente não encontrado!");
                    return;
                }

                System.out.print("ID do produto: ");
                int id = sc.nextInt();
                Produto prod = produtoService.buscarPorId(id);

                if (prod == null) {
                    System.out.println("Produto não encontrado!");
                    return;
                }

                System.out.print("Quantidade: ");
                int qtd = sc.nextInt();

                Venda v = vendaService.incluirVenda(LocalDate.now(), cliente, prod, qtd);

                if (v == null) {
                    System.out.println("Venda inválida (sem estoque suficiente?).");
                } else {
                    System.out.println("Venda registrada! ID: " + v.getId());
                }
            }

            case 2 -> {
                // Listar todas as vendas
                ArrayList<Venda> listaVendas = vendaService.listar(); //obtem a lista

                System.out.println("\n===== Lista de vendas realizadas =====");

                if (listaVendas.isEmpty()) {//verifica se esta vazia
                    // Mensagem a ser exibida se não houver NENHUMA venda registrada.
                    System.out.println("Nenhuma venda registrada, realize a primeira!");
                } else {
                    for (Venda v : listaVendas) {
                        System.out.println("Venda ID: " + v.getId() + " | Data: " + v.getData() +
                                " | Cliente: " + v.getCliente().getNome() +
                                " | Produto: " + v.getProduto().getNome() +
                                " | Quantidade: " + v.getQuantidade());
                    }
                }
            }
            case 0 -> {
                System.out.println("Retornando ao menu inicial...");
                return;
            }
        }
    }

    // ======================================================
    //   FUNÇÕES ADICIONAIS
    // ======================================================

    // Atualizar Estoque
    public static void atualizarEstoque() {
        System.out.print("ID do Produto: ");
        int id = sc.nextInt();
        System.out.print("Quantidade a adicionar/remover: ");
        int qtd = sc.nextInt();
        sc.nextLine();  // Limpa o buffer de entrada

        boolean sucesso = produtoService.atualizarEstoque(id, qtd);
        if (sucesso) {
            System.out.println("Estoque atualizado com sucesso.");
        } else {
            System.out.println("Falha ao atualizar o estoque. Verifique o ID ou a quantidade.");
        }
    }

    // Calcular Valor Total do Estoque
    public static void calcularValorTotalEstoque() {
        double total = produtoService.valorTotalEstoque();
        System.out.println("Valor total do estoque: R$ " + total);
    }

    // Relatório de Estoque Baixo
    public static void relatorioEstoqueBaixo() {
        System.out.print("Informe o limite de estoque baixo: ");
        int limite = sc.nextInt();
        sc.nextLine(); // Limpa o buffer

        var produtosBaixos = produtoService.estoqueBaixo(limite);
        if (produtosBaixos.isEmpty()) {
            System.out.println("Não há produtos com estoque baixo.");
        } else {
            produtosBaixos.forEach(p -> System.out.println(p.getId() + " - " + p.getNome() + " | Estoque: " + p.getQuantidade()));
        }
    }
}
