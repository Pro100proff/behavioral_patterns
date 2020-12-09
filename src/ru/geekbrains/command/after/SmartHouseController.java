package ru.geekbrains.command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void perform(){
        if(command != null) {
            command.execute();
        }
    }
}
