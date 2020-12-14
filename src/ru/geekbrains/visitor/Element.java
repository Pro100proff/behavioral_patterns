package ru.geekbrains.visitor;

public interface Element {
    String accept(Visitor visitor);
}
