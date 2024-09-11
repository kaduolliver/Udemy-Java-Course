import java.util.Scanner;

public class rs5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--Condição 'For'--\n");
        System.out.println("Digite um número de repetições:");

        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println("A soma dos números é: "+soma);





        sc.close();
    }
}
