package com.basictest.practise4;

import java.util.*;

public class ReverseSentence {
    public static void main(String[] args) {
        String a = "Morning Good Hello";
        StringJoiner stringJoiner = new StringJoiner(" ", "", "");
        Arrays.stream(a.split(" ")).sorted(Comparator.reverseOrder()).forEach(stringJoiner::add);
        System.out.println(stringJoiner.toString().trim());
    }
}
