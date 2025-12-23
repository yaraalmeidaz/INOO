import java.util.Scanner;

public class ComprimentoString {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== EXERCÍCIO 1: Comprimento da String ===");
        System.out.print("Digite uma string: ");
        String texto = sc.nextLine();

        System.out.println("Comprimento: " + texto.length() + " caracteres");

        // Remove todos os espaços antes de contar
        String textoSemEspacos = texto.replace(" ", "");
        int comprimentoSemEspacos = textoSemEspacos.length();

        System.out.println("Comprimento sem espaços: " + comprimentoSemEspacos + " caracteres");
    }
}