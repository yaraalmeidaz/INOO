import java.util.Scanner;

public class TesteCaneta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Caneta caneta = new Caneta();

        System.out.print("Digite a cor da caneta: ");
        caneta.cor = sc.nextLine();

        System.out.print("Digite o tipo da caneta: ");
        caneta.tipo = sc.nextLine();

        System.out.print("Digite a carga da caneta (número): ");
        caneta.carga = sc.nextInt();

        System.out.print("A tampa está fechada? (true/false): ");
        caneta.tampa = sc.nextBoolean();

        sc.nextLine(); // limpar buffer
        System.out.print("Digite uma palavra para escrever: ");
        String palavra = sc.nextLine();

        caneta.mostrarDetalhes();
        caneta.escrever(palavra);
        System.out.println("Carga restante: " + caneta.carga);

        sc.close();
    }
}




/*
public class main {
    public static void main(String[] args) {
        caneta caneta1 = new caneta();
        caneta1.cor = "Azul";
        caneta1.tipo = "Bic";
        caneta1.carga = 10;
        caneta1.tampa = true;

        caneta1.mostrarDetalhes();
        caneta1.escrever("Olá"); // gasta 3 unidades de carga
        System.out.println("Carga restante: " + caneta1.carga);
    }
}
*/