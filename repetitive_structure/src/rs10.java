import java.util.Scanner;

public class rs10 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--Repetição com fatorial--\n");
        System.out.println("Digite um número inteiro positivo:");

        int N = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= N; i++) {
        
            fatorial *= i; 
        }

        System.out.printf("Fatorial de %d é %d", N, fatorial);

        sc.close();
    }

}
