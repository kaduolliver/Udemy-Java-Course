package application5;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Student estudante = new Student();

        System.out.println("\n--Calculo de Notas--\n");

        System.out.println("Nome do aluno:");
        estudante.name = sc.nextLine();

        System.out.println("Nota do primeiro trimestre:");
        estudante.nota1 = sc.nextDouble();

        System.out.println("Nota do segundo trimestre:");
        estudante.nota2 = sc.nextDouble();

        System.out.println("Nota do terceiro trimestre:");
        estudante.nota3 = sc.nextDouble();

        estudante.result();

        System.out.println("Resultado: " + estudante.total);
        
        estudante.missing();

        sc.close();
    }
}
