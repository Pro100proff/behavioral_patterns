package ru.geekbrains.visitor;

import java.time.LocalDate;
import java.util.List;

public class Route implements Element{
    private LocalDate departureDate;
    private List<Branch> branches;

    public Route(LocalDate departureDate, List<Branch> branches) {
        this.departureDate = departureDate;
        this.branches = branches;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
