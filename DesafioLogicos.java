package fundamentos.Desafios;

public class DesafioLogicos {
    public static void main(String[] args) {
        //Trabalho na terca (v ou F)
        //Trabalho na quinta (V ou F)

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        //opeardor Unário   
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou Tv 50\"? " + comprouTv50);
        System.out.println("Comprou Tv 32\"? " + comprouTv32);
        System.out.println("Tomou sorvete\"?" +comprouSorvete);

        System.out.println("Mais saudável? " +comprouSorvete);






    }
}
