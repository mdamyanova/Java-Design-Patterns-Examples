package com.design_patterns.behavioral.interpreter_pattern;

public class Application {
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("Ivan is male? " + isMale.interpret("Ivan"));
        System.out.println("Mariya is a married woman? " + isMarriedWoman.interpret("Married Mariya"));
    }

    private static Expression getMaleExpression() {
        Expression ivan = new TerminalExpression("Ivan");
        Expression petar = new TerminalExpression("Petar");

        return new OrExpression(ivan, petar);
    }

    private static Expression getMarriedWomanExpression() {
        Expression mariya = new TerminalExpression("Mariya");
        Expression married = new TerminalExpression("Married");

        return new AndExpression(mariya, married);
    }
}