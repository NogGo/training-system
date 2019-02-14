package ru.my.test;

import ru.my.test.helpers.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.PrintWriter;

import java.nio.charset.Charset;
import java.util.*;
import java.util.function.Function;

public class TestApp {

//    private volatile static int i = 50;
//    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(20);
//
//    private static void stopEx() {
//        try {
//            System.out.println("attempt to shutdown executor");
//            executor.shutdown();
//            executor.awaitTermination(0, TimeUnit.MILLISECONDS);
//        }
//        catch (InterruptedException e) {
//            System.err.println("tasks interrupted");
//        }
//        finally {
//            if (!executor.isTerminated()) {
//                System.err.println("cancel non-finished tasks");
//            }
//            executor.shutdownNow();
//            System.out.println("shutdown finished");
//        }
//    }
//
//    private static class imlet implements Runnable{
//
//        @Override
//        public void run() {
//            System.out.println("Name = " + Thread.currentThread().getName() + " i = " + (--i));
//            if (i == 0) {
//                TestApp.stopEx();
//            }
//        }
//    }
    private static Integer parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws InterruptedException {

//        executor.scheduleAtFixedRate(new imlet(), 0, 1, TimeUnit.MILLISECONDS);
        System.out.println("============  Comparator + forEach =================");
        List<User> users = Arrays.asList(
                new User("John", 28),
                new User("Jane", 35),
                new User("Alex", 21));
        users.forEach(System.out::println);
        users.sort(Comparator.comparingInt(User::getAge).reversed());
        System.out.println("===== Reverser =====");
        users.forEach(System.out::println);

        System.out.println("==== New Example 1 ====");
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        numbers.forEach(System.out::println);

        System.out.println("==== New Example 2 ====");
        Map<Integer, Integer> maps = new HashMap<>();
        maps.put(1, 100);
        maps.put(2, 200);
        maps.put(3, 300);
        maps.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));

        System.out.println("==== New Example Function (FunctionalInterface) 3 ====");
        Function<String, Integer> toInteger = TestApp::parse;
        Integer integer = toInteger.apply("5");
        UserFactory userFactory = User::new;
        User user = userFactory.create("John", 24);
        System.out.println("==== New Example 4 ====");
        String str = "NOT_Empty";
        if (Optional.ofNullable( str).isPresent()) {
            System.out.println("=test=");
        }

        System.out.println("==== New Example 5 ====");
        System.out.println(Streams.countOpen());

        System.out.println("==== New Example 6 ====");
        System.out.println(Streams.mapOnStatus());

        System.out.println("==== New Example 7 ====");
        System.out.println(Streams.findWeight());

        System.out.println("==== New Example 8 ====");
        Runnable runnable = () -> System.out.println("Hello world!");
        Thread t = new Thread(runnable);
        t.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("==== New Example 9 ====");
        FunInter inter = i -> i%13 == 0;
        System.out.println(inter.convert(14));

        System.out.println("==== New Example 10 ====");
        FunInter2 inter2 = (a, b) -> a.length() > b.length() ? a:b;
        System.out.println(inter2.onLenght("ttt", "t"));

        System.out.println("==== New Example 11 ====");
        FunInter3 inter3 = (a, b, c) -> Math.pow(b, 2) - 4*a*c;
        System.out.println();
        inter3.sout(String.valueOf(inter3.Diskr(2.4,5.,1.7)));

        System.out.println("==== New Example 12 ====");
        List<Integer> listNum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        listNum.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
        System.out.println("==== New Example 13. filter ====");
        List<String> names = Arrays.asList("John", "Jan", "Tirion", "Marry", "Nikolas");

        long count = names.stream()
                .filter(i -> i.length() > 4)
                .count();
        System.out.println(count); //output  3

        System.out.println("==== New Example 14. filter ====");
        List<String> ls = Arrays.asList("John", "Daenerys", "Tyrion", "", null, "Arya");

        ls.stream()
                .filter(Objects::nonNull)
                .filter(name -> !name.isEmpty() && name.contains("a"))
                .forEach(System.out::println);

        System.out.println("==== New Example 15. map stream api ====");
        listNum.stream()
                .map(i -> i*2)
                .forEach(System.out::println);

        System.out.println("==== New Example 16. map stream api ====");
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("JM1111BE", 2009),
                new Car("LKITEQRQ", 2012),
                new Car("BK5555IT", 2010),
                new Car("ZI5601CC", 2015),
                new Car("XI3838PP", 2017));

        cars.stream()
                .filter(c -> c.getYear() >2010)
                .map(Car::getNumber)
                .filter(n -> n!= null && !n.isEmpty())
                .forEach(System.out::println);
        System.out.println("==== New Example 17. map stream api ====");


        TestXMLGK xmlgk = new TestXMLGK();
        xmlgk.setName("2222222222");
        xmlgk.setDate(getXmlGC());

        TestXMLGK x2 = new TestXMLGK();
        x2.setName("11111111");
        Thread.sleep(10_000);
        x2.setDate(getXmlGC());

        List<TestXMLGK> listxml = new ArrayList<>();
        listxml.add(x2);
        listxml.add(xmlgk);
        Collections.sort(listxml, (o1, o2) -> {
            XMLGregorianCalendar rrr1 =  o1.getDate();
            XMLGregorianCalendar rrr2 =  o2.getDate();
            return rrr1.compare(rrr2);
        });
//        listxml.forEach(System.out::println);
        ArrayList<TestXMLGK> testXMLGKS = new ArrayList<>();
        testXMLGKS.addAll(listxml);
        testXMLGKS.forEach(System.out::println);
//        PrintWriter
    }

    private static XMLGregorianCalendar getXmlGC() {
        GregorianCalendar gCal = new GregorianCalendar();
        XMLGregorianCalendar exmlCalendarDate = null;
        gCal.setTime(new Date());
        try {
           exmlCalendarDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        return exmlCalendarDate;
    }
}