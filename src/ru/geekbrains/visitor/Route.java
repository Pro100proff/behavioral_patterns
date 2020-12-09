package ru.geekbrains.mediator.after;

import java.time.LocalDate;
import java.util.List;

public class Route {
    private LocalDate departureDate;
    private List<Branch> branches;

    public Route(LocalDate departureDate, List<Branch> branches) {
        this.departureDate = departureDate;
        this.branches = branches;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }
}
