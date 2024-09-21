package application8;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--Cotação e Compra do Dólar--\n");
        
        System.out.println("Qual a atual cotação do dólar (Real -> Dolar)?");
        Dolar.price = sc.nextDouble();

        System.out.println("Quantos dólares deseja comprar?");
        double buy = sc.nextDouble();

        double total = Dolar.converter(buy);

        System.out.printf("Total a ser pago: R$%.2f\n", total);

        sc.close();
    }

}
