package rvt;

import java.util.Scanner;

public class delikatese {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to Sam and Ella!\nWhat would you like to order?: ");
        String prece = scanner.nextLine();

        System.out.print("Enter the price: ");
        double cena = scanner.nextDouble();

        System.out.print("Premium delivery?(0 = no; 1 = yes): ");
        int izvele = scanner.nextInt();

        System.out.println("\nCheque\n");

        System.out.println(prece + " = " + cena);

        double total;

        if (izvele == 1) {
            System.out.println("Premium Delivery: 5.00");
             total = cena + 5.00;
        } else {
            System.out.println("Peasant Delivery: 2.50");
             total = cena + 2.50;
        }

        System.out.println("Total: " + total);

    }
}
