package ru.geekbrains.mediator.after;

import java.util.List;

public class Order {
    private List<Cargo> cargos;
    private Branch destination;

    public List<Cargo> getCargos() {
        return cargos;
    }
}
