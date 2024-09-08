import java.util.Scanner;

public class ex3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
    
        System.out.println("\n--Ler números inteiros (Par/Ímpar)--\n");

        System.out.println("Digite um número inteiro:");
        int num = sc.nextInt();

        if (num % 2 == 0 && num != 0) {
            System.out.println("Esse número é par!");
        }else if (num == 0){
            System.out.println("Esse número é zero!");
        }else{
            System.out.println("Esse número é ímpar!");
        }


        sc.close();
    }
}
