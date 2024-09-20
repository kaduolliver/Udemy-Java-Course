package application;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("\n--Resolução de um problema sem utilizar POO--\n");
        System.out.println("--Calculo da area de 2 triângulos--\n");
        
        System.out.println("Digite 3 números para X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite 3 valores para Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.println("Triângulo X: " + areaX);
        System.out.println("Triângulo Y: " + areaY);

        if (areaX > areaY) {
            System.out.println("Área do triângulo X é maior!");
        }else{
            System.out.println("Área do triângulo Y é maior!");
        }

        sc.close();
    }
}

