package com.basictest.practise1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepCharacter {
    public static void main(String[] args) {
        String a = "is it your first company";

        Map<String, Long> test = Stream.of(a.replaceAll("\\s", "").split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Stream.of(a.replaceAll("\\s", "").split(""))
                .filter(x -> test.get(x) == 1)
                .findFirst()
                .ifPresentOrElse(System.out::println, null);
    }
}
