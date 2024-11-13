package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        //ler 1 num
        //ler 2 num
        // + - / %

        Scanner entrada = new Scanner(System.in);

        System.err.println("Informe o número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Informe o número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Informe a operação: ");
        String op = entrada.next();

        //Lógica

        //se + for igual ao valor de OPERAÇÃO, significar que ele vai ter num1 + num2, caso contrario é igual a 0
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        // se - for igual ao valor de operação, significa que ele vai ter num1 - num2, caso contrario ele retorna ao valor de resultado 
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;


        // %f para exibir o double, %s para exibir a operação
        System.out.printf("%.2f %s %.2f = %.2f ", num1, op, num2, resultado);

        entrada.close();

    }
}
