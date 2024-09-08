import java.util.Scanner;

public class ex4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--Programa de múltiplos--\n");
        
        System.out.println("Digite 2 números inteiros:");
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São múltiplos!");
        }else{
            System.out.println("Não são múltiplos!");
        }

        sc.close();
    }
}
