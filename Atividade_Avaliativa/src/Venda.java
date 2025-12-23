import java.time.LocalDate;

public class Venda {
    private int id;
    private LocalDate data;
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private boolean produtoVendido;  // foi vendido?

    public Venda(int id, LocalDate data, Cliente cliente, Produto produto, int quantidade) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.produtoVendido = true;
        this.produto.marcarVendido();
    }

    public int getId() { return id; }
    public LocalDate getData() { return data; }
    public Cliente getCliente() { return cliente; }
    public Produto getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }
    public boolean isProdutoVendido() { return produtoVendido; }
}
