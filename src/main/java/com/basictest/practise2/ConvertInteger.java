package com.basictest.practise2;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.List;

@Log4j2
public class ConvertInteger {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};

        List<Integer> test = Arrays.stream(a).boxed().toList();

        log.info(test);
    }
}
