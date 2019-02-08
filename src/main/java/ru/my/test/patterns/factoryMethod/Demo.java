package ru.my.test.patterns.factoryMethod;

import ru.my.test.patterns.factoryMethod.factory.Dialog;
import ru.my.test.patterns.factoryMethod.factory.WinDialog;
import ru.my.test.patterns.factoryMethod.factory.sumDialog;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: 1 or 2");
        while (scanner.hasNext()) {
            int i = Integer.parseInt(scanner.next());
            Dialog dialog;
            if (i == 1)
                dialog = new sumDialog();
            else
                dialog = new WinDialog();

            dialog.createTravel();
        }

    }
}
