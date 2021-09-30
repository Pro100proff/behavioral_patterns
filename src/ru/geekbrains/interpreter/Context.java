package ru.geekbrains.interpreter;

import java.util.Optional;

public class Context {
    private String column;
    private String table;
    private String filter;

    public void setColumn(String column) {
        this.column = column;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String build(){
        return column + " " + table + " " + Optional.ofNullable(filter).orElse("");
    }
}
