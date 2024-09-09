import java.util.Scanner;

public class cs5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--Programa de Horários de um jogo!--\n");

        System.out.println("Digite 2 horarios inteiros para calcular:");
        int A = sc.nextInt();
        int B = sc.nextInt();

        int total;

        if (A == B) {
            total = 24;
        }else if (A > B) {
            total = (24 - A) + B;
        }else{
            total = B - A;
        }
        
        System.out.printf("O jogo durou %d horas!", total);


        sc.close();
    }
}
