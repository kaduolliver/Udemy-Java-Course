import java.util.Scanner;

public class rs4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n---Posto de Gasolina---\n");
        System.out.println("Veja a tabela abaixo e indique qual combustivel deseja\n");
        System.out.println("1.Álcool");
        System.out.println("2.Gasolina");
        System.out.println("3.Diesel");
        System.out.println("4.Fim");

        int A = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (A < 4) {
            if (A == 1) {
                alcool = alcool + 1;
            }else if (A == 2) {
                gasolina = gasolina + 1;
            }else if (A == 3) {
                diesel = diesel + 1;
            }
            A = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);

        sc.close();
    }
    
}
