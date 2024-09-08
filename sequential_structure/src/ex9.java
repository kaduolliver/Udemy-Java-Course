import java.util.Scanner;
import java.util.Locale;

public class ex9 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int id, qtdd;
        double valor, resultado1, resultado2, valorT;

        System.out.println("Digite o id, a quantidade e o valor da peça 1: ");
        id = sc.nextInt();
        qtdd = sc.nextInt();
        valor = sc.nextDouble();

        resultado2 = qtdd * valor;

        System.out.println("Digite o id, a quantidade e o valor da peça 2: ");
        id = sc.nextInt();
        qtdd = sc.nextInt();
        valor = sc.nextDouble();

        resultado1 = qtdd * valor;
        valorT = resultado1 + resultado2;

        System.out.printf("O valor total a ser pago é R$ %.2f", valorT);

        sc.close();
    }
}
