package com.design_patterns.behavioral.visitor_pattern;

public class Application {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{ new Book(9, "1243657323"),
                new Book(11, "7645345568") };

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(ItemElement[] items)
    {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;

        for(ItemElement item : items)
        {
            sum = sum + item.accept(visitor);
        }

        return sum;
    }
}