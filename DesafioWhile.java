package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        //! CALCULAR A MEDIA DE UMA TURMA, (N SE SABE O NUMERO DE ALUNOS) USUARIO VAI DIGITAR UMA NOTA (VÁLIDA) DE 0 A 10
        //! E DPS ARMAZENAR AS NOTAS EM UMA VARIAVEL CHAMADA TOTAL, E SEMPRE QUE UMA NOVA NOTA FOR DIGITADA 
        //! ACRESCENTAR NA VARIAVEL (TOTAL). O TOTAL VAI ARMAZENAR A SOMA DE TODAS AS NOTAS.
        //! CRIAR OUTRA VARIAVEL PARA DEFINIR QUANTAS NOTAS VÁLIDAS FORAM DIGITADAS.

        Scanner entrada = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1) {
            System.err.print("INforme a nota (ou -1 para sair): ");
            nota = entrada.nextDouble();

            if (nota <= 10 && nota >= 0) {
            total += nota;
            quantidadeDeNotas++;
            } else if (nota != -1) {
                System.out.println("Nota inválida! ");
            }
        }

        //! calcular a média
        double media = total / quantidadeDeNotas;
        System.out.println("Média = " + media);
        
        entrada.close();
    }

}
