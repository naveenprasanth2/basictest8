package com.basictest.practise3;

import java.util.List;
import java.util.stream.Stream;

public class CheckAnagram {
    public static void main(String[] args) {

        String first = "securw";
        String last = "rescue";

//        List<String> firstList = Stream.of(first.split("")).sorted().toList();
//        List<String> lastList = Stream.of(last.split("")).sorted().toList();

        List<Character> firstList = new String(first.toCharArray()).chars().mapToObj(i -> (char) i).sorted().toList();
        List<Character> lastList = new String(last.toCharArray()).chars().mapToObj(i -> (char) i).sorted().toList();

        System.out.println(firstList.equals(lastList));
    }
}
