import java.util.ArrayList;
import java.util.Scanner;

public class NotasTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.print("Quantos alunos na turma? ");
        int quantidadeAlunos = scanner.nextInt();

        // Ler notas
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
        }

        // Exibir notas dos aprovados
        System.out.println("\nAlunos aprovados:");
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) >= 6.0) {
                System.out.println("Aluno " + (i + 1) + ": " + notas.get(i));
            }
        }
        System.out.println("\nAlunos reaprovados:");
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) < 6.0) {
                System.out.println("Aluno " + (i + 1) + ": " + notas.get(i));
            }
        }

        // Calcular média geral
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.size();
        System.out.println("\nMédia geral da turma: " + media);

        scanner.close();
    }
}



/*

import java.util.ArrayList;

public class Elementos<T extends Number> {
    private ArrayList<T> elementos;

    public Elementos() {
        elementos = new ArrayList<>();
    }

    // Adicionar elemento
    public void adicionar(T elemento) {
        elementos.add(elemento);
    }

    // Retornar lista de elementos
    public ArrayList<T> getElementos() {
        return elementos;
    }

    // Calcular média
    public double calcularMedia() {
        if (elementos.isEmpty()) return 0;
        double soma = 0;
        for (T e : elementos) {
            soma += e.doubleValue(); // converte para double para somar
        }
        return soma / elementos.size();
    }
}
import java.util.Scanner;

public class NotasComElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Elementos<Double> notas = new Elementos<>();

        System.out.print("Quantos alunos na turma? ");
        int quantidadeAlunos = scanner.nextInt();

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            notas.adicionar(nota);
        }

        System.out.println("\nAlunos aprovados:");
        for (int i = 0; i < notas.getElementos().size(); i++) {
            if (notas.getElementos().get(i) >= 6.0) {
                System.out.println("Aluno " + (i + 1) + ": " + notas.getElementos().get(i));
            }
        }

        System.out.println("\nMédia geral da turma: " + notas.calcularMedia());

        scanner.close();
    }
}
exemplo adapatado:
import java.util.Scanner;

public class PesosComElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Elementos<Double> pesos = new Elementos<>();

        System.out.print("Quantas pessoas? ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o peso da pessoa " + (i + 1) + ": ");
            double peso = scanner.nextDouble();
            pesos.adicionar(peso);
        }

        System.out.println("\nPesos cadastrados:");
        for (int i = 0; i < pesos.getElementos().size(); i++) {
            System.out.println("Pessoa " + (i + 1) + ": " + pesos.getElementos().get(i));
        }

        System.out.println("\nMédia de peso: " + pesos.calcularMedia());

        scanner.close();
    }
}
func:
import java.util.ArrayList;
import java.util.Scanner;

// Classe Funcionário com encapsulamento
class Funcionario {
    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    // Método para aumentar salário por porcentagem
    public void aumentarSalario(double porcentagem) {
        if (porcentagem > 0) {
            salario += salario * (porcentagem / 100.0);
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Salário: " + String.format("%.2f", salario);
    }
}

public class SistemaFuncionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Digite o número de funcionários: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consumir o \n

        // Ler dados dos funcionários
        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário #" + (i + 1));
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consumir o \n
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            funcionarios.add(new Funcionario(id, nome, salario));
        }

        // Ler id do funcionário para aumento
        System.out.print("\nDigite o ID do funcionário que terá aumento: ");
        int idAumento = scanner.nextInt();
        Funcionario func = null;

        for (Funcionario f : funcionarios) {
            if (f.getId() == idAumento) {
                func = f;
                break;
            }
        }

        if (func != null) {
            System.out.print("Digite a porcentagem de aumento: ");
            double porcentagem = scanner.nextDouble();
            func.aumentarSalario(porcentagem);
            System.out.println("Aumento aplicado com sucesso!");
        } else {
            System.out.println("ID não encontrado. Operação abortada.");
        }

        // Listagem atualizada dos funcionários
        System.out.println("\nLista atualizada de funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

        scanner.close();
    }
}

* */