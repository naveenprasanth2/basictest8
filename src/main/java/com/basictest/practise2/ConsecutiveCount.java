package com.basictest.practise2;

import lombok.extern.log4j.Log4j2;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

@Log4j2
public class ConsecutiveCount {

    public static void main(String[] args) {
        String a = "AAmazon is a great companyy as it has AtoooZzz";

        List<String> originalList = Stream.of(a.replaceAll("\\s", "").split("")).toList();

        HashMap<String, Integer> finalMap = new HashMap<>();
        int count;

        for (int i = 0; i < originalList.size(); i++) {
            count = 1;
            for (int j = i + 1; j < originalList.size() - 1; j++) {
                if (originalList.get(i).equals(originalList.get(j))) {
                    count++;
                } else {
                    break;
                }
            }
            if (finalMap.containsKey(originalList.get(i))) {
                if (finalMap.get(originalList.get(i)) < count) {
                    finalMap.put(originalList.get(i), count);
                }
            } else {
                finalMap.put(originalList.get(i), count);
            }
        }
        log.info(finalMap);

        finalMap.entrySet().stream().min((x1, x2) -> {
            if (!Objects.equals(x1.getValue(), x2.getValue())) {
                return (x2.getValue() - x1.getValue());
            } else {
                return x1.getKey().compareTo(x2.getKey());
            }
        }).ifPresent(log::info);
    }
}
