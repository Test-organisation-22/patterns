package codeexamples;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) throws IOException {

//    1. Integer stream
        System.out.println("\n==1. Integer stream. Print each in range ==");
        IntStream
                .range(1, 11)
                .forEach(System.out::print);
        System.out.println();

//    2. skip()
        System.out.println("\n==2. Integer stream. Skip first and print ==");
        IntStream
                .range(1, 11)
                .skip(5)
                .forEach(x -> System.out.println(x)); // same as  .forEach(System.out::print);

//    3. sum()
        System.out.println("\n==3. Integer stream. Get sum of elements ==");
        int sum = IntStream
                .range(1,11)
                .sum();
        System.out.println(sum);

//    4. Stream.of
        System.out.println("\n==4. Stream.of. Sort and find first ==");
        Stream.of("Abc", "Bcd", "Cdf")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

//        5. Stream from Array
        System.out.println("\n==5. Stream from Array. Sort, filter and print ==");
        String[] names = {"Ivan", "Aleksei", "Tom", "Ali"};
        Arrays.stream(names).filter(x -> x.startsWith("A"))
                .sorted()
                .forEach(System.out::println);

//        6. Modify and get average
        System.out.println("\n==6. Stream from Array. Get average of squares");
        int[] myArray = new int[]{0,1,1,2,3,5,8,13,21};
        Arrays.stream(myArray)
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);

//        7.
        System.out.println("\n==7. Stream from list. Filter and print");
        List<String> namesList = Arrays.asList("Ivan", "anna", "Bob", "Michle", "Angela");
        namesList.stream()
                .map(String::toUpperCase)
                .filter(x -> x.startsWith("A"))
                .forEach(System.out::println);

//        8.
        System.out.println("\n==8. Stream from list. Get string longer then 4");
        namesList.stream()
                .sorted()
                .filter(x -> x.length() > 4)
                .forEach(System.out::println);

//        9.
        System.out.println("\n==9. Stream to list. Filter and collect to a  new list");
        List<String> targetList =  namesList.stream()
                .filter(x -> x.contains("a"))
                .collect(Collectors.toList());
        targetList.forEach(System.out::println);


    }
}