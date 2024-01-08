package com.basictest.practise2;

import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.stream.Stream;

@Log4j2
public class CheckAnagram {
    public static void main(String[] args) {
        String first = "secure";
        String last = "rescue";

        List<String> firstList = Stream.of(first.split("")).sorted(String::compareTo).toList();
        List<String> lastList = Stream.of(last.split("")).sorted(String::compareTo).toList();

        log.info("{} are the two values", firstList.equals(lastList));
    }
}
