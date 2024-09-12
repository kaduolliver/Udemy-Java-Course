import java.util.Scanner;

public class rs12 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--Listagem númerica de quadrados e cubos--\n");
        System.out.println("Digite um número inteiro:");

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            
            if (N != 0) {
                System.out.print(i);
                
                int A = i * i;
                System.out.print(" "+A);

                int B = i * i * i;
                System.out.print(" "+B);

                System.out.println();

            }
            sc.close();
        }
    }

}
