import java.util.Scanner;
import java.util.Locale;

public class ss10 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int id1, id2;
        int qtdd1, qtdd2;
        double valor1, valor2, resultado1, resultado2, valorT;

        System.out.println("Digite o id, a quantidade e o valor da peça 1: ");
        id1 = sc.nextInt();
        qtdd1 = sc.nextInt();
        valor1 = sc.nextDouble();

        resultado1 = qtdd1 * valor1;

        System.out.println("Digite o id, a quantidade e o valor da peça 2: ");
        id2 = sc.nextInt();
        qtdd2 = sc.nextInt();
        valor2 = sc.nextDouble();

        resultado2 = qtdd2 * valor2;
        valorT = resultado1 + resultado2;

        System.out.printf("Os itens de ID %d e %d com quantidades de %d e %d sairá por:\n", id1, id2, qtdd1, qtdd2);
        System.out.printf("R$ %.2f [%d x R$ %.2f + %d x R$ %.2f]", valorT, qtdd1, valor1, qtdd2, valor2);

        sc.close();
    }
}
