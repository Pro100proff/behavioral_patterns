package ru.geekbrains.state;

public class Cancelled implements OrderState{

    private Order order;

    public Cancelled(Order order) {
        this.order = order;
    }

    @Override
    public void cancel() {
        throw new IllegalArgumentException("заявка уже отменена");
    }

    @Override
    public void changeDestination(String dest) {
        throw new IllegalArgumentException("Нельзя менять маршрут на отмененной заявке");
    }
}
