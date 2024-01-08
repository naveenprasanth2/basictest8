package com.basictest.practise4;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRep {
    public static void main(String[] args) {
        String a = "Is it your first company";
        Map<String, Long> test = Stream.of(a.toLowerCase().replaceAll("\\s", "").split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(test);
        Stream.of(a.replaceAll("\\s", "").split(""))
                .filter(x -> test.get(x.toLowerCase()) == 1).findFirst().ifPresent(System.out::println);
    }
}
