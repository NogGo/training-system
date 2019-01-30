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
        System.out.println("-------------------");

        Runnable runnable = () -> System.out.println("Hello world!");
        Thread t = new Thread(runnable);
        t.start();

        FunInter inter = i -> i%13 == 0;
        System.out.println(inter.convert(14));


        FunInter2 inter2 = (a, b) -> a.length() > b.length() ? a:b;
        System.out.println(inter2.onLenght("ttt", "t"));

        FunInter3 inter3 = (a, b, c) -> Math.pow(b, 2) - 4*a*c;

        System.out.println(inter3.Diskr(2.4,5.,1.7));
        inter3.sout();
    }
}