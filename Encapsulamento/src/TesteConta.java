import java.util.Scanner;

// Classe de teste
class TesteConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine(); // limpar buffer

        System.out.print("Digite o nome do titular: ");
        String nome = sc.nextLine();

        ContaBancaria conta = new ContaBancaria(numero, nome);
        conta.mostrarDados();

        System.out.print("Digite o valor do depósito: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);
        conta.mostrarDados();

        System.out.print("Digite o valor do saque: ");
        double saque = sc.nextDouble();
        conta.sacar(saque);
        conta.mostrarDados();

        sc.close();
    }
}

/*
2️⃣ Conta Bancária

Slide: fala que:

Número da conta não pode ser alterado.

Nome do titular pode ser alterado.

Saldo protegido, só altera via depósito/saque.

Código que eu fiz:

Usei private final int numeroConta; → final garante que o número da conta não muda.

Validações para depósito/saque.

Diferença: o slide não ensina final, mas ele é útil para implementar exatamente a regra do número da conta imutável.

Também usei mensagens para erros, enquanto o slide fala que poderia lançar exceção
* */
