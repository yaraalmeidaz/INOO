/**
 *
 *3.Faça um programa em JAVA que divida uma string em palavras
 *  e exiba cadapalavra em uma linha separada.
 *
 */


import java.util.Scanner;

public class DividirString {
    public static void executar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== EXERCÍCIO 3: Dividir string em palavras ===");
        System.out.println("Digite uma frase");
        String frase = sc.nextLine();
        String[] palavras = frase.split(" "); // Divide por espaços
        // Para exibir cada palavra
        for (String palavra : palavras) {
            System.out.println(palavra);
        }



    }
}
