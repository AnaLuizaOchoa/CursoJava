package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioResultadoCubo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = entrada.nextDouble();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(quadrado, 3);

        System.out.printf("\nO valor ao quadrado é: %.2f", quadrado);
        System.out.printf("\nO valor ao cubo é: %.2f", cubo);

        entrada.close();
    }

}
