import java.util.Scanner;

public class ss6 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a, b, soma;

        System.out.println("Digite 2 valores inteiros para somá-los:");
        a = sc.nextInt();
        b = sc.nextInt();

        soma = a + b;

        System.out.println("Soma = "+soma);

        sc.close();
    }
}
