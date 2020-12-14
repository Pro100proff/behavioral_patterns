package ru.geekbrains.strategy;

public class BigShopStrategy implements Strategy {
    @Override
    public void showShopName() {
        System.out.println("Магазин перекресток");
    }
}
