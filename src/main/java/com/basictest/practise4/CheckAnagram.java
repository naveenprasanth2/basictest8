package com.basictest.practise4;

import java.util.List;
import java.util.stream.Stream;

public class CheckAnagram {
    public static void main(String[] args) {
        String first = "secure";
        String last = "rescue";

        List<String> firstList = Stream.of(first.split("")).toList();
        List<String> secondList = Stream.of(last.split("")).toList();

        System.out.println(firstList.equals(secondList));
    }
}
