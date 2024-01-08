package com.basictest.practise2;

import lombok.extern.log4j.Log4j2;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Log4j2
public class FirstNonRepCharacter {
    public static void main(String[] args) {
        String a = "is it your first company";

        Supplier<Stream<String>> stream = () -> Stream.of(a.replaceAll("\\s", "").split(""));

        Map<String, Long> result = stream.get()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        stream.get().filter(value -> result.get(value) == 1).findFirst().ifPresent(log::info);
    }
}
