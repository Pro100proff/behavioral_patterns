package ru.geekbrains.visitor;

public class StringVisitor implements Visitor {
    @Override
    public String visit(Order order) {
        return order.toString();
    }

    @Override
    public String visit(Route route) {
        return "date of departure = " + route.getDepartureDate();
    }

    @Override
    public String visit(Branch branch) {
        return "Branch coordinates: (" + branch.getLatitude() + ", " + branch.getLongitude() + ")";
    }
}
