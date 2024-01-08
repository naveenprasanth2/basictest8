package com.basictest.practise4;

import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String a = "<abcabc>";
        List<String> test = Stream.of(a.replaceAll("[<>]", "").split("")).toList();
        List<Map.Entry<String, Long>> testMap = test.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().toList();
        StringJoiner stringJoiner = new StringJoiner(",", "<", ">");
        testMap.stream().forEach(x -> stringJoiner.add("("+x.getKey()+","+x.getValue()+")"));
        System.out.println(stringJoiner);
    }
}
