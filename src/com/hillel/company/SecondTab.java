package com.hillel.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class SecondTab {

    public static void filterCitiesArray(){
        ArrayList<String> cities = new ArrayList<String>();
        //First
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
        cities.stream()
                .filter(s->s.length()==6)
                .forEach(s->System.out.println(s));
        System.out.println();

        //Second
        Stream<String> citiesStream = cities.stream();
        citiesStream = citiesStream.filter(s->s.length()==6);
        citiesStream.forEach(s->System.out.println(s));
        System.out.println();

        //Third
        Stream<String> citiesStream2 = Arrays.stream(new String[]{"Париж", "Лондон", "Мадрид"}) ;
        citiesStream2.forEach(s->System.out.println(s));
        System.out.println();

    }

    public static void streamNumbers(){
        //First
        IntStream intStream = Arrays.stream(new int[]{1,2,4,5,7});
        intStream.forEach(i->System.out.println(i));
        System.out.println();

        LongStream longStream = Arrays.stream(new long[]{100,250,400,5843787,237});
        longStream.forEach(l->System.out.println(l));
        System.out.println();

        DoubleStream doubleStream = Arrays.stream(new double[] {3.4, 6.7, 9.5, 8.2345, 121});
        doubleStream.forEach(d->System.out.println(d));
        System.out.println();

        //Second
        Stream<String> citiesStream =Stream.of("Париж", "Лондон", "Мадрид");
        citiesStream.forEach(s->System.out.println(s));
        System.out.println();

        String[] cities = {"Париж", "Лондон", "Мадрид"};
        Stream<String> citiesStream2 =Stream.of(cities);

        IntStream intStream2 = IntStream.of(1,2,4,5,7);
        intStream2.forEach(i->System.out.println(i));
        System.out.println();

        LongStream longStream2 = LongStream.of(100,250,400,5843787,237);
        longStream2.forEach(l->System.out.println(l));
        System.out.println();

        DoubleStream doubleStream2 = DoubleStream.of(3.4, 6.7, 9.5, 8.2345, 121);
        doubleStream2.forEach(d->System.out.println(d));
        System.out.println();

    }

}
