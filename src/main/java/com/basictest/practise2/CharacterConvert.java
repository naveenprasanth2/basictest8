package com.basictest.practise2;

import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class CharacterConvert {
    public static void main(String[] args) {
        char[] a = {'a', 's', 'l'};

        List<Character> test = new String(a).chars().mapToObj(i -> (char) i).toList();
        log.info(test);
    }
}
