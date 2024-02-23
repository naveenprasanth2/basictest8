package com.basictest.practise4;

import java.util.List;
import java.util.regex.Pattern;

public class FindSequence {
    public static void main(String[] args) {
        List<Object> test = List.of(1, 2, 3, 5, "a", 6, 7, 8, 4, "@", -5, -7, -3, -2, -1);

        List<Integer> data = test.stream()
                .filter(x -> !Pattern.matches("[a-zA-Z@#$%^&*)(/?]", x.toString())).mapToInt(x -> Integer.parseInt(x.toString()))
                .boxed().toList();

        for (int i = 0; i < data.size(); i++) {
            for (int j = i + 1; j < data.size(); j++) {
                System.out.println();
            }
        }
    }
}
