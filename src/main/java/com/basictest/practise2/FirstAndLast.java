package com.basictest.practise2;

import lombok.extern.log4j.Log4j2;

import java.util.HashMap;
import java.util.Map;

@Log4j2
public class FirstAndLast {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 5, 7, 8, 1, 2};
        Map<Integer, Integer> firstMap = new HashMap<>();
        Map<Integer, Integer> lastMap = new HashMap<>();

        for(int i=0; i<list.length; i++){
            if(!firstMap.containsKey(list[i])){
                firstMap.put(list[i], i);
            }
            lastMap.put(list[i], i);
        }

        log.info("the first map is {}", firstMap);
        log.info("the last map is {}", lastMap);
    }
}
