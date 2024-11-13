package fundamentos.Desafios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número e eu irei falr se é impar ou par: ");

        int i = entrada.nextInt();

        if (i % 2 == 0) {
            System.out.println("Numero par: " + i);
        } else if (i % 2 == 1) {
            System.out.println("Numero impar: " + i);

        }
        entrada.close();
    }

}
