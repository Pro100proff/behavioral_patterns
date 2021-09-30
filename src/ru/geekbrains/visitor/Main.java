package ru.geekbrains.visitor;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Element> elements = List.of(
                new Branch("1", "1"),
                new Order(),
                new Route(LocalDate.now(), Collections.emptyList())
        );
        Visitor visitor = new StringVisitor();
        elements.forEach(element -> System.out.println(element.accept(visitor)));
    }
}
