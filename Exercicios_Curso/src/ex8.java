import java.util.Scanner;
import java.util.Locale;

public class ex8 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int id, hours;
        double payment, salary;

        System.out.println("Digite o número de identificação, quantidades de horas e o salário por hora de um funcionário:");
        id = sc.nextInt();
        hours = sc.nextInt();
        payment = sc.nextDouble();

        salary = hours * payment;

        System.out.printf("O funcionário de ID %d recebe R$ %.2f", id, salary);
        

        sc.close();
    }

}
