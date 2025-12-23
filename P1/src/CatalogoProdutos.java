public class CatalogoProdutos{
    Produto[] produtos;
    private int contador;

    public CatalogoProdutos() {
        produtos = new Produto[10];
        contador = 0;
    }

    public void adicionarProduto(Produto p) {
        if (contador >= 10) {
            System.out.println(" atingiu o limite!");
            return;
        }

        //verifica se tem o mesmo nome
        for (int i = 0; i < contador; i++) {
            if (produtos[i].getNome().equalsIgnoreCase(p.getNome())) {
                System.out.println("Já existe um produto com este nome :( ");
                return;
            }
        }

        produtos[contador++] = p;
        System.out.println("Produto foi adicioado!");
    }

    public void listarProdutos() {
        if (contador == 0) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for (int i = 0; i < contador; i++) {
            System.out.println(produtos[i]);
        }
    }

    public void ordenarPorNome() {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - i - 1; j++) {
                if (produtos[j].getNome().compareToIgnoreCase(produtos[j + 1].getNome()) > 0) {
                    Produto temp = produtos[j];
                    produtos[j] = produtos[j + 1];
                    produtos[j + 1] = temp;
                }
            }
        }
        System.out.println("Produtos em ordem alfabética!");
    }

    public Produto buscarProduto(String nome) {
        for (int i = 0; i < contador; i++) {
            if (produtos[i].getNome().equalsIgnoreCase(nome)) {
                return produtos[i];
            }
        }
        return null;
    }
}
