package ru.geekbrains.interpreter;

import java.util.Optional;

public class From implements Expression {

    private String tableName;
    private Expression where;

    public From(String tableName, Expression where) {
        this.tableName = tableName;
        this.where = where;
    }

    @Override
    public String interpret(Context context) {
        context.setTable(" from " + tableName);
        if (where != null){
            return where.interpret(context);
        } else {
            return context.build();
        }
    }
}
