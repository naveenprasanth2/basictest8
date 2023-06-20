package com.basictest.practise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestInteger {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 1};
        int rotate = 3;

        List<Integer> real = new ArrayList<>(Arrays.stream(a).boxed().toList());

        for (int i = 0; i < rotate; i++) {
            real.add(0, real.get(real.size() - (i+1)));
        }

        List<Integer> tempList = real.subList(0, real.size() - (rotate));

        Integer min = tempList.stream().min(Integer::compareTo).orElseThrow();

        System.out.println(tempList.indexOf(min));

    }
}
