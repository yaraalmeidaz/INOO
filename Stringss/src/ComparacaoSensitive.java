/*
*
* Comparação de strings sem distinção entre maiúsculas e minúsculas
* Escreva um programa Java para comparar duas strings lexicograficamente,
* ignorando diferenças entre maiúsculas e minúsculas.Saída de exemplo:
*
* */
import  java.util.Scanner;
public class ComparacaoSensitive {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== EXERCÍCIO 5: Comparação sem case sensitive ===");
        System.out.println("Digite a Frase1: ");
        String frase1 = sc.nextLine();
        System.out.println("Digite a Frase2: ");
        String frase2 = sc.nextLine();

        //funcao p ignorar a diferenca entre A e a
        int resultado = frase1.compareToIgnoreCase(frase2);
        if(resultado < 0 ) {
            System.out.println("Frase 2 é maior ");
        }  else if(resultado > 0 ) {
            System.out.println("Frase 1 é maior");
        } else {
            System.out.println("Frases são iguais (ignorando case)");
        }

        // Mostra também o resultado numérico
        System.out.println("Diferença da comparação: " + resultado);
    }
}