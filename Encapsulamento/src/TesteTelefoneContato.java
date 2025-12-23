import java.util.Scanner;

public class TesteTelefoneContato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Testando a classe Telefone ---
        System.out.println("=== Teste da classe Telefone ===");
        Telefone t1 = new Telefone(55, 16, "99999-9999"); // todos os parâmetros
        Telefone t2 = new Telefone(11, "98888-8888");     // área + número (país padrão 55)
        Telefone t3 = new Telefone("97777-7777");         // apenas número (padrão 55 e 16)

        System.out.println(t1.getNumeroCompleto());
        System.out.println(t2.getNumeroCompleto());
        System.out.println(t3.getNumeroCompleto());

        // --- Testando a classe Contato ---
        System.out.println("\n=== Teste da classe Contato ===");

        Contato c1 = new Contato("Maria", "Silva", "96666-6666");
        Contato c2 = new Contato("João", "Pereira", 21, "95555-5555");
        Contato c3 = new Contato("Ana", "Costa", 351, 91, "94444-4444");
        Contato c4 = new Contato("Carlos", "Oliveira", new Telefone(1, 305, "93333-3333"));

        c1.mostrarContato();
        c2.mostrarContato();
        c3.mostrarContato();
        c4.mostrarContato();

        // --- Exemplo com entrada do usuário ---
        System.out.println("\n=== Criando Contato digitado pelo usuário ===");
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.print("Digite o número do telefone: ");
        String numero = sc.nextLine();

        Contato usuario = new Contato(nome, sobrenome, numero);
        usuario.mostrarContato();

        sc.close();
    }
}
