package ru.my.test.helpers;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams  {
    private static final Collection<Task> tasks;

    static {
        tasks = Arrays.asList(
                new Task( Status.OPEN, 5 ),
                new Task( Status.OPEN, 13 ),
                new Task( Status.CLOSED, 8 )
        );
    }

    private enum Status {
        OPEN, CLOSED
    };

    private static final class Task {
        private final Status status;
        private final Integer points;

        Task( final Status status, final Integer points ) {
            this.status = status;
            this.points = points;
        }

        Integer getPoints() {
            return points;
        }

        Status getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return String.format( "[%s, %d]", status, points );
        }
    }

    public static double countOpen () {
        // Подсчет общего количества очков всех активных задач с использованием sum()
        return (long) tasks
                .stream()
                .filter( task -> task.getStatus() == Status.OPEN )
                .mapToDouble( Task::getPoints )
                .sum();
    }

    public static Map<Status, List<Task>> mapOnStatus() {

        // Группировка задач по их статусу
        return tasks
                .stream()
                .collect( Collectors.groupingBy( Task::getStatus ));
    }

    public static Collection<Double> findWeight () {
        // Подсчет веса каждой задачи (как процент от общего количества очков)
        System.out.println(String.format("%.2f", Streams.countOpen()));
//        return tasks
//                .stream()                                        // Stream<String>
//                .mapToInt( Task::getPoints )                     // IntStream
//                .asLongStream()                                  // LongStream
//                .mapToDouble( points -> points / Streams.countOpen() )   // DoubleStream
//                .boxed()                                         // Stream<Double>
//                .mapToLong( weigth -> ( long )( weigth * 100 ) ) // LongStream
//                .mapToObj( percentage -> percentage + "%" )      // Stream<String>
//                .collect( Collectors.toList() );                 // List<String>


        return null;
    }
}