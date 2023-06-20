package com.basictest.practise1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PutZerosAtEnd {
    public static void main(String[] args) {
        int[] a={2,3,0,0,5,0,8};

        List<Integer> actualList = Arrays.stream(a).boxed().toList();
        List<Integer> finalList = actualList.stream().filter(x -> x!=0).collect(Collectors.toList());
        IntStream.range(0, actualList.size() - finalList.size()).forEach(x -> finalList.add(0));
        System.out.println(finalList);
    }
}
