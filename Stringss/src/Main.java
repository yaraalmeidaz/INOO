import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== EXERCÍCIOS ===");
        System.out.println("1. Comprimento da String");
        System.out.println("2. Substituir caracteres");
        System.out.println("3. Dividir string em palavras");
        System.out.println("4. Comparação Lexicográfica");
        System.out.println("5. Comparação sem case sensitive");
        System.out.println("6. Concatenar duas strings");
        System.out.println("7. Vericar se contém Substring");
        System.out.println("8. Comparar com Sequência");
        System.out.println("9. Índice do Alfabeto");
        System.out.println("10. Converter para Minúsculas");
        System.out.println("11. Executar TODOS os exercícios");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer

        switch (opcao) {
            case 1:
                ComprimentoString.executar();
                break;
            case 2:
                Substituir.executar();
                break;
            case 3:
                DividirString.executar();
                break;
            case 4:
                Comparacao.executar();
                break;
            case 5:
                ComparacaoSensitive.executar();
                break;
            case 6:
                Concratenar.executar();
                break;
            case 7:
                VericarSubstring.executar();
                break;
            case 8:
                CompararSequencia.executar();
                break;
            case 9:
                IndiceAlfabeto.executar();
                break;
            case 10:
                ConverterMinusculas.executar();
                break;
            case 11:
                ComprimentoString.executar();
                Substituir.executar();
                DividirString.executar();
                Comparacao.executar();
                ComparacaoSensitive.executar();
                Concratenar.executar();
                VericarSubstring.executar();
                CompararSequencia.executar();
                IndiceAlfabeto.executar();
                ConverterMinusculas.executar();
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}