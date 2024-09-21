package application9;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--Conversão de Litros para Quilômetros Rodados--\n");

        System.out.println("Quantos km o carro faz por litro de combustivel?");
        double consumptionPerLiter = sc.nextDouble();

        System.out.println("Qual o preço do litro de combustivel?");
        double price = sc.nextDouble();

        System.out.println("Quantos litros de combustivel deseja colocar?");
        Car.fuelAmount = sc.nextDouble();

        double total = Car.totalPrice(price);

        System.out.printf("Valor total a ser pago: R$%.2f\n", total);

        double distance = Car.distanceCalculator(consumptionPerLiter);
        System.out.printf("Distância que irá percorrer: %.2f KM\n", distance);


        sc.close();
    }
}
