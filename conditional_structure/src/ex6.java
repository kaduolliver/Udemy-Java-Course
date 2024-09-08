import java.util.Scanner;

public class ex6 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--Tabela de preços--\n");

        System.out.println("CÓDIGO    ESPECIFICAÇÃO       PREÇO");
        System.out.println("1         Cachorro Quente     R$ 4.00");
        System.out.println("2         X-Salada            R$ 4.50");
        System.out.println("3         X-Bacon             R$ 5.00");
        System.out.println("4         Torrada Simples     R$ 2.00");
        System.out.println("5         Refrigerante        R$ 1.50");

        System.out.println("Digite o código e a quantidade do item:");
        int cod = sc.nextInt();
        int qtdd = sc.nextInt();
        double total = 0;

        switch (cod) {
            case 1:
                total = qtdd * 4.00;
                break;
            case 2:
                total = qtdd * 4.50;
                break;
            case 3:
                total = qtdd * 5.00;
                break;
            case 4:
                total = qtdd * 2.00;
                break;
            case 5:
                total = qtdd * 1.50;
                break;
            default:
                System.out.println("Valor inválido!");
                break;
        }

        System.out.printf("Total: %.2f", total);
    }
}
