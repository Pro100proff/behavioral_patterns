package ru.geekbrains.state;

public class Created implements OrderState{

    private Order order;

    public Created(Order order) {
        this.order = order;
    }

    @Override
    public void cancel() {
        order.setCurrentState(order.getCancelled());
        System.out.println("Заявка успешно отменена!");
    }

    @Override
    public void changeDestination(String dest) {
        order.setDestination(dest);
        System.out.println("Пункт назначения успешно изменен");
    }
}
