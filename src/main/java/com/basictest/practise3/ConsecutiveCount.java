package com.basictest.practise3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ConsecutiveCount {
    public static void main(String[] args) {
        String a = "Amazon is a great company as it has AtoooZzz";

        Map<Character, Integer> map = new HashMap<>();

        List<Character> test = new String(a.toCharArray()).chars()
                .mapToObj(i -> (char) i)
                .filter(x -> !x.equals(' ') && !x.equals(',')).toList();
        int count;
        for (int i = 0; i < test.size(); i++) {
            count = 1;
            for (int j = i + 1; j < test.size(); j++) {
                if (test.get(i).equals(test.get(j))) {
                    count++;
                }else {
                    break;
                }
            }

            if (map.containsKey(test.get(i))) {
                if (map.get(test.get(i)) < count) {
                    map.put(test.get(i), count);
                }
            } else {
                map.put(test.get(i), count);
            }
        }
    List<Map.Entry<Character, Integer>>  mapList =  map.entrySet().stream().sorted((x1, x2) -> {
            if(!Objects.equals(x1.getValue(), x2.getValue())){
                return (x2.getValue() - x1.getValue());
            }else {
                return x1.getKey().compareTo(x2.getKey());
            }
        }).toList();

        System.out.println(mapList);
    }
}
