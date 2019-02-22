package ru.my.test.patterns.generating.factoryMethod;

import ru.my.test.patterns.generating.factoryMethod.factory.Dialog;
import ru.my.test.patterns.generating.factoryMethod.factory.WinDialog;
import ru.my.test.patterns.generating.factoryMethod.factory.SumDialog;

import java.util.Scanner;

public class Demo {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
        }

    /**
     * Приложение создаёт определённую фабрику в зависимости от конфигурации или
     * окружения.
     */
    private static void configure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: 1(Summer) or 2(Winter)");
        int i = Integer.parseInt(scanner.next());
        if (i == 1) {
            dialog = new SumDialog();
        } else if (i == 2) {
            dialog = new WinDialog();
        }
        scanner.close();
    }

    /**
     * Весь остальной клиентский код работает с фабрикой и продуктами только
     * через общий интерфейс, поэтому для него неважно какая фабрика была
     * создана.
     */
    private static void runBusinessLogic() {
        dialog.pack();
    }

}
