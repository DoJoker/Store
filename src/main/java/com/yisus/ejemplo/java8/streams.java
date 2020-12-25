package com.yisus.ejemplo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streams {

    public static void map() {
        List<String> letters = Arrays.asList("a", "b", "c");
        System.out.println(letters);
        List<String> upperCase = letters.stream()
                .map((String element) -> element.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(upperCase);
    }

    public static void reduce() {
        List<Integer> integers = Arrays.asList(1, 1, 1);
        System.out.println(integers);
        Integer reduced = integers.stream().reduce(23, (a, b) -> a + b);
        System.out.println(reduced);
    }

    public static void flatMap() {
        List<String> letters1 = Arrays.asList("a", "b");
        List<String> letters2 = Arrays.asList("b", "c", "d");
        List<String> letters3 = Arrays.asList("e", "f");
        List<List<String>> listOfLetters = Arrays.asList(letters1, letters2, letters3);
        System.out.println(listOfLetters);
        List<String> flatList = listOfLetters.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flatList);


    }


}
