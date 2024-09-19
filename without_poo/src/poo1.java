import java.util.Scanner;

public class poo1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--Resolução de um problema sem utilizar POO--\n");
        System.out.println("--Calculo da area de 2 triângulos--\n");
        
        System.out.println("Digite 3 números para X:");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        System.out.println("Digite 3 valores para Y:");
        double D = sc.nextDouble();
        double E = sc.nextDouble();
        double F = sc.nextDouble();

        double p1 = (A+B+C)/2;
        double p2 = (D+E+F)/2;

        double area1 = Math.sqrt(p1 * (p1 - A) * (p1 - B) * (p1 - C));
        double area2 = Math.sqrt(p2 * (p2 - D) * (p2 - E) * (p2 - F));

        System.out.println("Triângulo X: " + area1);
        System.out.println("Triângulo Y: " + area2);

        if (area1 > area2) {
            System.out.println("Área do triângulo X é maior!");
        }else{
            System.out.println("Área do triângulo Y é maior!");
        }

        sc.close();
    }
}
