package codeexamples;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) throws IOException {

//    1. Integer stream
        System.out.println("==1. Integer stream==");
        IntStream
                .range(1, 11)
                .forEach(System.out::print);
        System.out.println();

//    2. skip()
        System.out.println("==2. skip==");
        IntStream
                .range(1, 11)
                .skip(5)
                .forEach(x -> System.out.println(x));
        System.out.println();

//    3. sum()
        System.out.println("==3. sum==");
        int sum = IntStream
                .range(1,11)
                .sum();
        System.out.println(sum);
        System.out.println();

//    4.
        System.out.println("==4.");
        Stream.of("Abc", "Bcd", "Cdf")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

//        5.
        System.out.println("==5. Stream from Array, sort, filter and print");
        String[] names = {"Ivan", "Aleksei", "Tom", "Ali"};
        Arrays.stream(names).filter(x -> x.startsWith("A"))
                .sorted()
                .forEach(System.out::println);

    }
}