package ru.geekbrains.state;

public class Approved implements OrderState{

    private Order order;

    @Override
    public void cancel() {
        throw new IllegalArgumentException("Unable to cancel order");
    }

    @Override
    public void changeDestination(String dest) {
        order.setDestination(dest);
    }
}
