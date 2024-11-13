package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioMedia {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite suas duas notas: ");
        int nota1 = entrada.nextInt();
        int nota2 = entrada.nextInt();

        double media = (nota1 + nota2) / 2;
        System.out.println("Sua média é: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media < 7 && media > 4) {
            System.out.println("Recuperação!");
        } else
            System.out.println("Reprovado!");

        entrada.close();
    }

}
