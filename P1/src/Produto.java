public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //métodos
    public void adicionarItens(int qtd) {
        quantidade += qtd;
    }

    public void removerItens(int qtd) {
        if (quantidade >= qtd)
            quantidade -= qtd;
        else
            System.out.println("Quantidade insuficiente em estoque.");
    }

    @Override
    public String toString() {
        return "Produto: " + nome + "| Preço: R$ " + preco + "| Quantidade: " + quantidade;
    }
}
