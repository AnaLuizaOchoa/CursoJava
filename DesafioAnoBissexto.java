package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioAnoBissexto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o ano e eu falarei se é ano bissexto: ");

        int ano = entrada.nextInt();

        boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0);

        if (bissexto == true) {
            System.out.println(ano + " é um ano bissexto!");
        } else {
            System.out.println(ano + " não é ano bissexto!");
        }

        entrada.close();
    }

}
