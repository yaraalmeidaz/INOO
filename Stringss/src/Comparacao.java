import java.util.Scanner;

public class Comparacao{
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== EXERCÍCIO: Comparação Lexicográfica ===");
        System.out.print("Digite a String1: ");
        String texto1 = sc.nextLine();
        System.out.print("Digite a String2: ");
        String texto2 = sc.nextLine();

        int comparacao = texto1.compareTo(texto2);
        if (comparacao < 0) {
            System.out.println("String 1 é menor que String 2");
        } else if (comparacao > 0) {
            System.out.println("String 1 é maior que String 2");
        } else {
            System.out.println("Strings são iguais");
        }
    }
}