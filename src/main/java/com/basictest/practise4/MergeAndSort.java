package com.basictest.practise4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeAndSort {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 11, 15};
        int[] b = {2, 5, 10};

        List<Integer> test = Stream.of(a,b).flatMap(x -> Arrays.stream(x).boxed()).sorted().toList();
        System.out.println(test);
    }
}
