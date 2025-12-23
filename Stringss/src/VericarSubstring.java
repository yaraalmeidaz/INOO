/*
*
* Contém sequência especificadaEscreva um programa Java para
* testar se uma determinada string contém a sequência
* especificada de valores char.
* */
import java.util.Scanner;
public class VericarSubstring {
    public static void executar(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("\n=== exercicio 7. VERIFICAR SUBSTRING ===");
        System.out.print("Digite a string principal: ");
        String texto = sc.nextLine();
        System.out.print("Digite a sequência a verificar: ");
        String sequencia = sc.nextLine();

        boolean contem = texto.contains(sequencia);

        if (contem) {
            int posicao = texto.indexOf(sequencia);
            System.out.println("TEm a sequência (posição: " + posicao + ")");
        } else {
            System.out.println("NÃO contém a sequência");
        }

    }
}
