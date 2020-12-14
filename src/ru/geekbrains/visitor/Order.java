package ru.geekbrains.visitor;

import java.util.List;

public class Order implements Element{
    private List<Cargo> cargos;
    private Branch destination;

    public List<Cargo> getCargos() {
        return cargos;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
