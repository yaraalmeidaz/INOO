public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private double preco;
    private boolean vendido;

    // Construtor
    public Produto(int id, String nome, int quantidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.vendido = false;
    }

    // Getters
    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }
    public double getPreco() { return preco; }
    public boolean isVendido() { return vendido; }

    // Marcar produto como vendido
    public void marcarVendido() {
        this.vendido = true;
    }

    // Adicionar estoque
    public void adicionarEstoque(int qtd) {
        quantidade += qtd;
    }

    // Remover estoque
    public boolean removerEstoque(int qtd) {
        if (quantidade >= qtd) {
            quantidade -= qtd;
            return true;
        }
        return false;
    }
}
