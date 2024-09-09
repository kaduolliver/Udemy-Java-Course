import java.util.Locale;
import java.util.Scanner;

public class ss7 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double area, r;
        double pi = 3.14159;

        System.out.println("Digite um valor númerico para atribuí-lo ao raio de um círculo:");
        r = sc.nextDouble();

        area = pi * (Math.pow(r, 2));

        System.out.printf("O valor de %.2f atribuido ao raio de um círculo resulta em uma área de %.4f", r, area);


        sc.close();
    }
}
