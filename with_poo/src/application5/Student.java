package application5;

import java.util.Scanner;

public class Student {

    Scanner sc = new Scanner(System.in);

    String name;
    double nota1, nota2, nota3, total, faltante;

    public void firstTrimester(){
        if (nota1 < 0 || nota1 > 30) {
            do {
                System.out.println("Fora de intervalo, digite novamente!");
                nota1 = sc.nextDouble();
            } while (nota1 < 0 || nota1 > 30);
        }
    }

    public void secondTrimester(){
        if (nota2 < 0 || nota2 > 35) {
            do {
                System.out.println("Fora de intervalo, digite novamente!");
                nota2 = sc.nextDouble();
            } while (nota2 < 0 || nota2 > 35);
        }
    }

    public void thirdTrimester(){
        if (nota3 < 0 || nota3 > 35) {
            do {
                System.out.println("Fora de intervalo, digite novamente!");
                nota3 = sc.nextDouble();
            } while (nota3 < 0 || nota3 > 35);
        }
    }
    
    public void result(){
        total = nota1 + nota2 + nota3;
    }

    public void missing(){
        if (total < 60) {
            faltante = 60 - total;
            System.out.println("Faltou: " + faltante);
        }
    }
    
    
}
