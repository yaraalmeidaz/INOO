import java.util.Scanner;

public class Retangulo {
    private double comprimento;
    private double largura;

    // Getters
    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setComprimento(double comprimento) {
        if(comprimento > 0.0 && comprimento < 20.0) {
            this.comprimento = comprimento;
        } else {
            System.out.println("Comprimento inválido! Deve ser >0.0 e <20.0");
        }
    }

    public void setLargura(double largura) {
        if(largura > 0.0 && largura < 20.0) {
            this.largura = largura;
        } else {
            System.out.println("Largura inválida! Deve ser >0.0 e <20.0");
        }
    }

    // Métodos para calcular perímetro e área
    public double area() {
        return comprimento * largura;
    }

    public double perimetro() {
        return 2 * (comprimento + largura);
    }
}

/*Slide: só explicou atributos, métodos get e set, validação básica, encapsulamento (private + public).

Código que eu fiz:

Adicionei métodos area() e perimetro() que calculam valores.

Diferença: o slide não entra em detalhes de como calcular áreas ou perímetros, ele só fala de métodos.

Resumo: cálculo dentro de métodos é só aplicação prática do que o slide já explicou sobre métodos.*/

public boolean setComprimento(double comprimento) {
    if (comprimento > 0 && comprimento < 20) {
        this.comprimento = comprimento;
        return true; // deu certo
    } else {
        return false; // inválido
    }
}

public boolean setLargura(double largura) {
    if (largura > 0 && largura < 20) {
        this.largura = largura;
        return true;
    } else {
        return false;
    }