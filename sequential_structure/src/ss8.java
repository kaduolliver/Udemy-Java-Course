import java.util.Locale;
import java.util.Scanner;

public class ss8 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int A, B, C, D, resultado;

        System.out.println("Digite 4 valores inteiros para saber a diferença do produto entre eles!");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        resultado = (A*B - C*D);

        System.out.println("O resultado é: "+resultado);



        sc.close();
    }
}
