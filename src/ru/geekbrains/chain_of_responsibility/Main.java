package ru.geekbrains.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Request request = new Request("123", "Hello world!");
        AbstractHandler handler = new StarterHandler();

                handler.addLast(new AuthHandler("123"))
                .addLast(new UpperCaseHandler())
                .addLast(new DatabaseSaverHandler());

        handler.handle(context, request);
    }
}
