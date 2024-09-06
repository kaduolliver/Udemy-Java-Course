import java.util.Locale;

public class Main {

    public static void main(String[] args){

        System.out.println("Hello World!");

        String nome = "Kadu";
        int a = 10;
        int b = 20;
        int soma;
        double valor;
        double x = 4.12313524;

        //Variáveis
        soma = a + b;
        valor = a + b;

        //Impressão com quebra de linha
        System.out.println("A soma de "+a+" + "+b+" é: "+soma);

        //Concatenação de vários elementos em um mesmo comando de escrita
        System.out.printf("A soma de %d + %d é: %d\n", a, b, soma);

        System.out.printf("%s tem R$%.2f reais!\n", nome, valor);

        //Impressão sem quebra de linha
        System.out.print("Opa!");

        //Opções de quebra de linha
        System.out.print("\n");
        System.out.printf("%n");

        //println = quebra de linha
        //print = sem quebra de linha
        //printf = impressão com formatador

        //Impressão de número flutuante com 3 casas decimais
        System.out.printf("%.3f%n", x);  

        Locale.setDefault(Locale.US); //Configuração para trocar virgula por ponto

        //Impressão de número flutuante com (ponto) ao invés de (virgula)
        System.out.printf("%.3f", x);  
    }
}
