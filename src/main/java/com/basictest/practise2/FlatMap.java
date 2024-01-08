package com.basictest.practise2;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Log4j2
public class FlatMap {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {7, 8, 9, 0, 1};

        List<Integer> test = Stream.of(a, b).flatMapToInt(x -> Arrays.stream(a)).boxed().toList();

        log.info(test);
    }
}
