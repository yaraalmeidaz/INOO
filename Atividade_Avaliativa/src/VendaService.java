import java.time.LocalDate;
import java.util.ArrayList;

public class VendaService {
    private ArrayList<Venda> vendas = new ArrayList<>();
    private int proximoId = 1;

    // Incluir uma nova venda
    public Venda incluirVenda(LocalDate data, Cliente cliente, Produto produto, int qtd) {
        if (cliente == null || produto == null) return null;
        if (produto.getQuantidade() < qtd) return null;

        produto.removerEstoque(qtd);
        produto.marcarVendido();
        cliente.incrementarCompras();

        Venda v = new Venda(proximoId++, data, cliente, produto, qtd);
        vendas.add(v);
        return v;
    }

    // Listar todas as vendas
    public ArrayList<Venda> listar() {
        return vendas;
    }
}
