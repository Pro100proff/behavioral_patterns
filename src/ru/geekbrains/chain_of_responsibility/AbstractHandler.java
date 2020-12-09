package ru.geekbrains.chain_of_responsibility;

public class AbstractHandler {
    private AbstractHandler next;

    public void handle(Request request) {
        if(next != null)
            next.handle(request);
    }

    AbstractHandler addLast(AbstractHandler next) {
        this.next = next;
        return next;
    }

}
