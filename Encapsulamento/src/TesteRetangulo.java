import java.util.Scanner;

class TesteRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo r = new Retangulo();

        System.out.print("Digite o comprimento: ");
        r.setComprimento(sc.nextDouble());

        System.out.print("Digite a largura: ");
        r.setLargura(sc.nextDouble());

        System.out.println("Área: " + r.area());
        System.out.println("Perímetro: " + r.perimetro());

        sc.close();
    }
}