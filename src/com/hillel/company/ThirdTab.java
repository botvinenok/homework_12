package com.hillel.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;


public class ThirdTab {

    public static void filterCitiesWithForEach(){
        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");

        //First
        citiesStream.forEach(System.out::println);
        System.out.println();

        //Second
        Stream<String> citiesStream2= Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        citiesStream2.filter(s->s.length()==6).forEach(s->System.out.println(s));
        System.out.println();

        //Third
        Stream<String> citiesStream3= Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        citiesStream3.forEach(s->System.out.println(s));
        System.out.println();

    }

    public static void smthWithPhones(){
        //First
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));
        phoneStream.filter(p->p.getPrice()<50000)
                .forEach(p->System.out.println(p.getName()));
        System.out.println();

        //Second
        Stream<Phone> phoneStream2 = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        phoneStream2
                .map(p-> "название: " + p.getName() + " цена: " + p.getPrice())
                .forEach(s->System.out.println(s));
        System.out.println();

        //Third
        Stream<Phone> phoneStream3 = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        phoneStream3
                .flatMap(p->Stream.of(
                        String.format("название: %s  цена без скидки: %d", p.getName(), p.getPrice()),
                        String.format("название: %s  цена со скидкой: %d", p.getName(), p.getPrice() - (int)(p.getPrice()*0.1))
                ))
                .forEach(s->System.out.println(s));

    }
}
