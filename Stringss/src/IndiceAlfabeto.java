import java.util.Scanner;

public class IndiceAlfabeto {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== ÍNDICE DO ALFABETO ===");
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine().toLowerCase();

        System.out.println("abcdefghij");
        System.out.println("==========");

        for (char letra = 'a'; letra <= 'j'; letra++) {
            int indice = frase.indexOf(letra);
            System.out.print(indice + " ");
        }

        System.out.println("\nklmnopqrst");
        System.out.println("==========");

        for (char letra = 'k'; letra <= 't'; letra++) {
            int indice = frase.indexOf(letra);
            System.out.print(indice + " ");
        }

        System.out.println("\nuvwxyz");
        System.out.println("======");

        for (char letra = 'u'; letra <= 'z'; letra++) {
            int indice = frase.indexOf(letra);
            System.out.print(indice + " ");
        }

        System.out.println();
    }
}