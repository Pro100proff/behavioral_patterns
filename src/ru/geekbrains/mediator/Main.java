package ru.geekbrains.mediator;

public class Main {
    public static void main(String[] args) {
        MediatorImpl mediator = new MediatorImpl();
        Button buttonOk = new Button(mediator, "ok");
        TextFiled login = new TextFiled(mediator, "");
        TextFiled password = new TextFiled(mediator, "");
        mediator.setButtonOk(buttonOk);
        mediator.setLogin(login);
        mediator.setPassword(password);

        mediator.showDialogWindow();
        buttonOk.clickButton();
        login.fillText("login");
        password.fillText("password");
        buttonOk.clickButton();
    }
}
