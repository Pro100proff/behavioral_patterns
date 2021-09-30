package ru.geekbrains.interpreter;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        String query = new Select("id, name",
                new From("users",
                        new Where("id = 5"))).interpret(context);
        System.out.println(query);
    }
}
