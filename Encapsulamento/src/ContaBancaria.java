import java.util.Scanner;

public class ContaBancaria {
    private final int numeroConta;
    private String nomeTitular;
    private double saldo;

    //Construtor
    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0; // saldo inicial
    }

    // Getters e setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos para operações
    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if(valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    public void mostrarDados() {
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Saldo: " + saldo);
        System.out.println("--");
    }
}

