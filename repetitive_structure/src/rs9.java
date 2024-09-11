import java.util.Scanner;
import java.util.Locale;

public class rs9 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("\n--Calculadora de divisão--\n");
        System.out.println("Informe a quantidade necessária de divisões:");

        int entrada = sc.nextInt();
        double total = 0;
        int[] num1 = new int[entrada];
        int[] num2 = new int[entrada];

        if (entrada > 0 && entrada <= 10) {

            System.out.printf("A quantidade informada é %d. Digite 2 números %d vezes para calculá-los:\n", entrada, entrada);

            for (int i = 0; i < entrada; i++) {
                
                num1[i] = sc.nextInt(); //10
                num2[i] = sc.nextInt(); //2 = 5
                
                if (num2[i] == 0) {
                    System.out.println("Impossível dividir por zero!");

                }   
            }
            System.out.println("Resultado dos números calculados:");

            for (int i = 0; i < entrada; i++) {

                if (i == 0) {
                    total = (double) num1[i]/num2[i];
                }else if (i > 0) {
                    total = (double) num1[i]/num2[i];
                }
                System.out.println(total); 
            }
        }
        sc.close();
    }

}
