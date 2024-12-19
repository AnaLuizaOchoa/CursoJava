package Desafios;

public class DesafioPessoa {
    
    String nome;
    double peso;

    DesafioPessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(DesafioComida_pessoa comida){
        if(comida != null){
            this.peso += comida.peso;
        }
    }

    String apresentar (){
        return "Olá eu sou o " + nome + " e tenho " + peso + "Kgs.";
    }
}
