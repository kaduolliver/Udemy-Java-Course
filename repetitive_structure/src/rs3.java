import java.util.Scanner;

public class rs3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--Coordenadas do Plano Cartesiano--\n");
        
        System.out.println("                  |y                     ");
        System.out.println("      Q2          |         Q1           ");
        System.out.println("                  |                      ");
        System.out.println("                  |                     x");
        System.out.println("-----------------------------------------");
        System.out.println("                  |                      ");
        System.out.println("      Q3          |          Q4          ");
        System.out.println("                  |                      ");
        System.out.println("                  |                      ");
        System.out.println();

        //Q1 = Sempre positivo
        //Q2 = X (negativo), Y (positivo)
        //Q3 = Sempre negativo
        //Q4 = X (positivo), Y (negativo)
        
        System.out.println("Digite 2 valores para se situar no plano cartesiano:");
        double X = sc.nextDouble();
        double Y = sc.nextDouble();

        while (X != 0 && Y != 0) {

            if (X > 0 && Y > 0) {
                System.out.println("Primeiro Quadrante!");
            }else if (X < 0 && Y > 0) {
                System.out.println("Segundo Quadrante!");
            }else if (X < 0 && Y < 0) {
                System.out.println("Terceiro Quadrante!");
            }else if (X > 0 && Y < 0) {
                System.out.println("Quarto Quadrante!");
            }
            X = sc.nextDouble();
            Y = sc.nextDouble();
        }
        
        if (X == 0 && Y == 0) {
            System.out.println("Origem!");
        }else{
        System.out.println("Nenhum Quadrante!");
        }


        sc.close();
    }
}
