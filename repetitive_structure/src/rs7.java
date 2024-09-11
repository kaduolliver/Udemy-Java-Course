import java.util.Scanner;

public class rs7 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--Dentro do intervalo/Fora do intervalo--\n");
        System.out.println("Digite um número inteiro para inserir a quantidade de repetições:");

        int N = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < N; i++) {

            int X = sc.nextInt();

            if (X > 10 && X < 20) {
                in++;
            }else {
                out++;
            }
        }

        System.out.printf("%d in\n", in);
        System.out.printf("%d out", out);

        sc.close();
    }

}
