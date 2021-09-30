package ru.geekbrains.state;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("cargo", "Saint Petersburg");
        order.setDestination("asd");
        order.cancelOrder();
        order.changeDest("asdasd");
    }
}
