import java.util.Scanner;

public class rs6 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--Programa de valores ímpares--\n");
        System.out.println("Digite um valor para saber os números ímpares de 0 até ele:");

        int A = sc.nextInt();

        if (A >= 1 && A <= 1000) {
            
            for (int i = 0; i <= A; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
