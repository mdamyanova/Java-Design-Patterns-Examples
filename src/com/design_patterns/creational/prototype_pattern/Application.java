package com.design_patterns.creational.prototype_pattern;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        Cat cat = new Cat(id, name);
        cat.produceSound();
        Cat cat2 = (Cat)cat.getClone();
        cat2.produceSound();
    }
}