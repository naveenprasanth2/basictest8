package com.basictest.practise1;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractise {
    public static void main(String[] args) {
//       List<Integer> test = IntStream.rangeClosed(0, 5).filter(x -> x < 2).boxed().collect(Collectors.toList());

//        Supplier<List<Integer>> test = () -> IntStream.rangeClosed(0, 5).filter(x -> x < 2).boxed().toList();

//        Supplier<IntStream> test = () -> IntStream.of(1, 2, 3, 4, 6, 7);

//        IntStream.generate(() -> ThreadLocalRandom.current().nextInt(0, 5)).limit(5).forEach(System.out::println);

//        IntStream.iterate(0, x -> x + 1).parallel().limit(20).forEach(System.out::println);


    }
}
