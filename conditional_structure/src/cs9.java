import java.util.Locale;
import java.util.Scanner;

public class cs9 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("\n---Imposto de Renda---\n");
        System.out.println("| Renda                           |      I.R.      |");
        System.out.println("| de R$0.00 a R$2000.00           |     Isento     |");
        System.out.println("| de R$2001.00 até R$3000.00      |       8%       |");
        System.out.println("| de R$3001.00 até R$4500.00      |      18%       |");
        System.out.println("| acima de R$4500.00              |      28%       |");

        System.out.println("Digite seu salário para saber quanto de I.R. terá que pagar:");
        double A = sc.nextDouble();
        double total;

        if (A > 0 && A <= 2000.00) {
            System.out.println("Isento de imposto de renda!");
        }else if (A > 2000.00 && A <= 3000.00) {
            total = (A - 2000) * 8/100;
            System.out.printf("R$%.2f",total);

        }else if (A > 3000.00 && A <= 4500.00) {
            total = 1000 * 8/100 + (A - 3000) * 18/100;
            System.out.printf("R$%.2f",total);

        }else if (A > 4500.00) {
            total = (1000 * 8/100) + (1500 * 18/100) + ((A - 4500) * 28/100);
            System.out.printf("R$%.2f",total);

        }else{
            System.out.println("Valor inválido!");
        }


        sc.close();
    }
}
