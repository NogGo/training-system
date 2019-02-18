package ru.my.test.patterns.generating_design_patterns.abstractFactory;

import ru.my.test.patterns.generating_design_patterns.abstractFactory.app.Application;
import ru.my.test.patterns.generating_design_patterns.abstractFactory.factories.ClassicalFactory;
import ru.my.test.patterns.generating_design_patterns.abstractFactory.factories.FurnitureFactory;
import ru.my.test.patterns.generating_design_patterns.abstractFactory.factories.ItalianFactory;

import java.util.Scanner;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static Application configureApplication() {
        Application app = null;
        FurnitureFactory factory;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: 1(Classic) or 2(Italian)");
        int i = Integer.parseInt(scanner.next());
        if (i == 1) {
            factory = new ClassicalFactory();
            app = new Application(factory);
        } else if (i == 2) {
            factory = new ItalianFactory();
            app = new Application(factory);
        }
        scanner.close();
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.caculate();
    }
}
