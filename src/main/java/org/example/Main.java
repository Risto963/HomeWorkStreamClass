package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        List<Integer> numbers = Arrays.asList(4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);

        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted numbers: " + sortedNumbers);

        List<String> eNames = names.stream()
                .filter(name -> name.startsWith("E"))
                .collect(Collectors.toList());
        System.out.println("Names tgat start with 'E' : " + eNames);

        List<Integer> filterNumbers = numbers.stream()
                .filter(number -> number > 30 && number < 200)
                .collect(Collectors.toList());
        System.out.println("Numbers greater than 30 and lower than 200: " + filterNumbers);

    }
}