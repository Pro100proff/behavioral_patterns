package ru.geekbrains.state;

public class Order {
    private String cargo;
    private String destination;
    private OrderState currentState;

    private OrderState created = new Created(this);
    private OrderState cancelled = new Cancelled(this);

    public Order(String cargo, String destination) {
        this.cargo = cargo;
        this.destination = destination;
        this.currentState = created;
    }

    public OrderState getCreated() {
        return created;
    }

    public OrderState getCancelled() {
        return cancelled;
    }

    void setDestination(String destination) {
        this.destination = destination;
    }

    void setCurrentState(OrderState currentState) {
        this.currentState = currentState;
    }

    public void changeDest(String dest){
        currentState.changeDestination(dest);
    }

    public void cancelOrder(){
        currentState.cancel();
    }
}
