package ru.geekbrains.memento;

public class Editor {
    private StringBuilder builder = new StringBuilder();

    private EditorMemento memento;

    public String getText(){
        return builder.toString();
    }

    public void write(String text){
        builder.append(text);
    }

    public void clear(){
        builder = new StringBuilder();
    }

    public void save(){
        memento = new EditorMemento(builder.toString());
    }

    public void restore(){
        builder = new StringBuilder(memento.getText());
    }

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("Hello world");
        editor.save();
        editor.clear();
        System.out.println("After clear : " +editor.getText());
        editor.restore();
        System.out.println("After restore : " + editor.getText());
    }
}

class EditorMemento{
    private String text;

    public EditorMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
