import java.util.Scanner;

public class rs11 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
    
        System.out.println("\n--Leitura de divisores--\n");
        System.out.println("Digite um número inteiro não negativo para saber seus divisores:");

        int N = sc.nextInt();
            
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                //System.out.print(" "+i);
                System.out.println(i);
            }
        }
        sc.close();
    }
}
