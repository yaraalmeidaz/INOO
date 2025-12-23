import java.util.Scanner; // 1. importando a classe Scanner
public class Exemplo1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
        int valor1, valor2;
        System.out.println("Exercicio Produto simples e Média 1\n");

        System.out.println("Informe o primeiro valor: ");
        valor1 = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)
        System.out.println("Informe o segundo valor: ");
        valor2 = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)

        System.out.println("\nResultados:\n");
        System.out.printf("Produto simples: %2d * %2d = %3d\n", valor1, valor2, (valor1 * valor2));
        //mudei a variavel %3f\n", a, b, ((a + b)/2.0f));
        System.out.printf("Media (%d + %d ) / 2 = %3f\n", valor1, valor2, ((valor1 + valor2) / 2.0f));

        double valorIntervalo;
        System.out.print("\n\nDigite um numero e descubra em que intervalo ele esta:");
        valorIntervalo = ler.nextDouble();

        if (valorIntervalo >= 0 && valorIntervalo <= 25) {
            System.out.print("Intervalo [0,25]");
        } else if (valorIntervalo > 25 && valorIntervalo <= 50) {
            System.out.print("Intervalo (25,50]");
        } else if (valorIntervalo > 50 && valorIntervalo <= 75) {
            System.out.print("Intervalo (50,75]");
        } else if (valorIntervalo > 75 && valorIntervalo <= 100) {
            System.out.print("Intervalo (75,100]");
        } else {
            System.out.print("Fora de intervalo");
        }

        System.out.println("\n\nCalcular Area:\n");
        double a, b, c;
        System.out.println("Valor A: ");
        a = ler.nextDouble(); // 3. entrada de dados (lendo um valor inteiro)
        System.out.println("Valor B: ");
        b = ler.nextDouble();
        System.out.println("Valor B: ");
        c = ler.nextDouble();

        double areaTriangulo = (a * c) / 2,
                areaCirculo = (3.14159 * (c * c)),
                areaTrapezio = ((a + b) * c) / 2,
                areaQuadrado = b * b,
                areaRetangulo = a * b;

        System.out.printf("Triangulo: %.3f\n", areaTriangulo);
        System.out.printf("Circulo: %.3f\n", areaCirculo);
        System.out.printf("Trapezio: %.3f\n", areaTrapezio);
        System.out.printf("Quadrado: %.3f\n", areaQuadrado);
        System.out.printf("Retangulo: %.3f\n", areaRetangulo);

        System.out.println("\n\nDescubra o quadrante!\nDigite x: ");
        double x = ler.nextDouble();
        System.out.println("Digite y: ");
        double y = ler.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {  // y != 0 implícito
            System.out.println("Eixo Y");
        } else if (y == 0) {  // x != 0 implícito
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {  // x > 0 && y < 0
            System.out.println("Q4");
        }

    }
}
