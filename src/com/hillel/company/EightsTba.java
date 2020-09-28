package com.hillel.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class EightsTba {

    public static void streamReduce(){

        //First
        Stream<Integer> numbersStream = Stream.of(1,2,3,4,5,6);
        Optional<Integer> result = numbersStream.reduce((x,y)->x*y);
        System.out.println(result.get());
        System.out.println();


        //Second
        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
        Optional<String> sentence = wordsStream.reduce((x,y)->x + " " + y);
        System.out.println(sentence.get());
        System.out.println();

        //Third
        Stream<String> wordsStream2 = Stream.of("мама", "мыла", "раму");
        String sentence2 = wordsStream2.reduce("Результат:", (x,y)->x + " " + y);
        System.out.println(sentence2);
        System.out.println();


        //Fourth
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000),
                new Phone("LG G 4", 32000));

        int sum = phoneStream.reduce(0,
                (x,y)-> {
                    if(y.getPrice()<50000)
                        return x + y.getPrice();
                    else
                        return x + 0;
                },
                (x, y)->x+y);

        System.out.println(sum);
        System.out.println();
    }
}
