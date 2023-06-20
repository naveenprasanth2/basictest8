package com.basictest.practise1;

import java.util.List;

public class CharacterConvert {
    public static void main(String[] args) {
        char[] a = {'a', 's', 'l'};

        List<Character> test = new String(a).chars().mapToObj(i -> (char) i).toList();
        System.out.println(test);
    }
}
