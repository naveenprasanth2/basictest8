package com.basictest.practise4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsPractise {
    public static void main(String[] args) {
//        Supplier<Stream<Integer>> test = () -> IntStream.rangeClosed(0, 5).filter(x -> x < 2).boxed();
//        IntStream.rangeClosed(0, 5).parallel().forEach(System.out::println);
//        IntStream.generate(() -> ThreadLocalRandom.current().nextInt(0, 80)).limit(10).forEach(System.out::println);
//        IntStream.generate(() -> new Random().nextInt(0, 10)).limit(10).forEach(System.out::println);
//        IntStream.iterate(0, x -> x+1).limit(10).boxed().forEach(System.out::println);
        Supplier<IntStream> test = () -> IntStream.rangeClosed(0, 10);
        System.out.println(test.get().boxed().toList());


    }
}
