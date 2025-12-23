import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo1 = new Retangulo();


        System.out.print("Digite o comprimento: ");
        double comp = scanner.nextDouble();
        if (!retangulo1.setComprimento(comp)) {
            System.out.println("Comprimento inválido! Deve ser maior que 0 e menor que 20.");
        }

        System.out.print("Digite a largura: ");
        double larg = scanner.nextDouble();
        if (!retangulo1.setLargura(larg)) {
            System.out.println("Largura inválida! Deve ser maior que 0 e menor que 20.");
        }

        // se os dois forem válidos, calcula normalmente
        System.out.println("Perimetro: " + retangulo1.perimetro());
        System.out.println("Area: " + retangulo1.area());

        Retangulo retangulo2 = new Retangulo();
        System.out.println("Comprimento: " + retangulo2.getComprimento());
        System.out.println("Largura: " + retangulo2.getLargura());


        /*
        Para exibir dados tbm pode ser:
        1- metodo gets
        class:
        public double getComprimento() {
            return comprimento;
        }

        public double getLargura() {
            return largura;
        }

        main:
        System.out.println("Comprimento: " + retangulo2.getComprimento());
        System.out.println("Largura: " + retangulo2.getLargura());

        2- metodo exibição metodo na class:
        public void exibirDados() {
            System.out.println("Comprimento: " + comprimento);
            System.out.println("Largura: " + largura);
        }

        main:
        retangulo2.exibirDados();

        3- Sobrescrever toString() Esse é o jeito mais elegante em Java.
            Dentro da classe Retangulo:

            @Override
            public String toString() {
                return "Retangulo { comprimento = " + comprimento + ", largura = " + largura + " }";
            }

            main:
            System.out.println(retangulo2);

        * */

    }

}
