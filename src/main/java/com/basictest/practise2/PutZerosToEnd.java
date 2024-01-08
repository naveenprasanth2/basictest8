package com.basictest.practise2;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Log4j2
public class PutZerosToEnd {
    public static void main(String[] args) {
        int[] a = {2, 3, 0, 0, 5, 0, 8};
        List<Integer> test = new ArrayList<>();
        int count = (int) Arrays.stream(a).boxed().filter(x -> x==0).count();
        Arrays.stream(a).boxed().filter(x -> x!=0).forEach(test::add);

        IntStream.rangeClosed(1, count).forEach(x -> test.add(0));

        log.info(test);
    }
}
