import java.util.Scanner;

import java.util.Locale;

public class ex1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("\n---Plano telefônico---\n");
        System.out.println("Digite a quantidade de minutos usado na chamada telefônica:");
        int minutos = sc.nextInt();

        float valor = 50;
        int i = 2;

        if (minutos > 100){
            valor += (i * (minutos - 100));
            System.out.printf("Valor a pagar será de R$%.2f reais!\n", valor);
        }else{
            System.out.printf("Valor a pagar será de R$%.2f reais!\n", valor);
        }


        sc.close();
   }
}
