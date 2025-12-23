import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // limpa o "enter" deixado pelo nextInt

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        ContaBancaria cliente1 = new ContaBancaria(numero, titular);
        cliente1.mostrarDados();

        System.out.print("Digite o valor do depósito: ");
        double deposito = scanner.nextDouble();
        cliente1.depositar(deposito);
        cliente1.mostrarDados();

        System.out.print("Digite o valor do saque: ");
        double saque = scanner.nextDouble();
        cliente1.sacar(saque);
        cliente1.mostrarDados();





        scanner.close();
    }
}


/*import java.util.ArrayList;
import java.util.Scanner;

class TesteConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Listar contas");
            System.out.println("3 - Depositar em conta");
            System.out.println("4 - Sacar de conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 0) break;

            switch (opcao) {
                case 1: // Criar conta
                    System.out.print("Número da conta: ");
                    int numero = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome do titular: ");
                    String nome = sc.nextLine();

                    ContaBancaria conta = new ContaBancaria(numero, nome);
                    contas.add(conta);
                    System.out.println("Conta criada com sucesso!");
                    break;

                case 2: // Listar
                    for (ContaBancaria c : contas) {
                        c.mostrarDados();
                    }
                    break;

                case 3: // Depositar
                    System.out.print("Número da conta: ");
                    int nDeposito = sc.nextInt();
                    System.out.print("Valor: ");
                    double valorDep = sc.nextDouble();

                    for (ContaBancaria c : contas) {
                        if (c.getNumeroConta() == nDeposito) {
                            c.depositar(valorDep);
                            System.out.println("Depósito realizado!");
                        }
                    }
                    break;

                case 4: // Sacar
                    System.out.print("Número da conta: ");
                    int nSaque = sc.nextInt();
                    System.out.print("Valor: ");
                    double valorSaq = sc.nextDouble();

                    for (ContaBancaria c : contas) {
                        if (c.getNumeroConta() == nSaque) {
                            c.sacar(valorSaq);
                            System.out.println("Saque realizado!");
                        }
                    }
                    break;
            }
        }

        sc.close();
    }
}
*/