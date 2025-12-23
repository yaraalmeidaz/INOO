import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CatalogoProdutos catalogo = new CatalogoProdutos();
        int op;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Adicionar Quantidade");
            System.out.println("4. remover Quantidade");
            System.out.println("5. Ordenar Produtos por Nome");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            op = entrada.nextInt();
            entrada.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Tipo de produto (1-Eletrônico / 2-Perfumaria): ");
                    int tipo = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Nome: ");
                    String nome = entrada.nextLine();
                    System.out.print("Preço: ");
                    double preco = entrada.nextDouble();
                    System.out.print("Quantidade: ");
                    int qtd = entrada.nextInt();
                    entrada.nextLine();

                    if (tipo == 1) {
                        System.out.print("Marca: ");
                        String marca = entrada.nextLine();
                        System.out.print("Voltagem: ");
                        String voltagem = entrada.nextLine();
                        Eletronico e = new Eletronico(nome, preco, qtd, marca, voltagem);
                        catalogo.adicionarProduto(e);
                    } else if (tipo == 2) {
                        System.out.print("Marca: ");
                        String marca = entrada.nextLine();
                        System.out.print("Volume: ");
                        String volume = entrada.nextLine();
                        System.out.print("Público Alvo: ");
                        String publico = entrada.nextLine();
                        Perfumaria p = new Perfumaria(nome, preco, qtd, marca, volume, publico);
                        catalogo.adicionarProduto(p);
                    } else {
                        System.out.println("Tipo inválido!");
                    }
                    break;

                case 2:
                    catalogo.listarProdutos();
                    break;

                case 3:
                    System.out.print("Nome do produto: ");
                    String nomeAdd = entrada.nextLine();
                    Produto prodAdd = catalogo.buscarProduto(nomeAdd);
                    if (prodAdd != null) {
                        System.out.print("Quantidade a adicionar: ");
                        int add = entrada.nextInt();
                        prodAdd.adicionarItens(add);
                        System.out.println("Quantidade atualizada!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Nome do produto: ");
                    String nomeRem = entrada.nextLine();
                    Produto prodRem = catalogo.buscarProduto(nomeRem);
                    if (prodRem != null) {
                        System.out.print("Quantidade a remover: ");
                        int rem = entrada.nextInt();
                        prodRem.removerItens(rem);
                        System.out.println("Quantidade atualizada!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 5:
                    catalogo.ordenarPorNome();
                    catalogo.listarProdutos();
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (op != 0);

        entrada.close();
    }
}
