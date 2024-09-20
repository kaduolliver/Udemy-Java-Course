package application4;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee employeer = new Employee();

        System.out.println("\n--Dados do(a) funcionário(a)--\n");

        System.out.println("Nome: ");
        employeer.name = sc.nextLine();

        System.out.println("Salário: ");
        employeer.grossSalary = sc.nextDouble();

        System.out.println("Taxa: ");
        employeer.tax = sc.nextDouble();

        System.out.println("Funcionário(a): " + employeer.name);
        System.out.println("Salário: R$" + employeer.netSalary());

        System.out.println("Qual a porcentagem que deseja aumentar o salário?");
        int percentage = sc.nextInt();
        employeer.increaseSalary(percentage);

        System.out.println("Dados atualizados: " + employeer.name + ", R$" + employeer.grossSalary);


        sc.close();
    }
}
