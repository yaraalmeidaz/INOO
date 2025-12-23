import java.util.Scanner;

public class CompararSequencia {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== COMPARAR COM SEQUÊNCIA ===");
        System.out.print("Digite a primeira string: ");
        String str1 = sc.nextLine();
        System.out.print("Digite a segunda string: ");
        String str2 = sc.nextLine();

        boolean saoIguais = str1.equals(str2);

        System.out.println("Comparando " + str1 + " e " + str2 + ": " + saoIguais);
    }
}