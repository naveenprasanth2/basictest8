package com.basictest.practise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSubset {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 11, 15, 17, 19};
        List<Integer> test = Arrays.stream(a).boxed().toList();
        List<Integer> result = new ArrayList<>();
        int subset = 3;

        for (int i=0; i<test.size(); i+=subset){
            ArrayList<Integer> tempList = new ArrayList<>(test.subList(i, i+subset));
            Collections.reverse(tempList);
            result.addAll(tempList);
        }

        System.out.println(result);
    }
}
