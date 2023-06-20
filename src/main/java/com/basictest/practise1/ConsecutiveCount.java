package com.basictest.practise1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public class ConsecutiveCount {
    public static void main(String[] args) {
        String a = "Amazon is a great company as it has AtoooZzz";

        List<String> values = Stream.of(a.replaceAll("\\s", "").split("")).toList();
        HashMap<String, Integer> finalMap = new HashMap<>();
        for (int i = 0; i < values.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < values.size(); j++) {
                if (values.get(i).equals(values.get(j))) {
                    count++;
                } else {
                    break;
                }
            }

            if (!finalMap.containsKey(values.get(i)) || finalMap.get(values.get(i)) < count) {
                finalMap.put(values.get(i), count);
            }

        }

        List<Map.Entry<String, Integer>> test = finalMap.entrySet().stream().sorted((x1, x2) -> {
            if (!Objects.equals(x2.getValue(), x1.getValue())) {
                return x2.getValue() - x1.getValue();
            } else {
                return x1.getKey().compareTo(x2.getKey());
            }
        }).toList();

        System.out.println(test.stream().skip(1).findFirst().orElseThrow());
    }
}
