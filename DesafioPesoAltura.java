package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioPesoAltura {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        float peso = entrada.nextFloat();

        System.out.println("Digite sua altura: ");
        float altura = entrada.nextFloat();

        double imc = (peso / (altura * altura));
        System.out.println("Seu IMC é: " + imc);
        


        entrada.close();
    }

}
