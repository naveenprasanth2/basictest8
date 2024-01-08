package com.basictest.practise4;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ConsecutiveCount {
    public static void main(String[] args) {
        String a = "Amazzzzzzzon is a great company as it has AtoooZzz";

        List<Character> charList = Stream.of(a.replaceAll("\\s", "").split(""))
                .map(x -> new String(x.toCharArray()).chars().mapToObj(i -> (char) i).toList())
                .flatMap(Collection::stream).toList();
        Map<Character, Integer> test = new HashMap<>();
        int count;
        for (int i = 0; i < charList.size(); i++) {
            count = 1;
            for (int j = i + 1; j < charList.size(); j++) {
                if (charList.get(i).equals(charList.get(j))) {
                    count++;
                }else {
                    break;
                }
            }
            if (test.containsKey(charList.get(i))) {
                test.put(charList.get(i), test.get(charList.get(i)) < count ? count : test.get(charList.get(i)));
            } else {
                test.put(charList.get(i), count);
            }
        }
        System.out.println(test);
    }
}
