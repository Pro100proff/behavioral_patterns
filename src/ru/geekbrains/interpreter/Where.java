package ru.geekbrains.interpreter;

public class Where implements Expression {

    private String filter;

    public Where(String filter) {
        this.filter = filter;
    }

    @Override
    public String interpret(Context context) {
        context.setFilter(" where " + filter);
        return context.build();
    }
}
