package application2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Storange products = new Storange();

        System.out.println("\n--Produtos em Estoque--\n");

        System.out.println("Nome de um produto:");
        products.name = sc.next();

        System.out.println("Preço do produto:");
        products.price = sc.nextDouble();

        System.out.println("Quantidade em estoque:");
        products.quantity = sc.nextInt();

        System.out.println("Produto: " + products.name);
        System.out.println("Preço: " + products.price);
        System.out.println("Quantidade: " + products.quantity);
        System.out.println("Total: R$" + products.totalValueInStock());

        System.out.println("Adicione alguma quantidade desse produto ao estoque: ");
        int add = sc.nextInt();
        products.addProduct(add);

        System.out.println("Nova quantidade em estoque: " + products.quantity);
        System.out.println("Total: R$" + products.totalValueInStock());

        System.out.println("Remova alguma quantidade desse produto no estoque: ");
        int remove = sc.nextInt();
        products.RemoveProducts(remove);

        System.out.println("Nova quantidade em estoque: " + products.quantity);
        System.out.println("Total: R$" + products.totalValueInStock());




        sc.close();
    }
}
