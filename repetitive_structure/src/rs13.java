import java.util.Scanner;

public class rs13 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Teste da estrutura repetitiva do-while--\n");
        
        double C, F;
        String sn;
        String s = "s";

        do {
            System.out.println("Transforme uma temperatura em Celsius para Fahrenheit:");
            C = sc.nextDouble();
            F = (9 * C)/ 5 + 32;
            System.out.println(F);

            System.out.println("Deseja repetir? (s/n)");
            sn = sc.next();

        } while (sn.equals(s));
    
        sc.close();
    }

}
