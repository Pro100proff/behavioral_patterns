package ru.geekbrains.visitor;

public class StringVisitor implements Visitor {
    @Override
    public String visit(Order order) {
        return order.toString();
    }

    @Override
    public String visit(Route branch) {
        return null;
    }

    @Override
    public String visit(Branch branch) {
        return "Branch coordinates: (" + branch.getLatitude() + ", " + branch.getLongitude() + ")";
    }
}
