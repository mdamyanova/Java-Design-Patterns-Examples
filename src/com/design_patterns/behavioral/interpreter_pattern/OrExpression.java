package com.design_patterns.behavioral.interpreter_pattern;

public class OrExpression implements Expression {
    private Expression expression = null;
    private Expression expression2 = null;

    public OrExpression(Expression expression, Expression expression2) {
        this.expression = expression;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return this.expression.interpret(context) || this.expression2.interpret(context);
    }
}