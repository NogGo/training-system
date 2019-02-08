package ru.my.test.helpers;

import javax.xml.datatype.XMLGregorianCalendar;

public class TestXMLGK {

    private XMLGregorianCalendar date;
    private String name;

    public XMLGregorianCalendar getDate() {
        return date;
    }

    public void setDate(XMLGregorianCalendar date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestXMLGK{" +
                "date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
}
