package ru.geekbrains.strategy;

public class SmallStrategy implements Strategy {
    @Override
    public void showShopName() {
        System.out.println("Магазин пятерочка");
    }
}
