import java.util.Scanner;

public class ss4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        System.out.println("Digite uma palavra, um número inteiro e um número decimal:");

        //Leitura de dados separados apenas por "Space"
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        
        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


        sc.close();
    }

}
