package ru.my.test.patterns.generating.factoryMethod.v2.factory;

import ru.my.test.patterns.generating.factoryMethod.v2.doc.Document;

public abstract class Handler {

    public void process() {
        Document document = create();
        document.sing();
    }

    public abstract Document create();
}
