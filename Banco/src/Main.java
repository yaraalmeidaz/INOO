import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Cadastro de conta corrente");
        System.out.print("Digite o nome completo do titular: ");
        String titularCC = sc.nextLine();
        System.out.print("Digite o numero da conta corrente: ");
        int numCC = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o saldo inicial da conta corrente: ");
        int saldoCC = sc.nextInt();
        System.out.print("Digite o limite da conta corrente: ");
        int limiteCC = sc.nextInt();

        ContaCorrente cc = new ContaCorrente(numCC, titularCC,saldoCC, limiteCC);



        System.out.println("Cadastro de conta poupança ");
        System.out.print("Digite o nome completo do titular: ");
        String titularCP = sc.nextLine();
        System.out.print("Digite o numero da conta poupança: ");
        int numCP = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o saldo inicial da conta poupança: ");
        int saldoCP = sc.nextInt();
        System.out.print("Digite o limite da conta poupança: ");
        int limiteCP = sc.nextInt();

        ContaPoupanca cp = new ContaPoupanca(numCP, titularCP,saldoCP, limiteCP);
    }
}
