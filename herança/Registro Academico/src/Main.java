import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[10];

        int qtdBasico = 0, qtdMedio = 0, qtdUni = 0;

        // Preencher os 10 funcionários respeitando a proporção
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("\nCadastro do funcionário " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Código: ");
            int codigo = sc.nextInt();
            sc.nextLine(); // consumir o ENTER

            // Decidir escolaridade com base na proporção
            if (qtdBasico < 4) {
                System.out.print("Digite o nome da escola de ensino básico: ");
                String escolaB = sc.nextLine();
                funcionarios[i] = new ensinoBasico(nome, codigo, escolaB);
                qtdBasico++;

            } else if (qtdMedio < 4) {
                System.out.print("Digite o nome da escola de ensino básico: ");
                String escolaB = sc.nextLine();
                System.out.print("Digite o nome da escola de ensino médio: ");
                String escolaM = sc.nextLine();
                funcionarios[i] = new ensinoBasico(nome, codigo, escolaB, escolaM);
                qtdMedio++;

            } else {
                System.out.print("Digite o nome da escola de ensino básico: ");
                String escolaB = sc.nextLine();
                System.out.print("Digite o nome da escola de ensino médio: ");
                String escolaM = sc.nextLine();
                System.out.print("Digite o nome da universidade: ");
                String uni = sc.nextLine();
                funcionarios[i] = new Universitario(nome, codigo, escolaB, escolaM, uni);
                qtdUni++;
            }
        }

        // Mostrar todos os funcionários
        System.out.println("\n===== Funcionários cadastrados =====");
        for (Funcionario f : funcionarios) {
            f.mostrarDados();
            System.out.println("-----------------------------------");
        }

        // Calcular custos
        double total = 0, totalBasico = 0, totalMedio = 0, totalUni = 0;

        for (Funcionario f : funcionarios) {
            double salario = f.calcularSalario();
            total += salario;

            if (f instanceof Universitario) {
                totalUni += salario;
            } else if (f instanceof ensinoMedio) {
                totalMedio += salario;
            } else if (f instanceof ensinoMedio) {
                totalBasico += salario;
            }
        }

        System.out.println("\n===== Custos da Empresa =====");
        System.out.println("Total com salários: R$ " + total);
        System.out.println("Total Ensino Básico: R$ " + totalBasico);
        System.out.println("Total Ensino Médio: R$ " + totalMedio);
        System.out.println("Total Universitário: R$ " + totalUni);
    }
}



/*import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> contas = new ArrayList<>();

        Funcionario f1 = new Funcionario("Luana", 16);
        Funcionario f2 = new Funcionario("Eduardo", 1);
        Funcionario f3 = new Funcionario("Laura", 80);

        f1.setBasico("JMA");
        f1.mostrarDados();

        f2.setBasico("Objetivo");
        f2.setMedio("COC");
        f2.mostrarDados();

        f3.setBasico("IFSP");
        f3.setUniversidade("IFSP");
        f3.mostrarDados();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Preencher Formulário");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 0) break;

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do funcionário: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o código do funcionário: ");
                    int codigo = sc.nextInt();
                    sc.nextLine(); // consumir o enter

                    Funcionario novo = new Funcionario(nome, codigo);
                    novo.preencherFormacao();
                    novo.mostrarDados();

                    contas.add(novo);
                    break;

            }
        }

        //Mostrar todos os cadastrados no final
        System.out.println("\nFuncionários cadastrados:");
        //para cada elemento do tipo Funcionario dentro da lista contas
        // atribua esse elemento dentro da variável f e execute o  laço.
        for (Funcionario f : contas) {
            f.mostrarDados();
        }

        /*
        poderia see assim tbm:
        for (int i = 0; i < contas.size(); i++) {
            Funcionario f = contas.get(i); // pega o i-ésimo Funcionario da lista
            f.mostrarDados();
        }






    }
}
*/