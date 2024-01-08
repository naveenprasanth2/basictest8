package com.basictest.practise2;

import lombok.extern.log4j.Log4j2;

import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;
import java.util.List;

@Log4j2
public class PrintInFormat {
    public static void main(String[] args) {
        String a = "abcabc";

        List<Map.Entry<String, Long>> test = Stream.of(a.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().toList();

        StringJoiner stringJoiner = new StringJoiner(",", "<", ">");

        test.forEach((x -> stringJoiner.add("("+x.getKey()+","+x.getValue()+")")));

        log.info(stringJoiner);
    }
}
