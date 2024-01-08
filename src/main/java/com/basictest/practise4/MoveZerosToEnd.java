package com.basictest.practise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] a = {1, 0, 9, 0, 8, 0, 0, 7};
        List<Integer> test = Arrays.stream(a).boxed().toList();
        List<Integer> result = new ArrayList<>();
        int count = (int) test.stream().filter(x -> x.equals(0)).count();
        result.addAll(test.stream().filter(x -> x!=0).toList());
        IntStream.range(0, count).forEach(x -> result.add(0));

        System.out.println(result);
    }
}
