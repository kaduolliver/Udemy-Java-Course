import java.util.Scanner;

public class rs8 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--Média ponderada--\n");
        System.out.println("Digite um número inteiro de 1 a 3:");

        int entrada = sc.nextInt();
        double total = 0;


        if (entrada <= 3 && entrada > 0) {

            System.out.printf("Digite %d números para fazer a média ponderada:\n", entrada);

            for (int i = 0; i < entrada; i++) {
                
                double A = sc.nextDouble();
                
                if (i == 0) {
                    A = A * 2.0;
                }else if (i == 1) {
                    A = A * 3.0;
                }else if (i == 2){
                    A = A * 5.0;
                }
                if (entrada == 1) {
                    System.out.println("Não há média ponderada com apenas 1 número!");
                    total = total + (A/2);
                }else if (entrada == 2){
                    total = total + (A/5);
                }else if (entrada == 3) {
                    total = total + (A/10);
                }
            }

            System.out.printf("O valor é %.2f", total);

        }else{
            System.out.println("Entrada inválida, digite um valor de 1 a 3!");
        }

        sc.close();
    }
}
