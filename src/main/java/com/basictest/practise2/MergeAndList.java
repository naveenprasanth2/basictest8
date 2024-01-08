package com.basictest.practise2;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Log4j2
public class MergeAndList {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 11, 15};
        int[] b = {2, 5, 10};

        List<Integer> test = Stream.of(a, b).flatMapToInt(Arrays::stream).boxed().sorted().toList();
        log.info(test);
    }
}
