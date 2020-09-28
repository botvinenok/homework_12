package com.hillel.company;

import java.util.stream.Stream;

public class FifthTab {

    public static void streamWhile(){

        //First
        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers.takeWhile(n -> n < 0)
                .forEach(n -> System.out.println(n));
        System.out.println();


        //Second
        Stream<Integer> numbers1 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers1.sorted().takeWhile(n -> n < 0)
                .forEach(n -> System.out.println(n));
        System.out.println();

        //Third
        Stream<Integer> numbers2 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers2.sorted().dropWhile(n -> n < 0)
                .forEach(n -> System.out.println(n));

        //Fourth
        Stream<String> people1 = Stream.of("Tom", "Bob", "Sam");
        Stream<String> people2 = Stream.of("Alice", "Kate", "Sam");
        Stream.concat(people1, people2).forEach(n -> System.out.println(n));
        System.out.println();

        //Fifth
        Stream<String> people = Stream.of("Tom", "Bob", "Sam", "Tom", "Alice", "Kate", "Sam");
        people.distinct().forEach(p -> System.out.println(p));
        System.out.println();

    }

}
