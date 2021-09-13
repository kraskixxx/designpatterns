package com.workshops.javasamples.grokkingjavainterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

    public static void main (String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 1, 3, 4, 6, 9, 16, 8, 4, 100, 1000, 20, 30 , 27, 44, 46, 46, 50, 48, 52));

        //print `2, 1, 3, 4, 6, 9, 16, 8, 4, 100, 1000, 20, 30, 27, 44, 46, 46, 50, 48, 52`
        printList(numbers);
        //need to remove all even numbers from list
        removeEven(numbers);
        //should print `1, 3, 9, 27`
        printList(numbers);
    }

    private static void removeEven(List<Integer> list) {
        //here should be implementation of removing all even numbers from list

        List<Integer> evens = list.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        list.removeAll(evens);
        System.out.println(evens);

    }

    private static void printList(List<Integer> list) {
        System.out.println(list.stream().map(n -> n.toString()).collect(Collectors.joining(", ")));
    }
}
