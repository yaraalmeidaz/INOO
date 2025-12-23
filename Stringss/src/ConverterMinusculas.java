import java.util.Scanner;

public class ConverterMinusculas {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== CONVERTER PARA MINÚSCULAS ===");
        System.out.print("Digite uma string: ");
        String original = sc.nextLine();

        String minusculas = original.toLowerCase();

        System.out.println("String original: " + original);
        System.out.println("String em minúsculas: " + minusculas);
    }
}