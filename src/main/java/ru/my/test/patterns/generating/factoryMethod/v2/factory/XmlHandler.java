package ru.my.test.patterns.generating.factoryMethod.v2.factory;

import ru.my.test.patterns.generating.factoryMethod.v2.doc.Document;
import ru.my.test.patterns.generating.factoryMethod.v2.doc.XmlDocument;

public class XmlHandler extends Handler {
    @Override
    public Document create() {
        return new XmlDocument();
    }
}
