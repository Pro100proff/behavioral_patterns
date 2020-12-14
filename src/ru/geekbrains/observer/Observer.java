package ru.geekbrains.observer;

public interface Observer {
    void update(ObservableSubject subject, Object arg);
}
