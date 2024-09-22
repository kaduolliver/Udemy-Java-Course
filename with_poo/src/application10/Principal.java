package application10;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--Despesas de uma viagem--\n");

        System.out.println("Qual a distância da viagem?");
        double distance = sc.nextDouble();

        System.out.println("Qual o consumo do veículo (kms por litro)?");
        double consumption = sc.nextDouble();

        System.out.println("Preço do litro de combustível:");
        double fuelPrice = sc.nextDouble();

        int result = Travel.toll(distance);

        System.out.println("Há pedágios a cada 100km, sendo assim, o total de pedágios é: " + result);

        double cost = Travel.consump(distance, consumption);

        System.out.printf("A quantidade necessária de combustível para essa viagem será de: %.2f litros\n", cost);

        double total = Travel.totalCost(result, fuelPrice, cost);

        System.out.printf("O custo total da viagem será de: R$%.2f reais\n", total);

    
        sc.close();
    }
}
