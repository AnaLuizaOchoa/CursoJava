package Desafios;

public class DesafioJantar_pessoa {
    public static void main(String[] args) {

        DesafioComida_pessoa c1 = new DesafioComida_pessoa("Arroz", 0.180);
        DesafioComida_pessoa c2 = new DesafioComida_pessoa("Feijão", 0.300);

        DesafioPessoa p = new DesafioPessoa("Joao", 99.8);

        System.out.println(p.apresentar());
        p.comer(c1);

        System.out.println(p.apresentar());
        p.comer(c2);

        System.out.println(p.apresentar());

        
    }

}
