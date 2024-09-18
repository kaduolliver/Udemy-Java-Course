import java.util.Scanner;

public class om4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--Qual o maior número inteiro--\n");
        System.out.println("Digite 3 números inteiros para saber qual é maior entre eles:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.printf("%d é maior!", a);
        }else if (b > a && b > c) {
            System.out.printf("%d é maior!", b);
        }else if(c > a && c > b){
            System.out.printf("%d é maior!", c);
        }else{
            System.out.println("Há um empate entre dois ou mais números!");
        }

        sc.close();
    }

}
