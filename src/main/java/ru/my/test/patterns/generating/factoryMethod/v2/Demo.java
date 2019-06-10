package ru.my.test.patterns.generating.factoryMethod.v2;

import ru.my.test.patterns.generating.factoryMethod.v2.factory.Handler;
import ru.my.test.patterns.generating.factoryMethod.v2.factory.PdfHandler;

public class Demo {

    public static void main(String[] args) {
        Handler pdfHand = new PdfHandler();
        pdfHand.process();
    }
}
