package ru.geekbrains.template;

public class Main {
    public static void main(String[] args) {
        PizzaCreator peperoni = new Peperoni();
        PizzaCreator cheese = new Cheese();
        peperoni.create();
        System.out.println("-----------");
        cheese.create();
    }
}
