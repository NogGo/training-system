package ru.my.test;

import java.util.*;

public class TestApp {

    public static void main(String[] args) {

        List<String> list = Arrays.asList( "a", "b", "d" );
        list.forEach(System.out::println);
        System.out.println("-------------------");

        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        numbers.forEach(System.out::println);
        System.out.println("-------------------");

        Map<Integer, Integer> maps = new HashMap<>();
        maps.put(1, 100);
        maps.put(2, 200);
        maps.put(3, 300);
        maps.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
        System.out.println("-------------------");

        UserFactory userFactory = User::new;
        User user = userFactory.create("John", "Snow");
        System.out.println("-------------------");

        String str = "NOT_Empty";
        if (Optional.ofNullable( str).isPresent()) {
            System.out.println("======test==========");
        }
        System.out.println("-------------------");

        System.out.println(Streams.countOpen());
        System.out.println("-------------------");

        System.out.println(Streams.mapOnStatus());
        System.out.println("-------------------");

        System.out.println(Streams.findWeight());
    }
}