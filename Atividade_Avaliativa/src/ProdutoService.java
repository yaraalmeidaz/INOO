import java.util.ArrayList;

public class ProdutoService {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private int proximoId = 1;

    // Incluir Produto
    public Produto incluirProduto(String nome, int qtd, double preco) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) return null;  // Verifica se o nome já existe
        }
        Produto novo = new Produto(proximoId++, nome, qtd, preco);
        produtos.add(novo);
        return novo;
    }

    // Buscar Produto por ID
    public Produto buscarPorId(int id) {
        for (Produto p : produtos) if (p.getId() == id) return p;
        return null;  // Retorna null se não encontrar
    }

    // Buscar Produto por Nome
    public ArrayList<Produto> buscarPorNome(String nome) {
        ArrayList<Produto> achados = new ArrayList<>();
        for (Produto p : produtos) {
            if (p.getNome().toLowerCase().contains(nome.toLowerCase()))  // Busca por parte do nome
                achados.add(p);
        }
        return achados;
    }

    // Excluir Produto
    public boolean excluirProduto(int id) {
        Produto p = buscarPorId(id);
        if (p != null && !p.isVendido()) {  // Só exclui se o produto não foi vendido
            produtos.remove(p);
            return true;
        }
        return false;  // Retorna false se não puder excluir
    }

    // Listar todos os Produtos
    public ArrayList<Produto> listar() {
        return produtos;
    }


    // Calcular Valor Total do Estoque
    public double valorTotalEstoque() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getQuantidade() * p.getPreco();  // Soma o valor de cada produto no estoque
        }
        return total;
    }

    // Relatório de Estoque Baixo
    public ArrayList<Produto> estoqueBaixo(int limite) {
        ArrayList<Produto> produtosBaixos = new ArrayList<>();
        for (Produto p : produtos) {
            if (p.getQuantidade() <= limite) {  // Verifica se a quantidade é menor ou igual ao limite
                produtosBaixos.add(p);  // Adiciona ao relatório
            }
        }
        return produtosBaixos;
    }

    // Atualizar Estoque: Adicionar ou remover quantidade do estoque
    public boolean atualizarEstoque(int id, int qtd) {
        Produto p = buscarPorId(id);  // Busca o produto pelo ID
        if (p != null) {  // Verifica se o produto existe
            if (qtd >= 0) {  // Se qtd for positiva, adiciona ao estoque
                p.adicionarEstoque(qtd);
                System.out.println("Estoque atualizado com sucesso. Quantidade adicionada: " + qtd);
            } else {  // Se qtd for negativa, tenta remover do estoque
                if (p.removerEstoque(-qtd)) {  // Remove a quantidade do estoque
                    System.out.println("Estoque atualizado com sucesso. Quantidade removida: " + -qtd);
                } else {
                    System.out.println("Falha ao remover estoque: quantidade insuficiente.");
                    return false;  // Não conseguiu remover o estoque devido a quantidade insuficiente
                }
            }
            return true;  // A operação foi bem-sucedida
        } else {
            System.out.println("Produto não encontrado.");
            return false;  // Produto não encontrado
        }
    }
}
