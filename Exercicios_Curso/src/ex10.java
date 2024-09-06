import java.util.Scanner;
import java.util.Locale;

public class ex10 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A, B, C;
        double pi = 3.14159;

        System.out.println("Digite 3 valores para atribuí-los a área de formas geométricas:");

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        // a) a área do triângulo retângulo que tem A por base e C por altura.
        // b) a área do círculo de raio C. (pi = 3.14159)
        // c) a área do trapézio que tem A e B por bases e C por altura.
        // d) a área do quadrado que tem lado B.
        // e) a área do retângulo que tem lados A e B  

        double areaT = A * C / 2;
        double areaC = pi * (Math.pow(C, 2));
        double areaTrap = (A+B) * C / 2;
        double areaQ = Math.pow(B, 2);
        double areaR = A * B;

        System.out.printf("Triangulo: %.3f\n", areaT);
        System.out.printf("Círculo: %.3f\n", areaC);
        System.out.printf("Trapézio: %.3f\n", areaTrap);
        System.out.printf("Quadrado: %.3f\n", areaQ);
        System.out.printf("Retângulo: %.3f\n", areaR);


        sc.close();
    }
}
