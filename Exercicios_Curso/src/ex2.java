import java.util.Scanner;

public class ex2 {

    public static void main(String[] args){

        //Função para entrada de dados
        Scanner sc = new Scanner(System.in);

        //Variáveis
        String a1, a2, a3;
        int x;
        char b;

        //Entrada de dados para números inteiros
        x = sc.nextInt();

        //Quebra de linha com nextLine
        sc.nextLine();

        //Entrada de dados para palavras com quebra de linha
        a1 = sc.nextLine();
        a2 = sc.nextLine();
        a3 = sc.nextLine();

        //Entrada de dados para char, retorna a primeira letra de uma string
        b = sc.next().charAt(0);

        //Impressão
        System.out.println("Entrada de Dados:");
        System.out.println(x);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(b);

        //Componente do Scanner
        sc.close();

    }

}
