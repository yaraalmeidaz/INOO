/*
*
* 2.Faça um programa em JAVA que substitua todas as
* ocorrências de uma letraespecífica por outra letra.
* */

import java.util.Scanner;

public class Substituir {
    public static void executar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== EXERCÍCIO 2: Substituir caracteres\n ===");
        System.out.print("Digite uma frase/palavra: ");
        String str = sc.nextLine();

        String substituicao = str.replace('a', 'y');

        System.out.println("Palavra pós alteração: " + substituicao);



    }
}
