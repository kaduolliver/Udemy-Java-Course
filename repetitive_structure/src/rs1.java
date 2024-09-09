import java.util.Scanner;

public class rs1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n---Exemplo de repetição 'while'---\n");
        System.out.println("Digite um número inteiro:");
        
        int A = sc.nextInt();
        int soma = 0;

        while (A != 0) {
             soma = soma + A;
             A = sc.nextInt();
        }

        System.out.println("A soma dos números é:"+soma);

        sc.close();
    }
}
