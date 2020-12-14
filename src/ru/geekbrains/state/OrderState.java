package ru.geekbrains.state;

public interface OrderState {
    void cancel();
    void changeDestination(String dest);
}
