package Desafios;

public class DataMain {
    public static void main(String[] args) {

        Data d1 = new Data();
        //d1.dia = 02;
        //d1.mes = 02;
        d1.ano = 2006;

        
        var d2 = new Data(26,11,2005);
        //d2.dia = 26;
        //d2.mes = 11;
        //d2.ano = 2005;
        
        //System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
        //System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        d1.imprimirDataFormatada();
        
    }

}
