package com.hillel.company;

import java.util.*;
import java.util.stream.Stream;

public class SeventhTab {


    public static void streamFindMatch(){

        //First
        ArrayList<String> names = new ArrayList<String>();
        names.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));
        System.out.println(names.stream().count());

        System.out.println(names.stream().filter(n->n.length()<=3).count());
        System.out.println();


        //Second
        ArrayList<String> names2 = new ArrayList<String>();
        names2.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));

        Optional<String> first = names2.stream().findFirst();
        System.out.println(first.get());

        Optional<String> any = names2.stream().findAny();
        System.out.println(any.get());
        System.out.println();

        //Third
        ArrayList<String> names3 = new ArrayList<String>();
        names3.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));

        boolean any1 = names.stream().anyMatch(s->s.length()>3);
        System.out.println(any1);

        boolean all = names.stream().allMatch(s->s.length()==3);
        System.out.println(all);

        boolean none = names.stream().noneMatch(s->s=="Bill");
        System.out.println(none);
        System.out.println();


        //Fourth
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));

        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println(min.get());
        System.out.println(max.get());
        System.out.println();


        //Fifth
        ArrayList<Phone> phones = new ArrayList<Phone>();
        phones.addAll(Arrays.asList(new Phone[]{
                new Phone("iPhone 8", 52000),
                new Phone("Nokia 9", 35000),
                new Phone("Samsung Galaxy S9", 48000),
                new Phone("HTC U12", 36000)
        }));

        Phone min1 = phones.stream().min(Phone::compare).get();
        Phone max1 = phones.stream().max(Phone::compare).get();
        System.out.printf("MIN Name: %s Price: %d \n", min1.getName(), min1.getPrice());
        System.out.printf("MAX Name: %s Price: %d \n", max1.getName(), max1.getPrice());
        System.out.println();
    }
}
