package ru.geekbrains.template;

public class Cheese extends PizzaCreator{
    @Override
    protected void prepare() {
        System.out.println("Добавляю много сыра");
    }
}
