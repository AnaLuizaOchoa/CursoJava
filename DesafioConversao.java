package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        //Desafio é converter uma String para numero e falar a média

        //chamei o scanner primeiro para o usuario digitar 
        Scanner entrada = new Scanner(System.in);

        System.err.println("Informe o primeiro salário: ");
        String valor1 = entrada.next().replace(",", "."); 
        //coloquei o .replace pois se o usuario colocar o salario com virgula ele converte para ponto

        System.err.println("Informe o segundo salário: ");
        String valor2 = entrada.next().replace(",", "."); 

        System.err.println("Informe o terceiro salário: ");
        String valor3 = entrada.next().replace(",", "."); 
        
        //convertendo 
        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) /3;

        System.out.println("A média dos salários é: "+media);

        entrada.close();
    }
}
