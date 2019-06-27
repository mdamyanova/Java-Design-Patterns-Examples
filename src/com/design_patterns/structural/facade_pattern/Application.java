package com.design_patterns.structural.facade_pattern;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("========= Supermarket ============");
        System.out.println("1. Tomatoes.");
        System.out.println("2. Sausages.");
        System.out.println("3. Exit.");
        System.out.println("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        CashDesk cashDesk = new CashDesk();

        while (choice != 3) {

            switch (choice) {
                case 1:
                    cashDesk.tomatoSale();
                    break;
                case 2:
                    cashDesk.sausageSale();
                    break;
                default:
                    System.out.println("No such product in the supermarket.");
                    break;
            }

            choice = scanner.nextInt();
        }
    }
}