/**
 * 7. Concatenar duas stringsEscreva um programa Java para
 * concatenar uma determinada string ao final de outra string.
 */


import java.util.Scanner;

public class Concratenar {
    public static void executar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== EXERCÍCIO 6: Concatenar duas strings ===");
        System.out.println("Digite a Frase1: ");
        String frase1 = sc.nextLine();
        System.out.println("Digite a Frase2: ");
        String frase2 = sc.nextLine();



        String concatenada = frase1.concat(frase2);
        System.out.println("Frase concratenada: " + concatenada);

        String concatenada2 = frase1 + " " + frase2;
        System.out.println("Frase concratenada: " + concatenada2);



    }
}
