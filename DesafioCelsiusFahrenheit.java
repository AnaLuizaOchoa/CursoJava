package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioCelsiusFahrenheit {
    private static double f;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius: ");
        int a = entrada.nextInt();

        double f = (a * 1.8 + 32);
        System.out.printf("\nA temperatura em F é: %.2f", f);
    }
}
