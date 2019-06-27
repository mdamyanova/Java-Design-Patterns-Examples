package com.design_patterns.structural.decorator_pattern;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("========= Food Menu ============");
        System.out.println("1. Pork.");
        System.out.println("2. Pork with Salad.");
        System.out.println("3. Pork with Potatoes.");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        while (choice != 4) {

            switch (choice) {
                case 1:
                    Food pork = new Pork();
                    System.out.println(pork.prepareFood());
                    break;
                case 2:
                    Food porkWithSalad = new Salad(new Pork());
                    System.out.println(porkWithSalad.prepareFood());
                    break;
                case 3:
                    Food porkWithPotatoes = new Potato(new Pork());
                    System.out.println(porkWithPotatoes.prepareFood());
                    break;
                default:
                    System.out.println("No such food on the menu.");
                    break;
            }

            choice = scanner.nextInt();
        }
    }
}
