package fundamentos.Desafios;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        
        //numero com potência 
        // int a = 3 * 4 - 10;
        // int b = (int) Math.pow(a, 3);

        var a = 6*(3+2);
        var b= (int) Math.pow(a, 2);

        var c = ((1-5)*(2-7)/2);
        var d = b / (3*2);

        var e = (int) Math.pow(c, 2);
        var f = (d - e);

        var g = (int) Math.pow(f, 3);
        var h = Math.pow(10, 03);
        var i = g / h;

        System.out.println(i);
        

    }
}
