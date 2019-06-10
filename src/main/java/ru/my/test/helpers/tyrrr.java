package ru.my.test.helpers;

import java.util.ArrayList;

public class tyrrr {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("324");
        objects.add(123);
        tyrrr.Element element = new tyrrr.Element();
        element.setId(435434);
        objects.add(element);
        objects.add(null);
        objects.add('L');
        objects.stream()
                .filter(ls -> ls instanceof Element )
                .forEach(l -> {
                    System.out.println(((Element) l).getId());
                });
    }

    static class Element {
        int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
