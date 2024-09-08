import java.util.Scanner;

public class ex2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro para saber se ele é negativo ou não:");
        int i = sc.nextInt();

        if (i >= 0) {  
            System.out.println("Esse número é positivo!");
        }else{
            System.out.println("Esse número é negativo!");
        }


        sc.close();
    }
}
