import java.util.Scanner;
import java.util.Locale;

public class cs8 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("\n---Programa de localização de quadrantes---\n");
        System.out.println("                  |y                     ");
        System.out.println("      Q2          |         Q1           ");
        System.out.println("                  |                      ");
        System.out.println("                  |                     x");
        System.out.println("-----------------------------------------");
        System.out.println("                  |                      ");
        System.out.println("      Q3          |          Q4          ");
        System.out.println("                  |                      ");
        System.out.println("                  |                      ");
        System.out.println();
        //Q1 = Sempre positivo
        //Q2 = X (negativo), Y (positivo)
        //Q3 = Sempre negativo
        //Q4 = X (positivo), Y (negativo)

        System.out.println("Digite 2 números flutuantes para localizalos:");
        double X = sc.nextDouble();
        double Y = sc.nextDouble();

        if (X == 0 && Y == 0) {
            System.out.println("Origem!");
        }else if (X > 0 && Y > 0) {
            System.out.println("Q1");
        }else if (X < 0 && Y > 0) {
            System.out.println("Q2");
        }else if (X < 0 && Y < 0) {
            System.out.println("Q3");
        }else if (X > 0 && Y < 0) {
            System.out.println("Q4");
        }else{
            System.out.println("Fora dos quadrantes!");
        }

        sc.close();
    }

}
