package ru.geekbrains.visitor;

public interface Visitor {
    String visit(Order order);
    String visit(Branch branch);
    String visit(Route branch);
}
