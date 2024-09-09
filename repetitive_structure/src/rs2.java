import java.util.Scanner;

public class rs2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n---Programa de leitura de senha---\n");
        System.out.println("Adivinhe a senha digitando 4 digitos:");
        //int senha = sc.nextInt();
        int senha = 0;

        senha = sc.nextInt();

        while (senha >= 0 && senha <= 9999 && senha != 2002) {

            System.out.println("Senha Inválida, tente novamente!");
            senha = sc.nextInt();

        }

        System.out.println("Acesso permitido!");


        sc.close();
    }
}
