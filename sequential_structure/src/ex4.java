import java.util.Scanner;
import java.util.Locale;

public class ex4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("\n---Funções Matemáticas---\n\n");

        int x = 9;
        int y = 2;
        int z = -10;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.pow(x, y);
        C = Math.abs(z);


        Locale.setDefault(Locale.US);

        System.out.printf("A raiz quadrada de %d é %.2f\n", x, A);
        System.out.printf("%d elevado a potência %d é %.2f\n", x, y, B);
        System.out.printf("O valor absoluto de %d é %.2f\n", z, C);


        int a = 1;
        int b = -3;
        int c = -54;
        double delta, x1, x2;

        delta = Math.pow(b, 2) - 4 * a * c;

        x1 = (-b + Math.sqrt(delta))/ (2 * a);
        x2 = (-b - Math.sqrt(delta))/ (2 * a);

        System.out.printf("O valor de delta é %.2f\n", delta);
        System.out.printf("O valor de X¹ é %.2f\n", x1);
        System.out.printf("O valor de X² é %.2f\n", x2);




        sc.close();
    }

}
