package application3;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Rectangle rec = new Rectangle();

        System.out.println("\n--Área de um retângulo--\n");
        
        System.out.println("Width(Largura):");
        rec.width = sc.nextDouble();

        System.out.println("Height(Altura:)");
        rec.height = sc.nextDouble();

        System.out.println("Área: " + rec.area());
        System.out.println("Perímetro: " + rec.perimeter());
        System.out.println("Diagonal: " + rec.diagonal());

        sc.close();
    }

}
