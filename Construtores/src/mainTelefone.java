import java.util.Scanner;

public class mainTelefone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Teste da classe Telefone ===");
        System.out.print("Digite o número do telefone: ");
        String numero = sc.nextLine();

        /* teste
        poderia ser tambem:
        System.out.println(contato1.getNumeroCompleto()); //sem precisar criar uma função

        Telefone contato1 = new Telefone(numero);

        contato1.mostrarDados();
        */

        //só o número (55 e 16 como padrão)
        Contato contato1 = new Contato("Yara", "Almeida", numero);
        contato1.mostrarContato();

        //usando área + número
        Contato contato2 = new Contato("Luana", "Martins", 21, "99999-8008");
        contato2.mostrarContato();

        //usando país + área + número
        Contato contato3 = new Contato("Laura", "Diva", 1, 305, "9999-66234"); // coloquei aleatorio
        contato3.mostrarContato();

        //passando um objeto Telefone já pronto
        Telefone tel = new Telefone(351, 91, "12345-6789"); // Portugal (351), Lisboa (91)
        Contato contato4 = new Contato("Bolivia", "Belinelli", tel);
        contato4.mostrarContato();

        sc.close();
    }
}
