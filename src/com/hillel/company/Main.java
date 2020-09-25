package com.hillel.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //region Task1
        List <String> phones = new ArrayList<String>();
        Collections.addAll(phones, "iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        List <String> filteredPhones = phones.stream()
                .filter(s ->s.length() < 10)
                .collect(Collectors.toList());

        Set<String> filteredPhonesSet = phones.stream()
                .filter(s->s.length() < 10)
                .collect(Collectors.toSet());

        System.out.println(Arrays.toString(filteredPhones.toArray()));
        System.out.println(Arrays.toString(filteredPhonesSet.toArray()));
        //endregion

        //region Task2
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 8", 54000),
                new Phone("Nokia 9", 45000),
                new Phone("Samsung Galaxy S9", 40000),
                new Phone("LG G6", 32000));

        Map <String, Integer> phonesMap = phoneStream
                .collect(Collectors.toMap(p->p.getName(), t->t.getPrice()));

        phonesMap.forEach((k,v)-> System.out.println(k + "|" + v));
        //endregion

        //region Task3
        Stream<String> phoneStreamAll = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        HashSet <String> filteredPhonesHashSet = phoneStreamAll.filter(s->s.length()<12)
                        .collect(Collectors.toCollection(HashSet::new));

        filteredPhonesHashSet.forEach(ks-> System.out.println(ks));
        //endregion


        //region Task4

        ArrayList <String> filteredPhonesArrList = phones.stream().filter(s -> s.length()<12)
                .collect(
                        () -> new ArrayList<String>(), //create new ArrayList
                        (list,item) -> list.add(item), //add into list elements
                        (list1,list2) -> list1.addAll(list2));

        System.out.println(Arrays.toString(filteredPhonesArrList.toArray()));
        //endregion
    }
}
