package ru.geekbrains.interpreter;

public class Select implements Expression {

    private String columnName;
    private Expression from;

    public Select(String columnName, Expression from) {
        this.columnName = columnName;
        this.from = from;
    }

    @Override
    public String interpret(Context context) {
        context.setColumn("Select " + columnName);
        return from.interpret(context);
    }
}
