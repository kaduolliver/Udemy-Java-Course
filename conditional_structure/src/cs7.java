import java.util.Scanner;
import java.util.Locale;

public class cs7 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("\n---Programa de intervalos---\n");
        System.out.println("Digite um número para saber o intervalo dele:");
        double A = sc.nextDouble();

        if (A <= 25 && A >= 0) {
            System.out.println("Intervalo: [0,25]");
        }else if (A > 25 && A <= 50) {
            System.out.println("Intervalo: (25,50]");
        }else if (A > 50 && A <= 75) {
            System.out.println("Intervalo: (50,75]");
        }else if (A > 75 && A <= 100) {
            System.out.println("Intervalo: (75,100]");
        }else{
            System.out.println("Fora de intervalo!");
        }

        sc.close();
    }
}
