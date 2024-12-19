package Desafios;

import java.util.Arrays;
import java.util.Scanner;

public class Array_foreach {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas: "); // ! exibimos a pergunta
        int qtdeNotas = entrada.nextInt(); // ! informou a quantidade de notas

        double[] notas = new double[qtdeNotas]; // ! criamos o array

        for (int i = 0; i < notas.length; i++) {
            System.err.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        } // ! varias repeticoes para pedir as notas ao usuario

        double total = 0;
        for (double nota : notas) {
            total += nota;
        } // ! percorrer todos os elementos sem precisar criar variavel
          // ! somamos todas as notas no total

        System.out.println(Arrays.toString(notas));

        double media = total / notas.length;
        System.out.println("A média é " + media + "!");
        // ! calculamos a média

        entrada.close();
    }
}
