package com.averkina;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 2, 5, 5, 6));
        List<String> stringList = new ArrayList<>(Arrays.asList("one", "two"));

        System.out.println("Задание 1:");
        System.out.println(StreamAPIClass.getAvgElement(intList));

        System.out.println("\nЗадание 2:");
        StreamAPIClass.getUpperElement(stringList, "new").stream().forEach(System.out::println);

        System.out.println("\nЗадание 3:");
        StreamAPIClass.getSquareUniqueElements(intList).stream().forEach(System.out::println);

        System.out.println("\nЗадание 4:");
        StreamAPIClass.getSortedList(stringList, 't').stream().forEach(System.out::println);

        System.out.println("\nЗадание 5:");
        System.out.println(StreamAPIClass.getLastElement(stringList).toString());

        System.out.println("\nЗадание 6:");
        System.out.println(StreamAPIClass.getSumEvenNumbers(intList));

        System.out.println("\nЗадание 7:");
        StreamAPIClass.setMap(stringList).entrySet().stream().forEach(System.out::println);
    }
}
